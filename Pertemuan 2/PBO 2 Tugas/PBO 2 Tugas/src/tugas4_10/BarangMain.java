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
public class BarangMain {
    public static void main(String[] args) {
        Barang[]brg=new Barang[10];
        brg[1]=new Barang("00JB168","Flashdisk",80000, (float) 0.05);
        brg[2]=new Barang("00JB069","Mouse",320000, (float) 0.2);
        brg[3]=new Barang("00JB420","Harddisk",800000, (float) 0.3);
        System.out.println("Barang 1");
        brg[1].tampilData();
        System.out.println("------------------------");
        System.out.println("Barang 2");
        brg[2].tampilData();
        System.out.println("------------------------");
        System.out.println("Barang 3");
        brg[3].tampilData();
    }
}
