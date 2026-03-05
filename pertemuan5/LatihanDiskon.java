public class LatihanDiskon {
    public static void main(String[] args) {

        double totalBelanja = 750000;
        double diskon = 0;

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);

        if (totalBelanja < 100000) {
            diskon = 0;
        } 
        else if (totalBelanja < 500000) {
            diskon = 0.05;
        } 
        else if (totalBelanja < 1000000) {
            diskon = 0.10;
        } 
        else {
            diskon = 0.15;
        }

        double jumlahDiskon = totalBelanja * diskon;
        double hargaAkhir = totalBelanja - jumlahDiskon;

        System.out.println("Diskon (" + (diskon * 100) + "%): Rp " + jumlahDiskon);
        System.out.println("Harga Akhir: Rp " + hargaAkhir);
        System.out.println("Anda hemat: Rp " + jumlahDiskon);
    }
}