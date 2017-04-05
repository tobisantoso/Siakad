/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this templatea file, choose Tools | Templates
 * and open the template in the editor.
 */
package siakadd;

/**
 *
 * @author TobiSan
 */
public class mkKontrak {
    public String nilai;
    
    matakuliah mk = new matakuliah();
    public mkKontrak(matakuliah mk, String nilai){
              this.mk.kode = mk.kode;
              this.mk.nmk = mk.nmk;
              this.mk.sem = mk.sem;
              this.mk.sks = mk.sks;
            this.nilai = nilai;
    }
}
