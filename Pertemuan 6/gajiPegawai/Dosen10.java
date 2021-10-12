package gajiPegawai;
public class Dosen10 extends Pegawai10{
    private int jumlahSKS,TARIF_SKS=500000;
    public Dosen10(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    @Override
    public int getGaji() {
        int gaji=jumlahSKS*TARIF_SKS;
        return gaji;
    }
}
