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
public class Main {
    public static void main(String[] args) {
        Panitia pnt=new Panitia("Park Mujin","Presiden Direktur",7);
        Peserta pst1=new Peserta("Jin Mori",17);
        Peserta pst2=new Peserta("Han Daewi",20);
        Peserta pst3=new Peserta("Yoo Mira",18);
        Pengawas pws=new Pengawas("Eksekutif Q",28);
        pnt.setTurnamen(pst1, 3);
        pnt.setTurnamen(pst2, 3);
        pnt.setTurnamen(pst3, 3);
        pnt.setPengawasTurnamen(pws, 3);
        System.out.println(pnt.info());
    }
}
