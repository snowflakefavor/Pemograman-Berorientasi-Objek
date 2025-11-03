package Pertemuan04;

import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah array:"));
        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            nilai[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka untuk data ke-" + i));
        }

        String output = "";
        for (int i = 0; i < jumlah; i++) {
            output += "x[" + i + "] = " + nilai[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}
