package POSTTEST3;

public class KueKering extends Kue{
    private String jenisKering;

    public KueKering(String nama, int harga, int stok, String jenisKering) {
        super(nama, harga, stok);
        this.jenisKering = jenisKering;
    }

    public String getJenisKering() {
        return jenisKering;
    }

    public void setJenisKering(String jenisKering) {
        this.jenisKering = jenisKering;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJenis\t: Kering";
    }
}