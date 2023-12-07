public class UserAccount {
    private String username;
    private String password;
    private boolean isActive;

    // Constructor
    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = true; // Akun aktif secara default
    }

    // Getter dan setter untuk username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter dan setter untuk password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter dan setter untuk status aktif/nonaktif
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // Method untuk mengaktifkan akun
    public void activateAccount() {
        isActive = true;
        System.out.println("Akun " + username + " telah diaktifkan.");
    }

    // Method untuk menonaktifkan akun
    public void deactivateAccount() {
        isActive = false;
        System.out.println("Akun " + username + " telah dinonaktifkan.");
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas UserAccount
        UserAccount user1 = new UserAccount("user123", "password123");
        System.out.println("Username: " + user1.getUsername());
        System.out.println("Password: " + user1.getPassword());
        System.out.println("Status aktif: " + user1.isActive());

        // Menonaktifkan akun
        user1.deactivateAccount();
        System.out.println("Status aktif setelah dinonaktifkan: " + user1.isActive());

        // Mengaktifkan kembali akun
        user1.activateAccount();
        System.out.println("Status aktif setelah diaktifkan kembali: " + user1.isActive());
    }
}
