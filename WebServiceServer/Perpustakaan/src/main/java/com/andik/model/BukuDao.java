/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andik.model;

import com.andik.entity.Buku;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author akunf
 */
@Stateless
public class BukuDao implements BukuDaoLocal {

    private EntityManager em;
    
    public BukuDao() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my_persistence");
        em = emf.createEntityManager();
    }
    
    @Override
    public Buku getBuku(String idBuku) {
        return em.find(Buku.class, idBuku);
    }

    @Override
    public void updateStok(Buku buku) {
        em.getTransaction().begin();
        em.merge(buku);
        em.getTransaction().commit();
    }
}
