public class p071WhileBasic {
    public static void main(String[] args) {
        // Contoh 1: Menampilkan angka 1-5
        System.out.println("=== Deret Angka 1-5 ===");
        int counter = 1;
        while (counter <= 5) {
        System.out.println("Angka: " + counter);
        counter++;
    }
        System.out.println();
        // Contoh 2: Menghitung total
        System.out.println("=== Hitung Total 1+2+3+4+5 ===");
        int angka = 1;
        int total = 0;
        while (angka <= 5) {
        total = total + angka; // Akumulasi
        System.out.println("Total sementara: " + total);
        angka++;
    }
        System.out.println("Total akhir: " + total);
        System.out.println();
        // Contoh 3: Perulangan mundur
        System.out.println("=== Hitung Mundur 5-1 ===");
        int hitung = 5;
        while (hitung >= 1) {
        System.out.println("Hitung: " + hitung);
        hitung--;
    }
        System.out.println("Selesai!");
    }
}
