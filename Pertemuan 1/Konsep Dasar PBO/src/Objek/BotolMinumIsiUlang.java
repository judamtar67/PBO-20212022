package Objek;

public class BotolMinumIsiUlang extends BotolMinum {
    private boolean air;
    public void isiAir(){
        air=true;
    }
    public void minumAir(){
        air=false;
    }
    public void cetakInfo(){
        super.cetakInfo();
        if(air==true){
            System.out.println("Isi botol : ada");
        }else{
            System.out.println("Isi botol : habis");
        }
    }
}
