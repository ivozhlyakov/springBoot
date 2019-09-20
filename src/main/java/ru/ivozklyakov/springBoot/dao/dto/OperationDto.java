package ru.ivozklyakov.springBoot.dao.dto;

import ru.ivozklyakov.springBoot.dao.entity.BaseOperation;
import ru.ivozklyakov.springBoot.dao.entity.CorpAction;

public class OperationDto {
    private Long id;
    private String number;
    private String type;

    public OperationDto(Long id, String num , String type) {
        this.id = id;
        this.number = num;
        this.type = type;
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
