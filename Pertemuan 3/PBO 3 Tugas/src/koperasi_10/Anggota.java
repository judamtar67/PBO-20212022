/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi_10;

/**
 *
 * @author Asus-PC
 */
public class Anggota {
    private String Nama,nomorKTP;
    private int limitPinjaman,jumlahPinjaman;
    Anggota(String nomorKTP,String Nama, int limitPinjaman){
        this.nomorKTP=nomorKTP;
        this.Nama=Nama;
        this.limitPinjaman=limitPinjaman;
    }

    public String getNama() {
        return Nama;
    }
    public String getNomorKTP() {
        return nomorKTP;
    }
    public int getLimitPinjaman() {
        return limitPinjaman;
    }
    public int pinjam(int jumlahPinjam){
        jumlahPinjaman+=jumlahPinjam;
        if(jumlahPinjaman>getLimitPinjaman()){
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
            jumlahPinjaman-=jumlahPinjam;
        }
        return jumlahPinjaman;
    }
    public int angsur(int jumlahAngsur){
        jumlahPinjaman-=jumlahAngsur;
        if(jumlahAngsur<(0.1*jumlahPinjaman)){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            jumlahPinjaman+=jumlahAngsur;
        }
        return jumlahPinjaman;
    }
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
    
}
