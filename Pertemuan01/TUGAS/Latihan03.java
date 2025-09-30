package Pertemuan01;
import java.util.Scanner;

public class Latihan03 {
    static Scanner input = new Scanner(System.in);
    static final double PI = 3.14159;

    static void layangLayang() {
        System.out.print("Masukkan diagonal 1: ");
        double d1 = input.nextDouble();
        System.out.print("Masukkan diagonal 2: ");
        double d2 = input.nextDouble();
        System.out.print("Masukkan sisi a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan sisi b: ");
        double b = input.nextDouble();

        double luas = (d1 * d2) / 2;
        double keliling = 2 * (a + b);

        System.out.println("Luas Layang-layang = " + luas);
        System.out.println("Keliling Layang-layang = " + keliling);
    }

    static void prismaSegitiga() {
        System.out.print("Masukkan alas segitiga: ");
        double a = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi prisma: ");
        double tPrisma = input.nextDouble();

        double luasAlas = (a * tSegitiga) / 2;
        double volume = luasAlas * tPrisma;

        double kelilingAlas = 3 * a;
        double luasPermukaan = (2 * luasAlas) + (kelilingAlas * tPrisma);

        System.out.println("Luas Permukaan Prisma Segitiga = " + luasPermukaan);
        System.out.println("Volume Prisma Segitiga = " + volume);
    }

    public static void main(String[] args) {
        System.out.println("=== Program Hitung Bangun ===");
        System.out.println("1. Layang-layang");
        System.out.println("2. Prisma Segitiga");
        System.out.print("Pilih bangun (1-2): ");
        int pilih = input.nextInt(); 
    

        switch (pilih) {
            case 1: layangLayang(); break;
            case 2: prismaSegitiga(); break;
            default: System.out.println("Pilihan tidak valid!");
        }
}
}
