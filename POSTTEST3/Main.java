package POSTTEST3;
         
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseKue dbKue = new DatabaseKue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n====================================");
            System.out.println("==--    Sistem Pendataan Kue    --==");
            System.out.println("==--          S'Bakery          --==");
            System.out.println("====================================");
            System.out.println("\n\t\tMENU");
            System.out.println("\n[1]. TAMBAH KUE");
            System.out.println("[2]. DAFTAR KUE");
            System.out.println("[3]. UPDATE KUE");
            System.out.println("[4]. HAPUS KUE");
            System.out.println("[5]. KELUAR");
            System.out.print("\nPILIH MENU : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character

            switch (pilihan) {
                case 1:
                    System.out.println("\n====================================");
                    System.out.println("==--         TAMBAH KUE         --==");
                    System.out.println("====================================");
                    System.out.print("\nNama kue\t\t: ");
                    String nama = scanner.nextLine();
                    System.out.print("Harga\t\t\t: Rp. ");
                    int harga = scanner.nextInt();
                    System.out.print("Stok\t\t\t: ");
                    int stok = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline character
                    System.out.print("Jenis (Basah/Kering)\t: ");
                    String jenis = scanner.nextLine();
                    if (jenis.equalsIgnoreCase("Basah")) {
                        System.out.print("\n\tJENIS KUE BASAH");
                        System.out.print("\n\t  TEKAN ENTER  ");
                        String jenisBasah = scanner.nextLine();
                        dbKue.tambahKue(new KueBasah(nama, harga, stok, jenisBasah));
                    } else if (jenis.equalsIgnoreCase("Kering")) {
                        System.out.print("\n\tJENIS KUE KERING");
                        System.out.print("\n\t  TEKAN ENTER   ");
                        String jenisKering = scanner.nextLine();
                        dbKue.tambahKue(new KueKering(nama, harga, stok, jenisKering));
                    } else {
                        System.out.println("\n   JENIS KUE TIDAK VALID   ");
                        System.out.println("KUE TIDAK DAPAT DITAMBAHKAN");
                    }
                    break;
                case 2:
                    System.out.println("\n====================================");
                    System.out.println("==--         DAFTAR KUE         --==");
                    System.out.println("====================================");
                    dbKue.lihatSemuaKue();
                    break;
                case 3:
                    System.out.println("\n====================================");
                    System.out.println("==--         UPDATE KUE         --==");
                    System.out.println("====================================");
                    System.out.print("Nama kue yang ingin diupdate : ");
                    String namaUpdate = scanner.nextLine();
                    System.out.print("Harga baru\t: Rp. ");
                    int hargaBaru = scanner.nextInt();
                    System.out.print("Stok baru\t: ");
                    int stokBaru = scanner.nextInt();
                    dbKue.updateKue(namaUpdate, hargaBaru, stokBaru);
                    break;
                case 4:
                    System.out.println("\n====================================");
                    System.out.println("==--          HAPUS KUE         --==");
                    System.out.println("====================================");
                    System.out.print("Nama kue yang ingin dihapus : ");
                    String namaHapus = scanner.nextLine();
                    dbKue.hapusKue(namaHapus);
                    break;
                case 5:
                    System.out.println("\n====================================");
                    System.out.println("==          TERIMA KASIH          ==");
                    System.out.println("==       TELAH BERBELANJA DI      ==");
                    System.out.println("==            S'Bakery            ==");
                    System.out.println("====================================");
                    System.exit(0);
                default:
                    System.out.println("\nPilihan tidak valid.");
            }
        }
    }
}