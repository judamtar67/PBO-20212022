package gajiPegawai;
public class Pegawai10 {
    private String nip,nama,alamat;

    public Pegawai10(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }
    
    public int getGaji(){
        int gaji=nama.charAt(0)-'0';
        return gaji*100000;
    }
}
