/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_10;
import java.util.Scanner;

/**
 *
 * @author Asus-PC
 */
public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran lk=new Lingkaran();
        Scanner jud=new Scanner(System.in);
        System.out.println("SISTEM PENGHITUNGAN LUAS DAN KELILING LINGKARAN");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan jari-jari : ");
        lk.r=jud.nextDouble();
        lk.phi=3.14;
        System.out.println("|||||||||||||||||||||||||||||");
        System.out.printf("Luas Lingkaran = %.2f \n" , lk.hitungLuas());
        System.out.printf("Keliling Lingkaran = %.2f \n" , lk.hitungKeliling());
    }
    
}
