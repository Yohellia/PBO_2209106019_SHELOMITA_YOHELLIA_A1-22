import java.util.ArrayList;

interface Updatable {
    void updateHarga(String nama, int harga);
    void updateStok(String nama, int stok);

    static void printErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}

class Database implements Updatable {
    final private ArrayList<Kue> daftarKue = new ArrayList<>();

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

    @Override
    public void updateHarga(String nama, int harga) {
        Kue kue = cariKue(nama);
        if (kue != null) {
            kue.setHarga(harga);
            System.out.println("\nHarga kue " + nama + " berhasil diupdate.");
        } else {
            System.out.println("\nKue tidak ditemukan.");
        }
    }

    @Override
    public void updateStok(String nama, int stok) {
        Kue kue = cariKue(nama);
        if (kue != null) {
            kue.setStok(stok);
            System.out.println("\nStok kue " + nama + " berhasil diupdate.");
        } else {
            System.out.println("\nKue tidak ditemukan.");
        }
    }
    
    public final void updateKue(String nama, int harga, int stok, String jenis, String varianRasa) {
        Kue kue = cariKue(nama);
        if (kue != null) {
            kue.setHarga(harga);
            kue.setStok(stok);
            
            if (kue instanceof KueBasah) {
                ((KueBasah) kue).setJenis(jenis);
                ((KueBasah) kue).setVarianRasa(varianRasa);
            } else if (kue instanceof KueKering) {
                ((KueKering) kue).setJenis(jenis);
                ((KueKering) kue).setVarianRasa(varianRasa);
            } else {
                System.out.println("Tidak dapat mengupdate jenis dan varian rasa untuk tipe kue ini.");
            }
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