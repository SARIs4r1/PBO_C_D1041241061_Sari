package tugasMandiri;

public class latihan1 {
    public static void main(String[] args) {        
        String namaProduk = "Laptop Asus";
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean statusTersedia = true;
        final double PAJAK = 0.11;       
        int totalNilaiStok = hargaSatuan * jumlahStok;
        double pajak = totalNilaiStok * PAJAK;

        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);     
        System.out.println("Harga Satuan: Rp " + hargaSatuan);       
        System.out.println("Jumlah Stok: " + jumlahStok);       
        System.out.println("Status Tersedia: " + statusTersedia);       
        System.out.println("---");      
        System.out.println("Total Nilai Stok: Rp " + totalNilaiStok);        
        System.out.println("Pajak (11%): Rp " + (int)pajak);
    }
}
