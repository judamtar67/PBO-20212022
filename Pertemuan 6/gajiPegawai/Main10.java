package gajiPegawai;
public class Main10 {
    public static void main(String[] args) {
        DaftarGaji10 gaji=new DaftarGaji10(10);
        Pegawai10 pgw1,pgw2;
        pgw1=new Pegawai10("30143","Jud","Jl. Merpati");
        pgw2=new Pegawai10("30250","Amal","Jl. Merak");
        Dosen10 dsn=new Dosen10("30233","Mukhtar","Jl. Pinguin");
        dsn.setSKS(7);
        gaji.addPegawai(pgw1);
        gaji.addPegawai(pgw2);
        gaji.addPegawai(dsn);
        gaji.printSemuaGaji();
    }
}
