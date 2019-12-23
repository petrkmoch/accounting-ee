package com.example.demo.ws;

import java.io.Serializable;

public class GlAccountSoap implements Serializable {

    public GlAccountSoap() {
    }

    public GlAccountSoap(Long id, String acctno, String description) {
        this.id = id;
        this.acctno = acctno;
        this.description = description;
    }

    private Long id;
    private String acctno;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
