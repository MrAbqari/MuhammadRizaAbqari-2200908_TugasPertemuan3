package tugas.pkg3.pbo;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = scanner.nextInt();

        int jumlahMobil = (jumlahPeserta / 7) + ((jumlahPeserta % 7 == 0) ? 0 : 1);

        System.out.println("Jumlah mobil yang diperlukan: " + jumlahMobil);

        scanner.close();
    }
}
