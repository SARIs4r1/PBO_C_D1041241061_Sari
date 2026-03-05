public class p073ForLoop {
    public static void main(String[] args) { 
        // Contoh 1: Deret angka 1-10
        System.out.println("=== Deret Angka 1-10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        // Contoh 2: Deret genap
        System.out.println("=== Bilangan Genap 2-20 ===");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        // Contoh 3: Perulangan mundur
        System.out.println("=== Hitung Mundur 10-1 ===");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        // Contoh 4: Pola bintang sederhana
        System.out.println("=== Pola Bintang ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("* ");
        }
        System.out.println();
        // Contoh 5: Tabel perkalian 5
        System.out.println("=== Tabel Perkalian 5 ===");
        int angka = 5;
        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.println(angka + " × " + i + " = " + hasil);

        }
    }
}

