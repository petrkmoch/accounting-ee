package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


import javax.persistence.*;


@Entity
@Table(name="gl_account")
public class GlAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "ACCT_NO",unique = true)
    private String acctNo;

    @Column(name = "DESCRIPTION")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "GL_ACCOUNT_TYPE")
    private GlAccountType glAccountType;

    @JsonGetter
    public Long getId() {
        return id;
    }

    @JsonSetter
    public void setId(Long id) {
        this.id = id;
    }

    @JsonGetter
    public String getAcctNo() {
        return acctNo;
    }

    @JsonSetter
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    @JsonGetter
    public String getDescription() {
        return description;
    }

    @JsonSetter
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonGetter
    public GlAccountType getGlAccountType() {
        return glAccountType;
    }

    @JsonSetter
    public void setGlAccountType(GlAccountType glAccountType) {
        this.glAccountType = glAccountType;
    }
}

