/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andik.perpustakaan.resources;

import com.andik.entity.Buku;
import com.andik.model.BukuDaoLocal;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author akunf
 */
@Path("Buku")
public class BukuService {
    
    @EJB
    private BukuDaoLocal bukuDaoLocal;
    
    @GET
    @Path("/buku/{idBuku}")
    @Produces(MediaType.APPLICATION_JSON) 
    public Buku getBuku(@PathParam("idBuku") String idBuku) {
        return bukuDaoLocal.getBuku(idBuku);
    }
}
