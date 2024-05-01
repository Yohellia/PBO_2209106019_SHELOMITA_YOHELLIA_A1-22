public class KueBasah extends Kue {
    private String varianRasa;
    private String jenis;

    public KueBasah(String nama, int harga, int stok, String jenis, String varianRasa) {
        super(nama, harga, stok);
        this.setJenis(jenis);
        this.varianRasa = varianRasa;
    }

    @Override
    public String getJenis() {
        return "Basah"; 
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
        return super.toString() + "\nJenis\t: Basah" + "\nRasa\t: " + varianRasa;
    }
}