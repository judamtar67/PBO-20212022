package overloading;
public class Main10 {
    public static void main(String[] args) {
        Segitiga10 sgt=new Segitiga10();
        System.out.println("Total Sudut 1 = "+sgt.totalSudut(130));
        System.out.println("Total Sudut 2 = "+sgt.totalSudut(60,30));
        System.out.println("Keliling Segitiga 1 = "+sgt.keliling(5, 5, 4));
        System.out.println("Keliling Segitiga 2 = "+sgt.keliling(12, 5));
    }
}
