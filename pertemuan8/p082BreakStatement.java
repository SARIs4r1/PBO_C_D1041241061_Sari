public class p082BreakStatement {
    public static void main(String[] args) {
        // Contoh 1: Pencarian angka
        System.out.println("=== PENCARIAN ANGKA 5 ===");
        for (int i = 1; i <= 10; i++) {
        System.out.println("Cek angka: " + i);
        if (i == 5) {
        System.out.println("✓ Angka 5 ditemukan!");
        break; // Keluar dari loop
    }
}
        System.out.println("Pencarian selesai.\n");
        // Contoh 2: Validasi input
        System.out.println("=== VALIDASI PASSWORD ===");
        String password = "java123";
        String[] percobaan = {"admin", "12345", "java123",
        "test"};
        for (int i = 0; i < percobaan.length; i++) {
        System.out.println("Percobaan " + (i+1) + ": " +
        percobaan[i]);
        if (percobaan[i].equals(password)) {
        System.out.println("✓ Password benar!");
        break; // Login berhasil, tidak perlu cek lagi
    } else {
        System.out.println("✗ Password salah");
    }
}
        System.out.println("Proses login selesai.\n");
        // Contoh 3: Break dalam nested loop
        System.out.println("=== BREAK DALAM NESTED LOOP ===");
        for (int i = 1; i <= 3; i++) {
        System.out.println("Outer loop: " + i);
        for (int j = 1; j <= 5; j++) {
        System.out.print(" Inner: " + j);
        if (j == 3) {
        System.out.println(" → BREAK");
        break; // Keluar dari inner loop saja
    }
        System.out.println();
    }
    }
    }
}

