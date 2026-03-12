class Mobil {

    // atribut
    String merk;
    String warna;
    int tahun;
    int kecepatan = 0;

    // method menampilkan spesifikasi
    void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }

    // method percepat
    void percepat() {
        kecepatan = kecepatan + 20;
        System.out.println("Mobil dipercepat...");
    }

    // method menampilkan kecepatan
    void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }

    public static void main(String[] args) {

        // membuat object mobil
        Mobil mobil1 = new Mobil();

        // mengisi atribut
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;

        // menampilkan spesifikasi
        mobil1.tampilkanSpesifikasi();

        // mempercepat mobil dua kali
        mobil1.percepat();
        mobil1.percepat();

        // menampilkan kecepatan akhir
        mobil1.tampilkanKecepatan();
    }
}