/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi_10;
import java.util.Scanner;
/**
 *
 * @author Asus-PC
 */
public class TestKoperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner jud=new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(jud.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(jud.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("\nMembayar angsuran ");
        donny.angsur(jud.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("\nMembayar angsuran ");
        donny.angsur(jud.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }

}
