package Pertemuan14;
import java.util.Scanner;

public class Kubus03 {

    static double volume(double sisi) {
        return sisi * sisi * sisi;
    }

    static double luasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisiKubus = input.nextDouble();

        double hasilVolume = volume(sisiKubus);
        double hasilLuas = luasPermukaan(sisiKubus);

        System.out.println("HASIL PERHITUNGAN KUBUS");
        System.out.println("Sisi Kubus                : " + sisiKubus);
        System.out.println("Volume Kubus              : " + hasilVolume);
        System.out.println("Luas Permukaan Kubus      : " + hasilLuas);

        input.close();
    }
}
