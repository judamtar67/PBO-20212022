package overloading;
public class Segitiga10 {
    private int sudut;
    public int totalSudut(int sudutA){
        this.sudut=180-sudutA;
        return this.sudut;
    }
    public int totalSudut(int sudutA,int sudutB){
        this.sudut=180-(sudutA+sudutB);
        return this.sudut;
    }
    public int keliling(int sisiA,int sisiB,int sisiC){
        return sisiA+sisiB+sisiC;
    }
    public double keliling(int sisiA,int sisiB){
        double sisiC=Math.sqrt(Math.pow(sisiA,2)+Math.pow(sisiB,2));
        return sisiA+sisiB+sisiC;
    }
}
