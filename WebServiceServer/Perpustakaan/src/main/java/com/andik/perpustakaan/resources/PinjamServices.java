/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andik.perpustakaan.resources;

import com.andik.entity.Buku;
import com.andik.entity.Pinjam;
import com.andik.model.BukuDaoLocal;
import com.andik.model.PinjamDaoLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author akunf
 */
@Path("Pinjam")
public class PinjamServices {
    
    @EJB
    private PinjamDaoLocal  pinjamDaoLocal;
    
    @EJB
    private BukuDaoLocal  bukuDao;
    
    @POST
    @Path("/pinjam")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Pinjam addPinjam(@FormParam("idAnggota") String idAnggota, 
            @FormParam("idBuku") String idBuku, 
            @FormParam("mulai") String mulai, 
            @FormParam("kembali") String kembali) {
        
        Buku buku = bukuDao.getBuku(idBuku);
        short stok = buku.getStok();
        short stokAkhir = (short) (stok - 1);
        Buku b = new Buku(buku.getIdBuku(), buku.getJudul(), buku.getPengarang(), buku.getTahunTerbit(), stokAkhir);
        bukuDao.updateStok(b);
        
        Pinjam pinjam = new Pinjam(idAnggota, idBuku, mulai, kembali);
        pinjamDaoLocal.addPinjam(pinjam);
        return pinjam;
    }
}
