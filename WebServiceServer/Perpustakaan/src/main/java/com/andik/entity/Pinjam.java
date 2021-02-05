/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andik.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author akunf
 */
@Entity
@Table(name = "pinjam")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pinjam.findAll", query = "SELECT p FROM Pinjam p"),
    @NamedQuery(name = "Pinjam.findByIdPinjam", query = "SELECT p FROM Pinjam p WHERE p.idPinjam = :idPinjam"),
    @NamedQuery(name = "Pinjam.findByIdAnggota", query = "SELECT p FROM Pinjam p WHERE p.idAnggota = :idAnggota"),
    @NamedQuery(name = "Pinjam.findByIdBuku", query = "SELECT p FROM Pinjam p WHERE p.idBuku = :idBuku"),
    @NamedQuery(name = "Pinjam.findByTglPinjam", query = "SELECT p FROM Pinjam p WHERE p.tglPinjam = :tglPinjam"),
    @NamedQuery(name = "Pinjam.findByTglKembali", query = "SELECT p FROM Pinjam p WHERE p.tglKembali = :tglKembali")})
public class Pinjam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pinjam")
    private Integer idPinjam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "id_anggota")
    private String idAnggota;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "id_buku")
    private String idBuku;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "tgl_pinjam")
    private String tglPinjam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "tgl_kembali")
    private String tglKembali;

    public Pinjam() {
    }

    public Pinjam(Integer idPinjam) {
        this.idPinjam = idPinjam;
    }

    public Pinjam( String idAnggota, String idBuku, String tglPinjam, String tglKembali) {
        this.idAnggota = idAnggota;
        this.idBuku = idBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }
    
    public Pinjam(Integer idPinjam, String idAnggota, String idBuku, String tglPinjam, String tglKembali) {
        this.idPinjam = idPinjam;
        this.idAnggota = idAnggota;
        this.idBuku = idBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public Integer getIdPinjam() {
        return idPinjam;
    }

    public void setIdPinjam(Integer idPinjam) {
        this.idPinjam = idPinjam;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPinjam != null ? idPinjam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pinjam)) {
            return false;
        }
        Pinjam other = (Pinjam) object;
        if ((this.idPinjam == null && other.idPinjam != null) || (this.idPinjam != null && !this.idPinjam.equals(other.idPinjam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.andik.entity.Pinjam[ idPinjam=" + idPinjam + " ]";
    }
    
}
