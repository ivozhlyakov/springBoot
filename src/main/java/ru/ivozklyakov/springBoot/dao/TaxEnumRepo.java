package ru.ivozklyakov.springBoot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnum;

@Repository
public interface TaxEnumRepo extends CrudRepository<TaxEnum, Long> {
}
