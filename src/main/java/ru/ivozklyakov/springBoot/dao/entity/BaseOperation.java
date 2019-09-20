package ru.ivozklyakov.springBoot.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TAX_BASEOPERATION")
public class BaseOperation {

    @Id
    @Column(name = "BASEOPERID")
    private Long base_Oper_Id;
    @Column(name = "OPERTYPEID")
    private Long operTypeId;

    @Column(name = "EXTERNALID")
    private String externalId;
    @Column(name = "TAXID")
    private Long taxId;
    @Column(name = "CONTRBENIFIC")
    private Integer controlBenefic;
    @Column(name = "CONTROL")
    private Integer control;
    @Column(name = "CORRECTIONDATE")
    private BigDecimal correctionDate;
    @Column(name = "PARENTID")
    private Long parentId;
    @Column(name = "FICTIONAL")
    private Integer fictional;
    @Column(name = "DFI")
    private Integer dfi;

 /*   @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "base_Oper_Id", insertable = false, updatable = false)
    private CorpAction corpAction;

    public CorpAction getCorpAction() {
        return corpAction;
    }
*/
    public BaseOperation() {
    }

    public Long getBaseOperId() {
        return base_Oper_Id;
    }

    public void setBaseOperId(Long baseOperId) {
        this.base_Oper_Id = baseOperId;
    }

    public Long getOperTypeId() {
        return operTypeId;
    }

    public void setOperTypeId(Long operTypeId) {
        this.operTypeId = operTypeId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Long getTaxId() {
        return taxId;
    }

    public void setTaxId(Long taxId) {
        this.taxId = taxId;
    }

    public Integer getControlBenefic() {
        return controlBenefic;
    }

    public void setControlBenefic(Integer controlBenefic) {
        this.controlBenefic = controlBenefic;
    }

    public Integer getControl() {
        return control;
    }

    public void setControl(Integer control) {
        this.control = control;
    }

    public BigDecimal getCorrectionDate() {
        return correctionDate;
    }

    public void setCorrectionDate(BigDecimal correctionDate) {
        this.correctionDate = correctionDate;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getFictional() {
        return fictional;
    }

    public void setFictional(Integer fictional) {
        this.fictional = fictional;
    }

    public Integer getDfi() {
        return dfi;
    }

    public void setDfi(Integer dfi) {
        this.dfi = dfi;
    }
}

