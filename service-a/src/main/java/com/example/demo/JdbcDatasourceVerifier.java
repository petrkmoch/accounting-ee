package com.example.demo;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.List;

@ApplicationScoped
public class JdbcDatasourceVerifier {
//    @Resource(lookup = "jdbc/postgresql")
//    private DataSource dataSource;

    @PersistenceContext(unitName = "prod1")
    private EntityManager em;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) throws SQLException {
//        System.out.println("Verifying done!");
//        final DatabaseMetaData metaData = dataSource.getConnection().getMetaData();
//        System.out.println(metaData.getDatabaseProductName());
//        System.out.println("Version: " + metaData.getDatabaseMajorVersion() + "." + metaData.getDatabaseMinorVersion());
        List resultList = em.createQuery("select g from GlAccount g").getResultList();
        System.out.println("gl accounts number " + resultList.size());
    }



}