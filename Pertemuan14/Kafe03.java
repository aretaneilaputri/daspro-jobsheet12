package Pertemuan14;
import java.util.Scanner;

public class Kafe03 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga03(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Diskon 50% diterapkan pada menu " + pilihanMenu + "!");
            totalHarga -= totalHarga * 50 / 100;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Diskon 30% diterapkan pada menu " + pilihanMenu + "!");
            totalHarga -= totalHarga * 30 / 100;
        } else {
            System.out.println("Kode promo invalid, tidak ada diskon yang diterapkan pada menu " + pilihanMenu + "!");
        }

        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        Menu("Andi", true, kodePromo);

        System.out.print("\nBerapa jenis menu yang ingin dipesan? ");
        int jumlahJenisMenu = sc.nextInt();

        int totalAkhir = 0;

        for (int i = 0; i < jumlahJenisMenu; i++) {
            System.out.println("\n===== Pesanan ke-" + (i + 1) + " =====");
            System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalMenu = hitungTotalHarga03(pilihanMenu, banyakItem, kodePromo);
            totalAkhir += totalMenu;
        }

        System.out.println("\nTotal harga untuk pesanan Anda: Rp " + totalAkhir);

    }
}
