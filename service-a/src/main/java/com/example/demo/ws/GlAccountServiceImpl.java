package com.example.demo.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.demo.ws.GlAccountService")
public class GlAccountServiceImpl implements GlAccountService {
    @Override
    public GlAccountSoap getGlAccountByAcctno(String acctno) {
        return new GlAccountSoap(1L, "221100", "Bank account");
    }
}
