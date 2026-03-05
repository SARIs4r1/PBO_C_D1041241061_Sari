public class p061SwitchBasic {
    public static void main(String[] args) {
// Contoh 1: Hari dalam seminggu
int day = 3;
String dayName;
System.out.println("=== Nama Hari ===");
System.out.println("Kode hari: " + day);
switch (day) {
case 1:
dayName = "Senin";
break;
case 2:
dayName = "Selasa";
break;
case 3:
dayName = "Rabu";
break;
case 4:
dayName = "Kamis";
break;
case 5:
dayName = "Jumat";
break;
case 6:
dayName = "Sabtu";
break;
case 7:
dayName = "Minggu";
break;
default:
dayName = "Kode tidak valid";
break;
}
System.out.println("Nama hari: " + dayName);
System.out.println();
// Contoh 2: Grade nilai
char grade = 'B';
System.out.println("=== Keterangan Grade ===");
System.out.println("Grade: " + grade);

System.out.print("Keterangan: ");
switch (grade) {
case 'A':
System.out.println("Excellent!");
break;
case 'B':
System.out.println("Very Good");
break;
case 'C':
System.out.println("Good");
break;
case 'D':
System.out.println("Satisfactory");
break;
case 'E':
System.out.println("Needs Improvement");
break;
default:
System.out.println("Grade tidak valid");
break;
}
}
}



