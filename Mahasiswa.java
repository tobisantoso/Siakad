/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siakadd;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author TobiSan
 */
public class Mahasiswa {

    //public Mahasiswa(String string, String kamal, String lampung, String par) {
    //}
    
    private String nim;
    private String nama, asalProp;
    private int IPK;
    public ArrayList<mkKontrak> arr = new ArrayList<mkKontrak>(); 
    public HashMap<String, ArrayList<mkKontrak>> hmkontrak = new HashMap<String, ArrayList<mkKontrak>>();
    public Mahasiswa (String nim, String nama, String asalProp){
            this.nim = nim;
            this.nama = nama;
            this.asalProp = asalProp;
            
    }
    
  public Mahasiswa(){}
    
    public double hitungip(){
        double temp = 0, sk= 0;
        for(String sem:hmkontrak.keySet()){
                
            for( int i = 0; i<arr.size(); i++){
                    mkKontrak mkk = arr.get(i);
                    temp += convert(mkk.nilai)*mkk.mk.sks;
                        sk += mkk.mk.sks;
            }
        }
        
                return (temp/sk);
    }
    
    public double convert(String x){
        double h;
          if(x.equals("A")){
                h = 4;
          }
          else if(x.equals("AB")){
                h = 3.5;
          }
          else if(x.equals("B")){
                h = 3;
          }
          else if(x.equals("BC")){
                h = 2.5;
          }
          else if(x.equals("C")){
                h = 2;
          }
          else if(x.equals("D")){
                h = 1;
          }
          else{
                h = 0;
          }
          
          return h;
    }
    
    
    public void printTranskrip(){
        for(String sem:hmkontrak.keySet()){
                       System.out.println(nama);
                    System.out.println("semester :"+sem);
            for( int i = 0; i<arr.size(); i++){
                    mkKontrak mkk = arr.get(i);
                    
          System.out.println("kode :"+mkk.mk.kode +" matkul: "+mkk.mk.nmk+" smester: "+mkk.mk.sem+" sks: "+mkk.mk.sks+" nilai: "+mkk.nilai);
            }
        }
        
    }
    
}
