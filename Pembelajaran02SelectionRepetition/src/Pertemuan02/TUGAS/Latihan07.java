package Pertemuan02;

import java.util.Scanner;

public class Resto {
    private long Harga;

    public void chooseMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu: ");
        int pilih = in.nextInt();

        getPrices(pilih);
        System.out.println("Harga: Rp " + Harga);
    }

    private void getPrices(int menu) {
        if (menu == 1)
            Harga = 22000;
        else if (menu == 2)
            Harga = 15000;
        else if (menu == 3)
            Harga = 25000;
        else
            Harga = 0;
    }
}

class Latihan07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ulang;
        Resto resto = new Resto();

        do {
            resto.chooseMenu();
            System.out.print("Apakah anda akan memesan kembali? (y/n): ");
            ulang = in.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terimakasih telah memesan.");
    }
}