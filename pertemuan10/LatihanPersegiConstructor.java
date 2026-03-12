public class LatihanPersegiConstructor {

    // Class Persegi
    static class Persegi {
        int sisi;
        int luas;
        int keliling;

        // Constructor dengan 1 parameter + validasi
        public Persegi(int sisi) {
            if (sisi <= 0) {
                System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
                this.sisi = 1;
            } else {
                this.sisi = sisi;
            }

            // Menghitung luas dan keliling
            this.luas = this.sisi * this.sisi;
            this.keliling = 4 * this.sisi;
        }

        // Method menampilkan hasil
        public void tampilkanHasil() {
            System.out.println("=== PERSEGI ===");
            System.out.println("Sisi     : " + sisi + " cm");
            System.out.println("Luas     : " + luas + " cm²");
            System.out.println("Keliling : " + keliling + " cm");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Object dengan sisi valid
        Persegi p1 = new Persegi(5);

        // Object dengan sisi tidak valid
        Persegi p2 = new Persegi(-3);

        // Menampilkan hasil
        p1.tampilkanHasil();
        p2.tampilkanHasil();
    }
}