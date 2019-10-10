package ru.ivozklyakov.springBoot.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.ivozklyakov.springBoot.dao.dto.OperationDto;
import ru.ivozklyakov.springBoot.dao.repository.OperationRepo2;

@Service
public class OperationService {
    @Autowired
    private OperationRepo2 operationRepo2;

    public Page<OperationDto> getCorpAct(Pageable pageable) {
        return operationRepo2.findCorpActAll(pageable);
    }
}
