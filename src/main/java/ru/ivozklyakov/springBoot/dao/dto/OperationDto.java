package ru.ivozklyakov.springBoot.dao.dto;

import ru.ivozklyakov.springBoot.dao.entity.CorpAction;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnum;

public class OperationDto {
    private Long id;
    private String number;
    private String type;

    public OperationDto(CorpAction corpAction, TaxEnum taxEnum) {
        this.id = corpAction.getBaseOperId();
        this.number = corpAction.getNumber();
        this.type = taxEnum.getSysName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
