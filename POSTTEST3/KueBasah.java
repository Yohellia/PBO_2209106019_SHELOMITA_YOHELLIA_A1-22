package POSTTEST3;

public class KueBasah extends Kue{
    private String jenisBasah;

    public KueBasah(String nama, int harga, int stok, String jenisBasah) {
        super(nama, harga, stok);
        this.jenisBasah = jenisBasah;
    }

    public String getJenisBasah() {
        return jenisBasah;
    }

    public void setJenisBasah(String jenisBasah) {
        this.jenisBasah = jenisBasah;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJenis\t: Basah";
    }
}