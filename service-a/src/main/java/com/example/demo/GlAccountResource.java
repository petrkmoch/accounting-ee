package com.example.demo;

import com.example.demo.entities.GlAccount;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/accounts")
@RequestScoped
public class GlAccountResource {

    @Inject
    private GlAcountDao glAcountDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<GlAccount> getAccountAll() {
        return glAcountDao.readAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response createNew(GlAccount glAccount) {
        return glAcountDao.createNew(glAccount);
    }
}
