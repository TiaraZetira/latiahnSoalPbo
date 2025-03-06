import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Masukkan nama anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Masukkan NIM anda: ");
        int NIM = input.nextInt();
        System.out.print("Masukkan umur anda: ");
        int age = input.nextInt();
        System.out.print("Masukkan tinggi badan anda: ");
        double height = input.nextDouble();

        System.out.println("\nData yang akan anda masukkan: ");
        System.out.println("Nama anda: " + name);
        System.out.println("NIM anda: " + NIM);
        System.out.println("Umur anda: "+ age);
        System.out.println("Tinggi badan anda: " + height);

        double hasilUsia = (age * 2) + 10 / 2;
        System.out.println("Hasil Usia: " + hasilUsia);

        boolean umur = age > 18;
        System.out.println("Usia anda lebih dari 18: " + umur);

        boolean tinggi = height > 160;
        System.out.println("Tinggi badan anda lebih dari 160: " + tinggi);

        double usia = (double) + age;
        int tinggiBadan = (int) + height;
        System.out.println("Umur dalam double: " + usia);
        System.out.println("Tinggi badan dalam int: " + tinggiBadan);
        
        input.close();
    }
}