package ru.ivozklyakov.springBoot.dao.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnum;


public interface TaxEnumRepo extends JpaRepository<TaxEnum, Long> {

    Page<TaxEnum> findAll(Pageable pageable);

    @Query("select t from TaxEnum t where t.enumSysName like :s")
    Page<TaxEnum> findBySysName(@Param(value = "s") String sysName);
}
