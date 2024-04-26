public class KueKering extends Kue {
    private String jenisKering;
    private String varianRasa;

    public KueKering(String nama, int harga, int stok, String jenisKering, String varianRasa) {
        super(nama, harga, stok);
        this.jenisKering = jenisKering;
        this.varianRasa = varianRasa;
    }

    public String getJenis() {
        return "Kering"; // Mengimplementasikan metode abstrak getJenis()
    }
    
    public String getJenisKering() {
        return jenisKering;
    }

    public void setJenisKering(String jenisKering) {
        this.jenisKering = jenisKering;
    }

    public String getVarianRasa() {
        return varianRasa;
    }

    public void setVarianRasa(String varianRasa) {
        this.varianRasa = varianRasa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJenis\t: Kering" + "\nRasa\t: " + varianRasa;
    }
}