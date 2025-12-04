package Pertemuan14;
import java.util.Scanner;

public class RekapPenjualanCafe03 {

    static String[] namaMenu = {
        "Kopi Hitam", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"
    };

    static void inputPenjualan(int[][] data) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("\nPenjualan " + namaMenu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilTabel(int[][] data) {
        System.out.println("\n================== REKAP PENJUALAN ==================");
        System.out.printf("%-15s", "Menu/Hari");

        for (int h = 1; h <= 7; h++) {
            System.out.printf("%-6s", "H" + h);
        }
        System.out.println();

        for (int i = 0; i < namaMenu.length; i++) {
            System.out.printf("%-15s", namaMenu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-6d", data[i][j]);
            }
            System.out.println();
        }
    }

    static void tampilMenuTertinggi(int[][] data) {
        int idxMax = 0;
        int totalMax = 0;

        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
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

    static void tampilRataRata(int[][] data) {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += data[i][j];
            }
            double rata = total / 7.0;
            System.out.printf("%-15s : %.2f%n", namaMenu[i], rata);
        }
    }

    public static void main(String[] args) {
        int[][] penjualan = new int[5][7];

        inputPenjualan(penjualan);
        tampilTabel(penjualan);
        tampilMenuTertinggi(penjualan);
        tampilRataRata(penjualan);
    }
}


