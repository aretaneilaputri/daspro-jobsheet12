package Pertemuan14;
import java.util.Scanner;

public class NilaiMahasiswa03 {

    static void isianArray(double[] daftarNilai) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < daftarNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            daftarNilai[i] = in.nextDouble();
        }
    }

    static void tampilArray(double[] daftarNilai) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < daftarNilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " = " + daftarNilai[i]);
        }
    }

    static double hitTot(double[] daftarNilai) {
        double total = 0;
        for (int i = 0; i < daftarNilai.length; i++) {
            total += daftarNilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nTOTAL NILAI MAHASISWA\n");

        System.out.print("Masukkan jumlah mahasiswa (N): ");

        int jumlahMhs = input.nextInt();

        double[] nilaiMhs = new double[jumlahMhs];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);
        double totalNilai = hitTot(nilaiMhs);

        System.out.println("\nTotal nilai seluruh mahasiswa = " + totalNilai);

        System.out.println("\nSELESAI\n");


        input.close();
    }
}

