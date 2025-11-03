package Pertemuan02;
import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan NPM: ");
        int npm = in.nextInt();

        boolean prima = true;
        if (npm <= 1) prima = false;
        else {
            for (int i = 2; i <= npm / 2; i++) {
                if (npm % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima)
            System.out.println("Termasuk bilangan PRIMA");
        else
            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
    }
}
    
    
