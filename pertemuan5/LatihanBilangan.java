public class LatihanBilangan {
    public static void main(String[] args) {

        int number = 12; // nilai bisa diubah

        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);

        // Menentukan positif, negatif, atau nol
        if (number > 0) {
            System.out.println("Jenis: Bilangan positif");
        } 
        else if (number < 0) {
            System.out.println("Jenis: Bilangan negatif");
        } 
        else {
            System.out.println("Jenis: Nol");
        }

        // Menentukan genap atau ganjil (jika bukan nol)
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
        }
    }
}

