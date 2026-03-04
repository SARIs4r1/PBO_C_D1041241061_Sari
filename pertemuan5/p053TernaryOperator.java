public class p053TernaryOperator {
        public static void main(String[] args) { 
        // Contoh 1: Status kelulusan 
        int score = 75; 
        String status = (score >= 60) ? "Lulus" : "Tidak Lulus";  
        System.out.println("=== Status Kelulusan ==="); 
        System.out.println("Nilai: " + score); 
        System.out.println("Status: " + status); 
        System.out.println(); 
        // Contoh 2: Bilangan genap/ganjil 
        int number = 8; 
        String parity = (number % 2 == 0) ? "Genap" : "Ganjil"; 
        System.out.println("=== Pemeriksaan Bilangan ==="); 
        System.out.println("Bilangan: " + number); 
        System.out.println("Jenis: " + parity); 
        System.out.println(); 
        // Contoh 3: Nilai maksimum 
        int a = 15; 
        int b = 20; 
        int max = (a > b) ? a : b; 
        System.out.println("=== Nilai Maksimum ==="); 
        System.out.println("Bilangan a: " + a); 
        System.out.println("Bilangan b: " + b); 
        System.out.println("Nilai maksimum: " + max); 
        System.out.println(); 
        // Contoh 4: Inline dalam println 
        int age = 17; 
        System.out.println("=== Status Usia ==="); 
        System.out.println("Usia: " + age); 
        System.out.println("Status: " + ((age >= 18) ? "Dewasa" : "Belum Dewasa")); 
    }
}
