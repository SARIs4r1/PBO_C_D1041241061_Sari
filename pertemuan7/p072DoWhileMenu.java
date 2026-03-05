public class p072DoWhileMenu {
    public static void main(String[] args) {
        // Simulasi pilihan user
        int pilihan = 0;
        int iterasi = 1;
        System.out.println("=== MENU SEDERHANA ===");
        do {
            System.out.println("\n--- Iterasi ke-" + iterasi + "---");
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Hapus Data");
            System.out.println("0. Keluar");
            System.out.println("---");
            // Simulasi input pengguna (dalam praktik nyata pakai scanner)
            // Untuk demo, kita ubah pilihan setiap iterasi
            if (iterasi == 1) {
                pilihan = 1;
            } else if (iterasi == 2) {
                pilihan = 2;
            } else {
                pilihan = 0; // Keluar
            }

            System.out.println("Pilihan Anda: " + pilihan);
            switch (pilihan) {
            case 1:
            System.out.println("→ Menampilkan data...");
            break;
            case 2:
            System.out.println("→ Menambah data...");
            break;
            case 3:
            System.out.println("→ Menghapus data...");
            break;
            case 0:
            System.out.println("→ Terima kasih!");
            break;
            default:
            System.out.println("→ Pilihan tidak valid");
            break;
            }
            iterasi++;
        } while (pilihan != 0);
        System.out.println("\nProgram selesai.");
    }
}

