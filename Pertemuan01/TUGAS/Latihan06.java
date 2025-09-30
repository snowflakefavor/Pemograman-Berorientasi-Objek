package Pertemuan01;
import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Usia: ");
        String usia = in.nextLine();

        System.out.print("Masukkan Firstname: ");
        String firstname = in.nextLine();

        System.out.print("Masukkan Lastname: ");
        String lastname = in.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = in.nextLine();

        String hasil = usia.concat(firstname).concat(lastname).concat(npm);

        System.out.println("Output: " + hasil);
        
        in.close();
    }
}