package ru.ivozklyakov.springBoot.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TAX_CORPACTION")
public class CorpAction {

    @Id
    @Column(name ="CORPACTIONID")
    private Long corpActionId;
    @Column(name ="BASEOPERID")
    private Long BASEOPERID;
    @Column(name ="CORPACTNUMBER")
    private String number;
    @Column(name ="CORPACTIONKINDID")
    private Long kindId;
    @Column(name ="CORPACTIONTYPEID")
    private Long typeId;
    @Column(name ="PLANDATE")
    private BigDecimal planeDate;
    @Column(name ="SECURITYID")
    private Long securityId;
    @Column(name ="QUANTITY")
    private BigDecimal qnt;
    @Column(name ="CONTRACTID")
    private Long contractId;
    @Column(name ="SECPORTFOLIOID")
    private Long secPortfolioId;
    @Column(name ="CORPACTIONDATE")
    private BigDecimal corpActionDate;
    @Column(name ="DESCRIPTION")
    private String description;
    @Column(name ="NOMCURRENCYID")
    private Long nomCurrencyId;
    @Column(name ="PROCESSQUANTITY")
    private BigDecimal processQnt;

    public CorpAction() {
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BASEOPERID", insertable = false, updatable = false)
    private BaseOperation baseOperation;

    public BaseOperation getBaseOperation() {
        return baseOperation;
    }

    public Long getCorpActionId() {
        return corpActionId;
    }

    public void setCorpActionId(Long corpActionId) {
        this.corpActionId = corpActionId;
    }

    public Long getBaseOperId() {
        return BASEOPERID;
    }

    public void setBaseOperId(Long baseOperId) {
        this.BASEOPERID = baseOperId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getKindId() {
        return kindId;
    }

    public void setKindId(Long kindId) {
        this.kindId = kindId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public BigDecimal getPlaneDate() {
        return planeDate;
    }

    public void setPlaneDate(BigDecimal planeDate) {
        this.planeDate = planeDate;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public BigDecimal getQnt() {
        return qnt;
    }

    public void setQnt(BigDecimal qnt) {
        this.qnt = qnt;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Long getSecPortfolioId() {
        return secPortfolioId;
    }

    public void setSecPortfolioId(Long secPortfolioId) {
        this.secPortfolioId = secPortfolioId;
    }

    public BigDecimal getCorpActionDate() {
        return corpActionDate;
    }

    public void setCorpActionDate(BigDecimal corpActionDate) {
        this.corpActionDate = corpActionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getNomCurrencyId() {
        return nomCurrencyId;
    }

    public void setNomCurrencyId(Long nomCurrencyId) {
        this.nomCurrencyId = nomCurrencyId;
    }

    public BigDecimal getProcessQnt() {
        return processQnt;
    }

    public void setProcessQnt(BigDecimal processQnt) {
        this.processQnt = processQnt;
    }
}
