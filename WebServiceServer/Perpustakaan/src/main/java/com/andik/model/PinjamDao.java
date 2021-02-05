/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andik.model;

import com.andik.entity.Buku;
import com.andik.entity.Pinjam;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author akunf
 */
@Stateless
public class PinjamDao implements PinjamDaoLocal {

    private EntityManager em;
    
    public PinjamDao() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my_persistence");
        em = emf.createEntityManager();
    }

    @Override
    public void addPinjam(Pinjam pinjam) {
        em.getTransaction().begin();
        em.persist(pinjam);
        em.getTransaction().commit();
    }
}
