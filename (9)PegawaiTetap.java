package polimorfisme;

public class PegawaiTetap extends Pegawai {

    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public String toString() {
        return  
            "\nPegawai Tetap   : " + getNama() +
            "\nNo. KTP         : " + getNoKTP() +
            "\nUpah            : " + getUpah() +
            "\nPendapatan      : " + "Rp " + (int)getUpah();
    }
}
