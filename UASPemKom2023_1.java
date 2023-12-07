import java.util.Scanner;

public class UASPemKom2023_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = input.nextInt();

        double totalHarga = harga * jumlahBarang;
        double diskon = 0.0;

        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            diskon = 0.05; // Diskon 5% untuk 5-10 barang
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            diskon = 0.1; // Diskon 10% untuk 11-20 barang
        } else if (jumlahBarang > 20) {
            diskon = 0.2; // Diskon 20% untuk lebih dari 20 barang
        }

        double totalDiskon = totalHarga * diskon;
        double hargaSetelahDiskon = totalHarga - totalDiskon;

        System.out.println("Total harga: Rp " + totalHarga);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Harga setelah diskon: Rp " + hargaSetelahDiskon);

        input.close();
    }
}
