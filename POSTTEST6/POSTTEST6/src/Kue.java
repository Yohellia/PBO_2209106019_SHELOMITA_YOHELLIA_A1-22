abstract class Kue {
    final private String nama;
    final private int harga;
    final private int stok;
    
    public Kue(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public final String getNama() {
        return nama;
    }

    public final int getHarga() {
        return harga;
    }

    public final int getStok() {
        return stok;
    }

    public final void setHarga(int harga) {
    }

    public final void setStok(int stok) {
    }

    public abstract String getJenis();
    public abstract String getVarianRasa();
    public abstract void setJenis(String jenis);
    public abstract void setVarianRasa(String varianRasa);

    @Override
    public String toString() {
        return "\nNama\t: " + nama + "\nHarga\t: Rp. " + harga + "\nStok\t: " + stok;
    }
}
