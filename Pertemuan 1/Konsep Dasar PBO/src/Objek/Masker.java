package Objek;

public class Masker {
    private String warna;
    private int panjang;
    public void setPanjang(int p){
        panjang=p;
    }
    public void setWarna(String w){
        warna=w;
    }
    public void cetakInfo(){
        System.out.println("Masker");
        System.out.println("Warna : "+warna);
        System.out.println("Panjang : "+panjang+" cm");
    }
}
