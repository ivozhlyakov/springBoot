package ru.ivozklyakov.springBoot.dao.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnum;
import ru.ivozklyakov.springBoot.dao.dto.TaxEnumDto;

import java.util.List;
import java.util.Map;

public interface TaxEnumRepo extends JpaRepository<TaxEnum, Long>

    {
        @Query("select t from TaxEnum t where t.sysName  = :sysName")
        List<TaxEnum> findBySysName(@Param(value = "sysName") String sysName);

        @Query("select t.sysName as sysname from TaxEnum t where t.enumSysName = 'OBJECT_TYPE' group by t.sysName")
        List<Map<String, String>> findOperType();

        @Query("select t from TaxEnum t where t.enumSysName  like :enumSysName")
        List<TaxEnum> findByEnumSysName(@Param(value = "enumSysName") String enumSysName);


/*
    Page<TaxEnum> findAll(Pageable pageable);

    @Query("select t from TaxEnum t where t.enumSysName like :s")
    Page<TaxEnum> findBySysName(@Param(value = "s") String sysName);
*/
}
