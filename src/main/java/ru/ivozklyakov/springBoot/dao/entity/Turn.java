package ru.ivozklyakov.springBoot.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "TAX_TURN")
public class Turn {

    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "REGISTERID")
    private Long registerId;
    @Column(name = "TURNVALUE")
    private BigDecimal value;
    @Column(name = "TURNDATE")
    private BigDecimal tdate;
    @Column(name = "TURNTIME")
    private BigDecimal ttime;
    @Column(name = "OBJECTID")
    private Long objectId;
    @Column(name = "OBJECTTYPEID")
    private Long objectTypeId;
    @Column(name = "REGEXPLANATION")
    private Integer regExplanation;

    public Turn() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Long registerId) {
        this.registerId = registerId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getTdate() {
        return tdate;
    }

    public void setTdate(BigDecimal tdate) {
        this.tdate = tdate;
    }

    public BigDecimal getTtime() {
        return ttime;
    }

    public void setTtime(BigDecimal ttime) {
        this.ttime = ttime;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(Long objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public Integer getRegExplanation() {
        return regExplanation;
    }

    public void setRegExplanation(Integer regExplanation) {
        this.regExplanation = regExplanation;
    }
}

