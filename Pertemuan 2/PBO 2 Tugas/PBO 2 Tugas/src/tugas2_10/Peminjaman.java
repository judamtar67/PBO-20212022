/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_10;

/**
 *
 * @author Asus-PC
 */
public class Peminjaman {
    String id,namaMember,namaGame;
    int harga,lamaSewa;
    int hargaBayar(){
        int bayar=harga*lamaSewa;
        return bayar;
    }
    public void cetakData(){
        System.out.println("ID          : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Game        : "+namaGame);
        System.out.println("Lama Sewa   : "+lamaSewa+" hari");
        System.out.println("Total Harga : Rp."+hargaBayar());
    }
}
