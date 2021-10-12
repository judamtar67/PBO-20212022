package gajiPegawai;
public class DaftarGaji10 {
    private Pegawai10 pegawai[];

    public DaftarGaji10(int pegawai) {
        this.pegawai=new Pegawai10[pegawai];
        this.initPegawai();
    }
    private void initPegawai(){
        for(int i=0;i<this.pegawai.length;i++){
            this.pegawai[i]=new Pegawai10(null,null,null);
        }
    }

    public void addPegawai(Pegawai10 pegawai) {
        for(int i=0;i<this.pegawai.length;i++){
            if(this.pegawai[i].getNama()==null){
                this.pegawai[i]=pegawai;
                break;
            }
        }
    }
    
    public void printSemuaGaji(){
        for (Pegawai10 pegawai1 : this.pegawai) {
            if (pegawai1.getNama() != null) {
                System.out.println("Nama Pegawai : " + pegawai1.getNama());
                System.out.println("Gaji         : " + pegawai1.getGaji() + "\n");
            }
        }
    }
}
