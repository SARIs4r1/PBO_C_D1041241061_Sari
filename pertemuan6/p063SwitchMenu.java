public class p063SwitchMenu {
    public static void main(String[] args) {
// Simulasi input user (menu pilihan)
int menuChoice = 2;
// Data untuk perhitungan
double num1 = 10.0;
double num2 = 3.0;
double result = 0;
System.out.println("=== KALKULATOR SEDERHANA ===");
System.out.println("1. Penjumlahan");
System.out.println("2. Pengurangan");
System.out.println("3. Perkalian");
System.out.println("4. Pembagian");
System.out.println("---");
System.out.println("Pilihan Anda: " + menuChoice);
System.out.println("Bilangan 1: " + num1);
System.out.println("Bilangan 2: " + num2);
System.out.println();
switch (menuChoice) {
case 1:
result = num1 + num2;
System.out.println("Operasi: Penjumlahan");
System.out.println("Hasil: " + num1 + " + " +
num2 + " = " + result);
break;
case 2:
result = num1 - num2;
System.out.println("Operasi: Pengurangan");
System.out.println("Hasil: " + num1 + " - " +
num2 + " = " + result);
break;
case 3:
result = num1 * num2;
System.out.println("Operasi: Perkalian");
System.out.println("Hasil: " + num1 + " × " +
num2 + " = " + result);
break;
case 4:
if (num2 != 0) {
result = num1 / num2;
System.out.println("Operasi: Pembagian");
System.out.println("Hasil: " + num1 + " ÷ " +
num2 + " = " + result);
} else {
System.out.println("Error: Tidak bisa membagi dengan nol!");
}
break;
default:

System.out.println("Error: Pilihan menu tidaknvalid!");
System.out.println("Silakan pilih menu 1-4");
break;
}
}
}
