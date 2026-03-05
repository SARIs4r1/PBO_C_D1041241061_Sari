public class LatihanBilangan {
    public static void main(String[] args) {

        int number = 12; 

        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);


        if (number > 0) {
            System.out.println("Jenis: Bilangan positif");
        } 
        else if (number < 0) {
            System.out.println("Jenis: Bilangan negatif");
        } 
        else {
            System.out.println("Jenis: Nol");
        }

       
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
        }
    }
}

