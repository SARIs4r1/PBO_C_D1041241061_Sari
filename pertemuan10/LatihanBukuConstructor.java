public class LatihanBukuConstructor {

    // Class Buku
    static class Buku {
        String judul;
        String pengarang;
        int harga;

        // Constructor 1: tanpa parameter
        public Buku() {
            judul = "Belum diisi";
            pengarang = "Belum diisi";
            harga = 0;
        }

        // Constructor 2: dengan parameter
        public Buku(String judul, String pengarang, int harga) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.harga = harga;
        }

        // Method untuk menampilkan informasi buku
        public void tampilkanInfo() {
            System.out.println("=== INFORMASI BUKU ===");
            System.out.println("Judul     : " + judul);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("Harga     : Rp " + harga);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Object dengan constructor default
        Buku buku1 = new Buku();

        // Object dengan constructor berparameter
        Buku buku2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
        Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        // Menampilkan info semua object
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
    }
}
