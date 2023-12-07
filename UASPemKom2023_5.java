import java.util.Scanner;

public class UASPemKom2023_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Bilangan

        System.out.print("Masukkan angka pertama: ");
        double num1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double num2 = input.nextDouble();

        // Pemilihan sistem operasi

        System.out.println("Pilih operasi yang ingin dilakukan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Pilihan Anda: ");
        int choice = input.nextInt();

        // Proses pada sistem operasi bilangan

        switch (choice) {
            case 1:
                System.out.println("Hasil penjumlahan: " + Penjumlahan(num1, num2));
                break;
            case 2:
                System.out.println("Hasil pengurangan: " + Pengurangan(num1, num2));
                break;
            case 3:
                System.out.println("Hasil perkalian: " + Perkalian(num1, num2));
                break;
            case 4:
                System.out.println("Hasil pembagian: " + Pembagian(num1, num2));
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        input.close();
    }

    // Metode untuk penjumlahan
    static double Penjumlahan(double a, double b) {
        return a + b;
    }

    // Metode untuk pengurangan
    static double Pengurangan(double a, double b) {
        return a - b;
    }

    // Metode untuk perkalian
    static double Perkalian(double a, double b) {
        return a * b;
    }

    // Metode untuk pembagian
    static double Pembagian(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Tidak dapat membagi dengan nol");
            return 0;
        }
        return a / b;
    }
}
