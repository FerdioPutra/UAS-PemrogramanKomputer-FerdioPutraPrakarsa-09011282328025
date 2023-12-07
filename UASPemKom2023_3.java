import java.util.Scanner;

public class UASPemKom2023_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah suku deret Fibonacci yang ingin ditampilkan: ");
        int n = input.nextInt();

        System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        input.close();
    }

    // Rumus untuk menghitung suku ke-n dalam deret Fibonacci
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
