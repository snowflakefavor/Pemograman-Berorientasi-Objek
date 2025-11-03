package Pertemuan02;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int saldo = 100000;
        int NPM = 242310046; 

        while (true) {
            System.out.print("Masukkan PIN: ");
            int pin = in.nextInt();

            if (pin != NPM) {
                System.out.println("PIN salah! Coba lagi.\n");
                continue;
            }

            int pilih;
            do {
                System.out.println("\n=== MENU ATM ===");
                System.out.println("1. Lihat Saldo");
                System.out.println("2. Setor Tunai");
                System.out.println("3. Tarik Tunai");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                pilih = in.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("Saldo Anda: Rp " + saldo);
                        break;
                    case 2:
                        System.out.print("Masukkan nominal setor: ");
                        int setor = in.nextInt();
                        saldo += setor;
                        System.out.println("Setor berhasil. Saldo sekarang: Rp " + saldo);
                        break;
                    case 3:
                        System.out.print("Masukkan nominal tarik: ");
                        int tarik = in.nextInt();
                        if (tarik <= saldo) {
                            saldo -= tarik;
                            System.out.println("Penarikan berhasil. Saldo sekarang: Rp " + saldo);
                        } else {
                            System.out.println("Saldo tidak cukup!");
                        }
                        break;
                    case 4:
                        System.out.println("Terimakasih telah menggunakan ATM.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilih != 4);
            break;
        }
    }
}