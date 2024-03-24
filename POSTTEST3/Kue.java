package POSTTEST3;

import java.util.ArrayList;

//Class Kue
public class Kue {
    private String nama;
    private int harga;
    private int stok;

    //Constructor
    public Kue(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    //Getter untuk variable nama
    public String getNama() {
        return nama;
    }

    //Getter untuk variable harga
    public int getHarga() {
        return harga;
    }

    //Getter untuk variable stok
    public int getStok() {
        return stok;
    }

    //Setter untuk variable harga
    public void setHarga(int harga) {
        this.harga = harga;
    }

    //Setter untuk variable stok
    public void setStok(int stok) {
        this.stok = stok;
    }

    //Method Override toString()
    @Override
    public String toString() {
        return "\nNama\t: " + nama + "\nHarga\t: Rp. " + harga + "\nStok\t: " + stok;
    }
}

class DatabaseKue {
    private ArrayList<Kue> daftarKue;

    public DatabaseKue() {
        daftarKue = new ArrayList<>();
    }

    public void tambahKue(Kue kue) {
        daftarKue.add(kue);
        System.out.println("\nKue " + kue.getNama() + " berhasil ditambahkan.");
    }

    public void lihatSemuaKue() {
        if (daftarKue.isEmpty()) {
            System.out.println("Tidak ada kue yang tersedia.");
        } else {
            for (Kue kue : daftarKue) {
                System.out.println(kue);
            }
        }
    }

    public Kue cariKue(String nama) {
        for (Kue kue : daftarKue) {
            if (kue.getNama().equalsIgnoreCase(nama)) {
                return kue;
            }
        }
        return null;
    }

    public void updateKue(String nama, int harga, int stok) {
        Kue kue = cariKue(nama);
        if (kue != null) {
            kue.setHarga(harga);
            kue.setStok(stok);
            System.out.println("\nKue " + nama + " berhasil diupdate.");
        } else {
            System.out.println("\nKue tidak ditemukan.");
        }
    }

    public void hapusKue(String nama) {
        Kue kue = cariKue(nama);
        if (kue != null) {
            daftarKue.remove(kue);
            System.out.println("\nKue " + nama + " berhasil dihapus.");
        } else {
            System.out.println("\nKue tidak ditemukan.");
        }
    }
}