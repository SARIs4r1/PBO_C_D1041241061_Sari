public class p081NestedLoop {
    public static void main(String[] args) {
// Contoh 1: Jadwal 3 hari, 3 shift
System.out.println("=== JADWAL KERJA ===");
for (int hari = 1; hari <= 3; hari++) {
System.out.println("Hari ke-" + hari + ":");
for (int shift = 1; shift <= 3; shift++) {
System.out.println(" Shift " + shift);
}
System.out.println();
}
// Contoh 2: Tabel sederhana
System.out.println("=== TABEL 3x4 ===");
for (int baris = 1; baris <= 3; baris++) {
for (int kolom = 1; kolom <= 4; kolom++) {
System.out.print("[" + baris + "," + kolom + "]");
}
System.out.println(); // Pindah baris
}
System.out.println();
// Contoh 3: Hitung total iterasi
System.out.println("=== HITUNG ITERASI ===");
int totalIterasi = 0;
for (int i = 1; i <= 2; i++) {
for (int j = 1; j <= 5; j++) {
totalIterasi++;
System.out.println("Iterasi ke-" + totalIterasi +
" (i=" + i + ", j=" + j +
")");
}
}
System.out.println("Total iterasi inner loop: " +
totalIterasi);
}
}
