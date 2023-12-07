import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBorrowed;

    // Konstruktor untuk inisialisasi buku
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    // Metode untuk menampilkan informasi buku
    public void displayBookInfo() {
        System.out.println("Judul: " + title);
        System.out.println("Penulis: " + author);
        System.out.println("Tahun Terbit: " + publicationYear);
        if (isBorrowed) {
            System.out.println("Status: Sedang Dipinjam");
        } else {
            System.out.println("Status: Tersedia");
        }
    }

    // Metode untuk meminjam buku
    public void borrowBook() {
        if (!isBorrowed) {
            System.out.println("Anda telah meminjam buku dengan judul '" + title + "'.");
            isBorrowed = true;
        } else {
            System.out.println("Maaf, buku dengan judul '" + title + "' sedang tidak tersedia.");
        }
    }

    // Metode untuk mengembalikan buku
    public void returnBook() {
        if (isBorrowed) {
            System.out.println("Anda telah mengembalikan buku dengan judul '" + title + "'.");
            isBorrowed = false;
        } else {
            System.out.println("Buku dengan judul '" + title + "' sudah tersedia di perpustakaan.");
        }
    }

    // Getter untuk judul buku
    public String getTitle() {
        return title;
    }

    // Getter untuk status peminjaman buku
    public boolean isBorrowed() {
        return isBorrowed;
    }
}

public class UASPemKom2023_7 {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        // Menambahkan beberapa buku ke dalam perpustakaan
        library.add(new Book("Java Programming", "John Doe", 2020));
        library.add(new Book("Python Basics", "Jane Smith", 2018));
        library.add(new Book("C Programming", "Alan Turing", 1990));

        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nPilihan Menu:");
            System.out.println("1. Tampilkan Buku yang Tersedia");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayAvailableBooks(library);
                    break;
                case 2:
                    borrowBook(library, input);
                    break;
                case 3:
                    returnBook(library, input);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 0);

        input.close();
    }

    // Metode untuk menampilkan buku yang tersedia
    public static void displayAvailableBooks(ArrayList<Book> library) {
        System.out.println("\nBuku yang Tersedia:");
        for (Book book : library) {
            if (!book.isBorrowed()) {
                book.displayBookInfo();
                System.out.println();
            }
        }
    }

    // Metode untuk meminjam buku
    public static void borrowBook(ArrayList<Book> library, Scanner input) {
        input.nextLine(); // Membuang karakter '\n' dari buffer
        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
        String bookTitle = input.nextLine();

        boolean bookFound = false;
        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && !book.isBorrowed()) {
                book.borrowBook();
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Buku dengan judul '" + bookTitle + "' tidak tersedia atau sudah dipinjam.");
        }
    }

    // Metode untuk mengembalikan buku
    public static void returnBook(ArrayList<Book> library, Scanner input) {
        input.nextLine(); // Membuang karakter '\n' dari buffer
        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
        String bookTitle = input.nextLine();

        boolean bookFound = false;
        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && book.isBorrowed()) {
                book.returnBook();
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Buku dengan judul '" + bookTitle + "' tidak sedang dipinjam.");
        }
    }
}
