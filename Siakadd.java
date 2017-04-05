/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siakadd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author TobiSan
 */
public class Siakadd {

    /**
     * @param args the command line arguments
     */
        //Mahasiswa q = new Mahasiswa();

  public HashMap<String, Mahasiswa> hmMhs = new HashMap<>();
    HashMap<String, matakuliah> hmMK = new HashMap<>();
    Mahasiswa mhs,mhs2,mhs3;
   
    public  Siakadd (){
       
        mhs = new Mahasiswa("14115029", "Tobi Santoso", "lampung-Tengah");
       
       ArrayList<mkKontrak> arr = new ArrayList <>();
       
       //mhs.arr.add(new mkKontrak ("IF129","Fisika dasar", 4, 1, "A"));
      // mhs.hmkontrak.put("1", arr);
       mhs.arr.add(new mkKontrak (new matakuliah("IF124","basdat", 3, 9), "A"));
       mhs.hmkontrak.put("4", arr);
       
       mhs.arr.add(new mkKontrak(new matakuliah("IF123","PBO",3,8),"A"));
       mhs.hmkontrak.put("4", arr);
       
       mhs.arr.add(new mkKontrak(new matakuliah("IF135","SO",4,0),"A"));
       mhs.hmkontrak.put("4", arr);
       hmMhs.put("14115029", mhs);
       
       mhs2 = new Mahasiswa("14115030", "Elvira", "Metro");
       mhs2.arr.add(new mkKontrak (new matakuliah("IF124","basdat", 3, 4), "AB"));
       mhs2.hmkontrak.put("4", arr);
       
       mhs2.arr.add(new mkKontrak(new matakuliah("IF123","PBO",3,2),"AB"));
       mhs2.hmkontrak.put("4", arr);
       
       mhs2.arr.add(new mkKontrak(new matakuliah("IF136","stigma",3,2),"AB"));
       mhs2.hmkontrak.put("4", arr);
       hmMhs.put("14115030", mhs2);
       
       
       mhs3 = new Mahasiswa("14115031", "Santoso", "Yokohama");
       mhs3.arr.add(new mkKontrak (new matakuliah("IF124","basdat", 3, 2), "A"));
       mhs3.hmkontrak.put("4", arr);
       
       mhs3.arr.add(new mkKontrak(new matakuliah("IF126","SO",3,4),"A"));
       mhs3.hmkontrak.put("4", arr);
       
       mhs3.arr.add(new mkKontrak(new matakuliah("IF137","TPBFO",3,1),"AB"));
       mhs3.hmkontrak.put("4", arr);
       
       hmMhs.put("14115031", mhs3);
       
       
   
   }
   
   
   
    
    void searching  (String nim)
    {
        for(String a:hmMhs.keySet()){ 
            if(nim.equals(a)){
                hmMhs.get(a).printTranskrip();
                System.out.println("ip :"+ hmMhs.get(a).hitungip());
               
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic her
            System.out.println("Cari nim :");
            Scanner g = new Scanner(System.in);
            String nimm = g.nextLine();
           new Siakadd().searching(nimm);
           
       
    }
    
}
