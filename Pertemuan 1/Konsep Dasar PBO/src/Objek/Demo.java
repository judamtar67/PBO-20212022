package Objek;

public class Demo {

    public static void main(String[] args) {
        VacuumCleaner clean = new VacuumCleaner();
        Masker mask = new Masker();
        BotolMinumIsiUlang botol1 = new BotolMinumIsiUlang();
        BotolMinumInstan botol2 = new BotolMinumInstan();

        clean.setMerk("Electrolux");
        clean.setWarna("Kuning");
        clean.cetakInfo();
        System.out.println();
        mask.setPanjang(50);
        mask.setWarna("Hijau Tua");
        mask.cetakInfo();
        System.out.println();
        botol1.setMerk("Tupperware");
        botol1.setWarna("Kuning");
        botol1.isiAir();
        botol1.cetakInfo();
        System.out.println();
        botol2.setMerk("Club");
        botol2.setWarna("Biru Muda");
        botol2.minumAir();
        botol2.cetakInfo();
        System.out.println();
    }
}
