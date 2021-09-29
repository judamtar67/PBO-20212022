/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Turnamen;

/**
 *
 * @author Asus-PC
 */
public class Pengawas {
    private String nama;
    private int umur;
    public Pengawas(){
        
    }

    public Pengawas(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public String info(){
        String info="";
        info+=this.nama+", "+this.umur+" tahun.\n";
        return info;
    }
}
