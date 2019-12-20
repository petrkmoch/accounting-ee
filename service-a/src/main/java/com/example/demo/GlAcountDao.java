package com.example.demo;

import com.example.demo.entities.GlAccount;

import javax.enterprise.context.RequestScoped;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import java.util.List;

@Singleton
public class GlAcountDao {

    @PersistenceContext(name = "prod1")
    private EntityManager em;

    public List<GlAccount> readAll() {
        List resultList = em.createQuery("select g from GlAccount g").getResultList();
        System.out.println("gl accounts number " + resultList.size());
        return resultList;
    }


    public Response createNew (GlAccount glAccount) {
        //em.getTransaction().begin();
        em.persist(glAccount);
        //em.getTransaction().commit();
        return Response.ok().build();
    }


}
