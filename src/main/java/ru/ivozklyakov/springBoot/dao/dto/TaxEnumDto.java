package ru.ivozklyakov.springBoot.dao.dto;

import ru.ivozklyakov.springBoot.dao.entity.TaxEnum;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnumLng;

public class TaxEnumDto {

    private Long id;
    private String enumSysName;
    private String sysName;
    private Integer ordinal;
    private String locale;
    private String name;
    private String description;

    public TaxEnumDto(TaxEnumLng taxEnumLng, TaxEnum taxEnum) {
        this.id             = taxEnum.getId();
        this.enumSysName    = taxEnum.getEnumSysName();
        this.sysName        = taxEnum.getSysName();
        this.ordinal        = taxEnum.getOrdinal();
        this.locale         = taxEnumLng.getLocale();
        this.name           = taxEnumLng.getName();
        this.description    = taxEnumLng.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnumSysName() {
        return enumSysName;
    }

    public void setEnumSysName(String enumSysName) {
        this.enumSysName = enumSysName;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
