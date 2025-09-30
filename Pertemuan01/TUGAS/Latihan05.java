package Pertemuan01;
import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata: ");
        String teks = in.nextLine();

        String hasil = teks.toUpperCase();

        System.out.println("Hasil : " + hasil);
        
        in.close();
    }
}