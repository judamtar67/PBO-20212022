/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4_10;

/**
 *
 * @author Asus-PC
 */
public class Barang {
    String kode,namaBarang;
    int hargaDasar;
    float diskon;
    Barang(String kode,String namaBarang,int hargaDasar,float diskon){
        this.kode=kode;
        this.namaBarang=namaBarang;
        this.hargaDasar=hargaDasar;
        this.diskon=diskon;
    }
    int hitungHargaJual(){
        int hargaJual=(int)(hargaDasar-(diskon*hargaDasar));
        return hargaJual;
    }
    public void tampilData(){
        System.out.println("Kode        : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga dasar : Rp."+hargaDasar);
        System.out.println("Diskon      : "+(int)(diskon*100)+"%");
        System.out.println("Harga Jual  : Rp."+hitungHargaJual());
    }
}
