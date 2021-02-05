/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andik.model;

import com.andik.entity.Pinjam;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author akunf
 */
@Local
public interface PinjamDaoLocal {

    void addPinjam(Pinjam pinjam);
}
