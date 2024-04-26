import java.util.ArrayList;

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
        // Tidak dapat diubah karena sudah final
    }

    public final void setStok(int stok) {
        // Tidak dapat diubah karena sudah final
    }

    // Method abstrak
    public abstract String getJenis();
    public abstract String getVarianRasa();

    @Override
    public String toString() {
        return "\nNama\t: " + nama + "\nHarga\t: Rp. " + harga + "\nStok\t: " + stok;
    }
}

abstract class DatabaseKue{
    final private ArrayList<Kue> daftarKue;

    public DatabaseKue() {
        daftarKue = new ArrayList<>();
    }

    public final void tambahKue(Kue kue) {
        daftarKue.add(kue);
        System.out.println("\nKue " + kue.getNama() + " berhasil ditambahkan.");
    }

    public final void lihatSemuaKue() {
        if (daftarKue.isEmpty()) {
            System.out.println("Tidak ada kue yang tersedia.");
        } else {
            for (Kue kue : daftarKue) {
                System.out.println(kue);
            }
        }
    }

    public final Kue cariKue(String nama) {
        for (Kue kue : daftarKue) {
            if (kue.getNama().equalsIgnoreCase(nama)) {
                return kue;
            }
        }
        return null;
    }

    public final void updateKue(String nama, int harga, int stok, String jenis, String varianRasa) {
        Kue kue = cariKue(nama);
        if (kue != null) {
            // Implementasi update sesuai kebutuhan
            System.out.println("\nKue " + nama + " berhasil diupdate.");
        } else {
            System.out.println("\nKue tidak ditemukan.");
        }
    }

    public final void hapusKue(String nama) {
        Kue kue = cariKue(nama);
        if (kue != null) {
            daftarKue.remove(kue);
            System.out.println("\nKue " + nama + " berhasil dihapus.");
        } else {
            System.out.println("\nKue tidak ditemukan.");
        }
    }
}