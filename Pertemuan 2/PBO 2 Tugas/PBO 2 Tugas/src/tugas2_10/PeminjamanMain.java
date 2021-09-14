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
public class PeminjamanMain {
    public static void main(String[] args) {
        Peminjaman pmj=new Peminjaman();
        System.out.println("Toko Peminjaman Game");
        System.out.println("====================");
        pmj.id="JP021";
        pmj.namaMember="Jud Amal Mukhtar";
        pmj.namaGame="Follow Knight";
        pmj.harga=7000;
        pmj.lamaSewa=3;
        pmj.cetakData();
    }
}
