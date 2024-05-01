public class KueKering extends Kue {
    private String varianRasa;
    private String jenis;

    public KueKering(String nama, int harga, int stok, String jenis, String varianRasa) {
        super(nama, harga, stok);
        this.setJenis(jenis);
        this.varianRasa = varianRasa;
    }

    @Override
    public String getJenis() {
        return "Kering";
    }

    @Override
    public String getVarianRasa() {
        return varianRasa;
    }

    @Override
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void setVarianRasa(String varianRasa) {
        this.varianRasa = varianRasa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJenis\t: Kering" + "\nRasa\t: " + varianRasa;
    }
}