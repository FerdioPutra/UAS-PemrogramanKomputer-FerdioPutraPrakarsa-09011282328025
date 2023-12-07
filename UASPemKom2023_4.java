import java.util.Scanner;

public class UASPemKom2023_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif yang ingin difaktorkan: ");
        int number = input.nextInt();

        System.out.print("Faktorisasi " + number + ": ");
        FaktorisasiBilangan(number);

        input.close();
    }

    // Fungsi untuk memfaktorkan bilangan bulat positif
    static void FaktorisasiBilangan(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n != 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
