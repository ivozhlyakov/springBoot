package ru.ivozklyakov.springBoot.dao.entity;

import javax.persistence.*;

@Entity
@IdClass(TaxEnumLngId.class)
@Table(name = "TAX_ENUMLNG")
public class TaxEnumLng {

    @Id
    @Column(name = "ID")
    private Long id;

    @Id
    @Column(name = "LOCALE")
    private String locale;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    public TaxEnumLng() {
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private TaxEnum taxEnum;

    public TaxEnum getTaxEnum() {
        return taxEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
