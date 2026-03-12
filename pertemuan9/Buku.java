class Buku {

    // atribut
    String judul;
    String pengarang;
    int harga;

    // method untuk menampilkan info buku
    void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp " + harga);
    }

    public static void main(String[] args) {

        // membuat object buku pertama
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;

        // membuat object buku kedua
        Buku buku2 = new Buku();
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;

        // memanggil method tampilkanInfo()
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}
