package ru.ivozklyakov.springBoot.dao.entity;

import javax.persistence.*;

@Entity(name = "TAX_ENUM")
public class TaxEnum {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ENUMSYSNAME")
    private String enumSysName;
    @Column(name = "SYSNAME")
    private String sysName;
    @Column(name = "ORDINAL")
    private Integer ordinal;

    public TaxEnum() {
    }

    public TaxEnum(String enumSysName, String sysName, Integer ordinal) {
        this.enumSysName = enumSysName;
        this.sysName = sysName;
        this.ordinal = ordinal;
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
}
