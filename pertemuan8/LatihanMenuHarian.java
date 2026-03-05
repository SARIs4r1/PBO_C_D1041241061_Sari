public class LatihanMenuHarian {
    public static void main(String[] args) {

        System.out.println("=== MENU MAKAN 3 HARI ===");

        for (int hari = 1; hari <= 3; hari++) {
            System.out.println("Hari " + hari + ":");

            for (int waktu = 1; waktu <= 2; waktu++) {

                if (hari == 1 && waktu == 1) {
                    System.out.println("Pagi: Nasi Goreng");
                } 
                else if (hari == 1 && waktu == 2) {
                    System.out.println("Siang: Soto Ayam");
                } 
                else if (hari == 2 && waktu == 1) {
                    System.out.println("Pagi: Bubur Ayam");
                } 
                else if (hari == 2 && waktu == 2) {
                    System.out.println("Siang: Mie Goreng");
                } 
                else if (hari == 3 && waktu == 1) {
                    System.out.println("Pagi: Roti Bakar");
                } 
                else if (hari == 3 && waktu == 2) {
                    System.out.println("Siang: Nasi Uduk");
                }
            }
        }
    }
}