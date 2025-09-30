package Pertemuan01;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan04 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        int harga = 6300;
        System.out.println("===============================");
        System.out.println("       TOKO SERBAGUNA IBIK");
        System.out.println("===============================");
        System.out.print("Masukkan jumlah produk yang dibeli: ");
        int qty = in.nextInt();

        int total = qty * harga;

        double diskon = 0;
        if (qty % 3 == 0) {
            diskon = 0.05 * total; 
        } else if (qty == 7) {
            diskon = 0.10 * total;
        }

        double subTotal = total - diskon;

    
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println(now.format(fmt));
        System.out.println("ITEM        QTY   HARGA   TOTAL");
        System.out.println("===============================");
        System.out.println("ROTI ENAK   " + qty + "    " + harga + "    " + total);
        System.out.println("-------------------------------");
        System.out.println("Diskon   : " + (int)diskon);
        System.out.println("SubTotal : " + (int)subTotal);
        System.out.println("===============================");
        
        in.close();
    }
}