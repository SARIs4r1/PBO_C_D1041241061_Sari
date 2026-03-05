public class p083ContinueStatement {
    public static void main(String[] args) {
        // Contoh 1: Tampilkan bilangan ganjil
        System.out.println("=== BILANGAN GANJIL 1-10 ===");
        for (int i = 1; i <= 10; i++) {
        if (i % 2 == 0) { // Jika genap
        continue; // Skip, lanjut ke iterasi berikutnya
    }
        // Hanya bilangan ganjil yang sampai di sini
        System.out.println(i);
    }
        System.out.println();
        // Contoh 2: Skip hari libur
        System.out.println("=== HARI KERJA (Skip Weekend) ===");
        for (int hari = 1; hari <= 7; hari++) {
        if (hari == 6 || hari == 7) { // Weekend
        System.out.println("Hari " + hari + ": Libur (skip)");
        continue; // Lewati proses kerja
        }
        // Hanya hari kerja yang diproses
        System.out.println("Hari " + hari + ": Bekerja");
        }
        System.out.println();
        // Contoh 3: Hitung total (skip negatif)
        System.out.println("=== TOTAL ANGKA POSITIF ===");
        int[] angka = {5, -2, 8, -1, 3, -5, 7};
        int total = 0;
        System.out.print("Data: ");
        for (int i = 0; i < angka.length; i++) {
        System.out.print(angka[i] + " ");
    }
        System.out.println();
        for (int i = 0; i < angka.length; i++) {
        if (angka[i] < 0) {
        System.out.println("Skip: " + angka[i] + "(negatif)");
        continue; // Jangan tambahkan ke total
        }
        total += angka[i];
        System.out.println("Tambah: " + angka[i] + " → Total: " + total);
    }
        System.out.println("Total akhir (positif saja): " + total);
    }
    }

