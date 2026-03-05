public class LatihanTotalGenap {
    public static void main(String[] args) {

        int total = 0;

        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) {
                continue;
            }

            total += i;
            System.out.println("Tambah: " + i + " → Total: " + total);
        }

        System.out.println("---");
        System.out.println("Total akhir: " + total);
    }
}