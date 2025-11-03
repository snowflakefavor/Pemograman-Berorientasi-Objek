package Pertemuan04;
import javax.swing.JOptionPane;

public class Latihan04 {
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah array:"));
        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            nilai[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka untuk data ke-" + i + ":"));
        }

        int max = nilai[0];
        int min = nilai[0];
        String output = "Output Array:\n";

        for (int i = 0; i < jumlah; i++) {
            output += "x[" + i + "] = " + nilai[i] + "\n";
            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];
        }

        output += "\nNilai terbesar adalah " + max;
        output += "\nNilai terkecil adalah " + min;

        JOptionPane.showMessageDialog(null, output, "Hasil", JOptionPane.INFORMATION_MESSAGE);
    }
}