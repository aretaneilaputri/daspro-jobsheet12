package Pertemuan14;
import java.util.Scanner;

public class RekapPenjualanCafe03 {

    static Scanner sc = new Scanner(System.in);

    static void inputPenjualan(String[] namaMenu, int[][] data) {
        System.out.println("=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("\nPenjualan " + namaMenu[i]);
            for (int j = 0; j < data[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilTabel(String[] namaMenu, int[][] data) {
        System.out.println("\n================== REKAP PENJUALAN ==================");
        System.out.printf("%-15s", "Menu/Hari");

        for (int h = 1; h <= data[0].length; h++) {
            System.out.printf("%-6s", "H" + h);
        }
        System.out.println();

        for (int i = 0; i < namaMenu.length; i++) {
            System.out.printf("%-15s", namaMenu[i]);
            for (int j = 0; j < data[0].length; j++) {
                System.out.printf("%-6d", data[i][j]);
            }
            System.out.println();
        }
    }

    static void tampilMenuTertinggi(String[] namaMenu, int[][] data) {
        int idxMax = 0;
        int totalMax = 0;

        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < data[0].length; j++) {
                total += data[i][j];
            }
            if (total > totalMax) {
                totalMax = total;
                idxMax = i;
            }
        }

        System.out.println("\nMenu Penjualan Tertinggi:");
        System.out.println(namaMenu[idxMax] + " (" + totalMax + " porsi)");
    }

    static void tampilRataRata(String[] namaMenu, int[][] data) {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < data[0].length; j++) {
                total += data[i][j];
            }
            double rata = total / (double) data[0].length;
            System.out.printf("%-15s : %.2f%n", namaMenu[i], rata);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah menu        : ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari jualan : ");
        int jmlHari = sc.nextInt();
        sc.nextLine(); 
       
        String[] namaMenu = new String[jmlMenu];
        System.out.println("\n=== INPUT NAMA MENU ===");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + " : ");
            namaMenu[i] = sc.nextLine();
        }

        int[][] penjualan = new int[jmlMenu][jmlHari];

        inputPenjualan(namaMenu, penjualan);
        tampilTabel(namaMenu, penjualan);
        tampilMenuTertinggi(namaMenu, penjualan);
        tampilRataRata(namaMenu, penjualan);
    }
}
