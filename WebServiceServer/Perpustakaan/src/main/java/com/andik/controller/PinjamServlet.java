/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andik.controller;

import com.andik.entity.Buku;
import com.andik.entity.Pinjam;
import com.andik.model.BukuDao;
import com.andik.model.BukuDaoLocal;
import com.andik.model.PinjamDaoLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author akunf
 */
@WebServlet(name = "PinjamServlet", urlPatterns = {"/PinjamBuku"})
public class PinjamServlet extends HttpServlet {

    @EJB
    private PinjamDaoLocal pinjamDao;
    
    @EJB
    private BukuDaoLocal bukuDao;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "";
        String action = request.getParameter("action");
        
        if (action == null || action == "") {
            action = "";
        }
        
        if (action.equalsIgnoreCase("cari")) {
            url = "search.jsp";
        } else {
            url = "form.jsp";
        }
        request.getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idAnggota = request.getParameter("idanggota");
        String idBuku = request.getParameter("idbuku");
        String ambil = request.getParameter("pinjam");
        String kembali = request.getParameter("kembali");

        Buku buku = bukuDao.getBuku(idBuku);
        short stok = buku.getStok();
        short stokAkhir = (short) (stok - 1);
        Buku b = new Buku(buku.getIdBuku(), buku.getJudul(), buku.getPengarang(), buku.getTahunTerbit(), stokAkhir);
        bukuDao.updateStok(b);
        
        Pinjam pinjam = new Pinjam(idAnggota, idBuku, ambil, kembali);
        pinjamDao.addPinjam(pinjam);
        response.sendRedirect("PinjamBuku");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
