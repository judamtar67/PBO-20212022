package overriding;
public class Main10 {
    public static void main(String[] args) {
        Manusia10 a=new Manusia10();
        Manusia10 b=new Dosen10();
        Manusia10 c=new Mahasiswa10();
        
        a.bernafas();
        a.makan();
        System.out.println();
        
        b.makan();
        Dosen10 b2=new Dosen10();
        b2.lembur();
        System.out.println();
        
        c.makan();
        Mahasiswa10 c2=new Mahasiswa10();
        c2.tidur();
    }
}
