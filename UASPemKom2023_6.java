import java.util.Scanner;

public class UASPemKom2023_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String text = input.nextLine();

        if (isPalindrome(text)) {
            System.out.println("'" + text + "' adalah palindrom.");
        } else {
            System.out.println("'" + text + "' bukan palindrom.");
        }

        input.close();
    }

    // Metode untuk mengecek apakah suatu teks adalah palindrom atau tidak
    static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Menghapus karakter selain huruf
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
