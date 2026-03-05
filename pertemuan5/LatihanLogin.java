public class LatihanLogin {
    public static void main(String[] args) {

        String inputUsername = "admin";
        String inputPassword = "admin123";

        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: ****");
        System.out.println("---");

        if (inputUsername.equals("admin")) {
            System.out.println("Username valid");

            if (inputPassword.equals("admin123")) {
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
            } 
            else {
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }

        } 
        else {
            System.out.println("Username tidak ditemukan");
            System.out.println("LOGIN GAGAL!");
        }
    }
}