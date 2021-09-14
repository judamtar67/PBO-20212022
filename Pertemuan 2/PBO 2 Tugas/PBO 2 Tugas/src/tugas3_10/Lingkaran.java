/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_10;

/**
 *
 * @author Asus-PC
 */
public class Lingkaran {
    double phi,r;
    double hitungLuas(){
        double luas=phi*r*r;
        return luas;
    }
    double hitungKeliling(){
        double keliling=phi*(r+r);
        return keliling;
    }
}
