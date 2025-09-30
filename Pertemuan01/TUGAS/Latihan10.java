package Pertemuan01;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class studentss {
    String Fullname;

    String getFullname(String value) {
        Fullname = value;
        return Fullname;
    }
}

public class Latihan10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Students member = new Students();

        System.out.print("Masukkan nama member: ");
        String nama = in.nextLine();
        member.getFullname(nama);

        int harga = 6300;
        System.out.print("Masukkan jumlah produk yang dibeli: ");
        int qty = in.nextInt();
        System.out.println("===============================");
        System.out.println("       TOKO SERBAGUNA IBIK");
        System.out.println("===============================");
      

        int total = qty * harga;

        double diskon = 0.10 * total;  
        double subTotal = total - diskon;


        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println(now.format(fmt));
        System.out.println("ITEM        QTY   HARGA   TOTAL");
        System.out.println("===============================");
        System.out.println("ROTI ENAK   " + qty + "   " + harga + "   " + total);
        System.out.println("-------------------------------");
        System.out.println("Diskon     : " + (int)diskon);
        System.out.println("Sub Total  : " + (int)subTotal);
        System.out.println("Member Name: " + member.Fullname);
        System.out.println("===============================");

        in.close();
    }
}