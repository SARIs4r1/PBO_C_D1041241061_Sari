public class LatihanMobilConstructor {

    // Class Mobil
    static class Mobil {
        String merk;
        String warna;
        int tahun;

        // Constructor 1: tanpa parameter
        public Mobil() {
            merk = "Belum diisi";
            warna = "Belum diisi";
            tahun = 0;
        }

        // Constructor 2: 1 parameter (merk saja)
        public Mobil(String merk) {
            this.merk = merk;
            this.warna = "Belum diisi";
            this.tahun = 0;
        }

        // Constructor 3: 3 parameter
        public Mobil(String merk, String warna, int tahun) {
            this.merk = merk;
            this.warna = warna;
            this.tahun = tahun;
        }

        // Method menampilkan spesifikasi mobil
        public void tampilkanSpesifikasi() {
            System.out.println("=== SPESIFIKASI MOBIL ===");
            System.out.println("Merk : " + merk);
            System.out.println("Warna: " + warna);
            System.out.println("Tahun: " + tahun);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Object dengan constructor berbeda
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Toyota");
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

        // Menampilkan spesifikasi
        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}