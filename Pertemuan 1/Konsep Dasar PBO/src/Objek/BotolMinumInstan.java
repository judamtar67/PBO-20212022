package Objek;

public class BotolMinumInstan extends BotolMinum {
    private boolean air=true;
    public void minumAir(){
        air=false;
    }
    public void cetakInfo(){
        super.cetakInfo();
        if(air==true){
            System.out.println("Isi botol : ada");
        }else{
            System.out.println("Isi botol : habis");
            System.out.println("Botol telah dibuang!");
        }
    }
}
