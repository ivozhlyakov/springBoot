package ru.ivozklyakov.springBoot.dao.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.ivozklyakov.springBoot.dao.dto.OperationDto;
import ru.ivozklyakov.springBoot.dao.entity.CorpAction;

public interface OperationRepo2 extends JpaRepository<CorpAction, Long> {

    @Query("select new ru.ivozklyakov.springBoot.dao.dto.OperationDto(ca, te) " +
            "from CorpAction ca " +
            "inner join ca.baseOperation bo " +
            "inner join ca.baseOperation.taxEnum te")
    Page<OperationDto> findCorpActAll(Pageable pageable);
}
