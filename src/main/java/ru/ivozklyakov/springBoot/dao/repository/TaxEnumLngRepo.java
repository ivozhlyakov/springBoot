package ru.ivozklyakov.springBoot.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.ivozklyakov.springBoot.dao.dto.TaxEnumDto;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnumLng;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnumLngId;

import java.util.List;

public interface TaxEnumLngRepo extends JpaRepository<TaxEnumLng, TaxEnumLngId> {

    @Query("select new ru.ivozklyakov.springBoot.dao.dto.TaxEnumDto(el, el.taxEnum) from TaxEnumLng el " +
            "inner join el.taxEnum " +
            "where  el.locale = :locale")
    List<TaxEnumDto> findAllLng(@Param(value = "locale") String locale);
}
