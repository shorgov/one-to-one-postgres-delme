package com.shorgov.dbtest.testpostgres;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class TheService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void doTheActualInsert(){
        Master m = new Master();
        m.setText("Text");
        Detail d = new Detail();
        d.setMaster(m);

        m.setDetail(d);

        entityManager.persist(d);
    }
}
