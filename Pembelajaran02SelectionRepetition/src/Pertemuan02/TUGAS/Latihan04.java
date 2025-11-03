package Pertemuan02;

import java.util.*;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka (>=20): ");
        int angka = in.nextInt();
        System.out.print("Masukkan NPM: ");
        int npm = in.nextInt();

        ArrayList<Integer> faktor = new ArrayList<>();
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0)
                faktor.add(i);
        }

        if (npm % 2 == 0) { 
            System.out.print("ASC: Faktor " + angka + " adalah ");
            for (int i = 0; i < faktor.size(); i++) {
                System.out.print(faktor.get(i));
                if (i < faktor.size() - 1) System.out.print(", ");
            }
        } else {
            System.out.print("DESC: Faktor " + angka + " adalah ");
            for (int i = faktor.size() - 1; i >= 0; i--) {
                System.out.print(faktor.get(i));
                if (i > 0) System.out.print(", ");
            }
        }
    }
}