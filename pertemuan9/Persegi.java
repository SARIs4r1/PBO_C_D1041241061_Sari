class Persegi {

    // atribut
    int sisi;
    int luas;
    int keliling;

    // method menghitung luas
    void hitungLuas() {
        luas = sisi * sisi;
    }

    // method menghitung keliling
    void hitungKeliling() {
        keliling = 4 * sisi;
    }

    // method menampilkan hasil
    void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }

    public static void main(String[] args) {

        // membuat object persegi
        Persegi p1 = new Persegi();

        // mengisi nilai sisi
        p1.sisi = 5;

        // menghitung luas dan keliling
        p1.hitungLuas();
        p1.hitungKeliling();

        // menampilkan hasil
        p1.tampilkanHasil();
    }
}