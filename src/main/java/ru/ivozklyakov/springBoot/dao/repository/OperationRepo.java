package ru.ivozklyakov.springBoot.dao.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.ivozklyakov.springBoot.dao.dto.OperationDto;
import ru.ivozklyakov.springBoot.dao.entity.BaseOperation;

import java.util.List;
import java.util.Map;

public interface OperationRepo extends JpaRepository<BaseOperation, Long> {

    @Query(value = "select bo.baseoperid, ca.CORPACTNUMBER, en.sysName " +
            "from TAX_BASEOPERATION bo " +
            "inner join TAX_CORPACTION ca on bo.baseoperid = ca.baseoperid " +
            "inner join TAX_ENUM en on en.id = bo.operTypeId " +
            "where ca.CORPACTIONTYPEID in (2204, 2201, 2202) " +
            "and bo.operTypeId = 2109 " +
            "order by bo.baseoperid desc " +
            "\n-- #pageable"
            , countQuery = "select count(1) " +
                        "from TAX_BASEOPERATION bo " +
                        "inner join TAX_CORPACTION ca on bo.baseoperid = ca.baseoperid " +
                        "inner join TAX_ENUM en on en.id = bo.operTypeId " +
                        "where ca.CORPACTIONTYPEID in (2204, 2201, 2202) " +
                        "and bo.operTypeId = 2109"
            , nativeQuery = true

            )
    Page<Map> findCorpAct(Pageable pageable);
}
