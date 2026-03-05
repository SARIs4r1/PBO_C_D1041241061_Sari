public class LatihanHariBulan {
    public static void main(String[] args) {

        int month = 4;
        int jumlahHari = 0;
        String namaBulan = "";

        switch (month) {

            case 1:
                namaBulan = "Januari";
            case 3:
                if(namaBulan.equals("")) namaBulan = "Maret";
            case 5:
                if(namaBulan.equals("")) namaBulan = "Mei";
            case 7:
                if(namaBulan.equals("")) namaBulan = "Juli";
            case 8:
                if(namaBulan.equals("")) namaBulan = "Agustus";
            case 10:
                if(namaBulan.equals("")) namaBulan = "Oktober";
            case 12:
                if(namaBulan.equals("")) namaBulan = "Desember";
                jumlahHari = 31;
                break;

            case 4:
                namaBulan = "April";
            case 6:
                if(namaBulan.equals("")) namaBulan = "Juni";
            case 9:
                if(namaBulan.equals("")) namaBulan = "September";
            case 11:
                if(namaBulan.equals("")) namaBulan = "November";
                jumlahHari = 30;
                break;

            case 2:
                namaBulan = "Februari";
                jumlahHari = 28;
                break;

            default:
                System.out.println("Bulan tidak valid");
                return;
        }

        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
        System.out.println("Jumlah hari: " + jumlahHari + " hari");
    }
}