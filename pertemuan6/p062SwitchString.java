public class p062SwitchString {
    public static void main(String[] args) {
// Contoh 1: Warna
String color = "Red";
System.out.println("=== Informasi Warna ===");
System.out.println("Warna: " + color);
System.out.print("Arti: ");
switch (color) {
case "Red":
System.out.println("Merah - Energi dan keberanian");
break;
case "Blue":
System.out.println("Biru - Ketenangan dan kepercayaan");
break;
case "Green":
System.out.println("Hijau - Pertumbuhan dan harmoni");
break;
case "Yellow":
System.out.println("Kuning - Kebahagiaan dan optimisme");
break;
default:
    System.out.println("Warna tidak dikenali");
break;
}
System.out.println();
// Contoh 2: Menu buah
String fruit = "Apple";
int price;
System.out.println("=== Harga Buah ===");
System.out.println("Buah: " + fruit);
switch (fruit) {
case "Apple":
price = 15000;
System.out.println("Harga: Rp " + price + "/kg");
break;
case "Banana":
price = 10000;
System.out.println("Harga: Rp " + price + "/kg");
break;
case "Orange":
price = 20000;
System.out.println("Harga: Rp " + price + "/kg");
break;
case "Mango":
price = 25000;
System.out.println("Harga: Rp " + price + "/kg");
break;
default:
System.out.println("Buah tidak tersedia");
break;
}
}
}
