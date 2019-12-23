package com.example.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface GlAccountService {


    @WebMethod
    public GlAccountSoap getGlAccountByAcctno(String acctno);

}
