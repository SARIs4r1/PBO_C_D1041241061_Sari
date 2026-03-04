public class p052IfElse {
    public static void main(String[] args) { 
        // Contoh 1: If-Else sederhana 
        int score = 55; 
        System.out.println("=== Status Kelulusan ==="); 
        System.out.println("Nilai: " + score); 
        if (score >= 60) { 
            System.out.println("Status: LULUS"); 
        } else { 
            System.out.println("Status: TIDAK LULUS"); 
        } 
        System.out.println(); 
         
        // Contoh 2: If-Else-If Ladder (Grading) 
        int examScore = 78; 
        char grade; 
        System.out.println("=== Sistem Penilaian ==="); 
        System.out.println("Nilai Ujian: " + examScore); 
         
        if (examScore >= 85) { 
            grade = 'A'; 
            System.out.println("Grade: A - Excellent!"); 
        } else if (examScore >= 75) { 
            grade = 'B'; 
            System.out.println("Grade: B - Very Good"); 
        } else if (examScore >= 65) { 
            grade = 'C'; 
            System.out.println("Grade: C - Good");
             } else if (examScore >= 55) { 
            grade = 'D'; 
            System.out.println("Grade: D - Satisfactory"); 
        } else { 
            grade = 'E'; 
            System.out.println("Grade: E - Needs Improvement"); 
        } 
        System.out.println(); 
        // Contoh 3: Pemeriksaan bilangan 
        int number = 7; 
        System.out.println("=== Pemeriksaan Bilangan ==="); 
        System.out.println("Bilangan: " + number); 
        if (number > 0) { 
            System.out.println("Bilangan positif"); 
        } else if (number < 0) { 
            System.out.println("Bilangan negatif"); 
        } else { 
            System.out.println("Bilangan nol"); 
        } 
    } 
}
