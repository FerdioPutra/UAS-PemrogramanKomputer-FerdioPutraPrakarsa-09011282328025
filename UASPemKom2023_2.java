import java.util.Scanner;

public class UASPemKom2023_2 {
    public static void main(String[] args) {
        // Username dan Password 
        String username = "user123";
        String password = "pass123";

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

        // Memeriksa apakah username dan password yang dimasukkan sesuai dengan nilai yang ditentukan
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        input.close();
    }
}
