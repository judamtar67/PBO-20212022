package Objek;

public class BotolMinum {
    private String merk,warna;
    public void setMerk(String m){
        merk=m;
    }
    public void setWarna(String w){
        warna=w;
    }
    public void cetakInfo(){
        System.out.println("Botol Minum");
        System.out.println("Merk : "+merk);
        System.out.println("Warna : "+warna);
    }
}
