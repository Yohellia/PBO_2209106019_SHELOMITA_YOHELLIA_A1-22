package POSTTEST4;

public class KueBasah extends Kue{
    private String jenisBasah;
    private String varianRasa;

    public KueBasah(String nama, int harga, int stok, String jenisBasah, String varianRasa) {
        super(nama, harga, stok);
        this.jenisBasah = jenisBasah;
        this.varianRasa = varianRasa;
    }

    public String getJenisBasah() {
        return jenisBasah;
    }

    public void setJenisBasah(String jenisBasah) {
        this.jenisBasah = jenisBasah;
    }

    public String getVarianRasa() {
        return varianRasa;
    }

    public void setVarianRasa(String varianRasa) {
        this.varianRasa = varianRasa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJenis\t: Basah" + "\nRasa\t: " + varianRasa;
    }
}