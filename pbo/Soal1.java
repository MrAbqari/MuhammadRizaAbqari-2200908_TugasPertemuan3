package tugas.pkg3.pbo;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            int hasilPenjumlahan = bilangan1 + bilangan2;
            System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        } else {
            int hasilPerkalian = bilangan1 * bilangan2;
            System.out.println("Hasil perkalian: " + hasilPerkalian);
        }

        scanner.close();
    }
}
