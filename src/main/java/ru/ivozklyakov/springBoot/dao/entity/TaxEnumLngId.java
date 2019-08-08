package ru.ivozklyakov.springBoot.dao.entity;

import java.io.Serializable;

public class TaxEnumLngId implements Serializable {

    private Long id;
    private String locale;

    public TaxEnumLngId() {
    }

    public TaxEnumLngId(Long id, String locale) {
        this.id = id;
        this.locale = locale;
    }
}
