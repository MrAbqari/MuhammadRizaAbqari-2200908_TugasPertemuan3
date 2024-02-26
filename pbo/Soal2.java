package tugas.pkg3.pbo;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        double nilaiAkhir = 0.35 * nilaiUTS + 0.45 * nilaiUAS + 0.20 * nilaiTugas;

        String indeks;

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            indeks = "A";
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 80) {
            indeks = "B";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 70) {
            indeks = "C";
        } else {
            indeks = "D";
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Indeks: " + indeks);

        scanner.close();
    }
}
