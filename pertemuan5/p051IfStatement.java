public class p051IfStatement {
    public static void main(String[] args) { 
// Contoh 1: Pemeriksaan usia 
        int age = 20; 
        System.out.println("=== Pemeriksaan Usia ==="); 
        System.out.println("Usia: " + age); 
        if (age >= 18) { 
        System.out.println("Anda sudah dewasa"); 
        System.out.println("Anda dapat memilih dalam pemilu"); 
        } 
        System.out.println(); 
        // Contoh 2: Pemeriksaan nilai 
        int score = 75; 
         
        System.out.println("=== Pemeriksaan Nilai ==="); 
        System.out.println("Nilai: " + score); 
         
        if (score >= 60) { 
            System.out.println("Selamat! Anda LULUS"); 
        } 
         
        System.out.println(); 
         
        // Contoh 3: Pemeriksaan suhu 
        int temperature = 35; 
         
        System.out.println("=== Pemeriksaan Suhu ==="); 
        System.out.println("Suhu: " + temperature + "°C"); 
         
        if (temperature > 30) { 
            System.out.println("Cuaca panas"); 
            System.out.println("Disarankan gunakan AC"); 
        } 
    } 
}
