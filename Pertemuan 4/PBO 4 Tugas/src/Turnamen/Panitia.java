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
public class Panitia {
    private String nama,jabatan;
    private Turnamen[] arrTurnamen;

    public Panitia(String nama, String jabatan,int jumlah) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.arrTurnamen=new Turnamen[jumlah];
        this.initTurnamen();
    }
    
    private void initTurnamen(){
        for(int i=0;i<arrTurnamen.length;i++){
            this.arrTurnamen[i]=new Turnamen(i+1);
        }
    }
    
    public void setTurnamen(Peserta peserta,int tim){
        arrTurnamen[tim-1].setPeserta(peserta);
    }
    
    public void setPengawasTurnamen(Pengawas pengawas,int tim){
        arrTurnamen[tim-1].setPengawas(pengawas);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public String info(){
        String info="";
        info+="======= Turnamen GOH =======\n\n";
        info+=this.nama+",\n sebagai "+this.jabatan+"\n\n";
        info+="T U R N A M E N\n";
        for(int i=0;i<arrTurnamen.length;i++){
            if(arrTurnamen[i].getPengawas()!=null){
                info+=arrTurnamen[i].info();
            }
        }
        return info;
    }
}
