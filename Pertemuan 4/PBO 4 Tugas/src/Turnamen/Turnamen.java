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
public class Turnamen {
    private int noTim;
    private Pengawas pengawas=new Pengawas();
    private Peserta[] arrPeserta=new Peserta[3];
    
    public Turnamen(int noTim) {
        this.noTim = noTim;
        for(int i=0;i<arrPeserta.length;i++){
            arrPeserta[i]=new Peserta();
        }
    }

    public int getNoTim() {
        return noTim;
    }

    public void setNoTim(int noTim) {
        this.noTim = noTim;
    }

    public void setPengawas(Pengawas pengawas) {
        this.pengawas = pengawas;
    }
    public String getPengawas(){
        return this.pengawas.getNama();
    }

    public void setPeserta(Peserta peserta) {
        for(int i=0;i<arrPeserta.length;i++){
            if(arrPeserta[i].getNama()==null){
                arrPeserta[i]=peserta;
                break;
            }
        }
    }
    
    public String info(){
        String info="";
        info+="------------------\n";
        info+="      Grup "+this.noTim+"\n";
        info+="------------------\n";
        info+="Pengawas = "+this.pengawas.info();
        info+="Peserta :\n";
        for(int i=0;i<arrPeserta.length;i++){
            int j=i;
            info+=(j+1)+". "+arrPeserta[i].info();
        }
        return info;
    }
}
