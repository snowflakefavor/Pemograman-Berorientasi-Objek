package Pertemuan02;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int n = in.nextInt();
        System.out.print("Masukkan NPM : ");
        int npm = in.nextInt();

        if (n % 2 == 0) {
            System.out.println("Jumlah baris harus ganjil agar belah ketupat simetris.");
            return;
        }

        int tengah = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              
                int jarakI = Math.abs(i - tengah);
                int jarakJ = Math.abs(j - tengah);

                if (jarakJ >= tengah - jarakI) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
