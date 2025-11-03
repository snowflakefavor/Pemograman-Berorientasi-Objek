package Pertemuan04;

import javax.swing.*;
import java.util.ArrayList;

public class Latihan09 {
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah angka:"));
        ArrayList<Integer> angka = new ArrayList<>();

        for (int i = 0; i < jumlah; i++) {
            angka.add(Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka ke-" + i + ":")));
        }

        int max = angka.get(0);
        int min = angka.get(0);

        String output = "Data ArrayList:\n";
        for (int i = 0; i < angka.size(); i++) {
            output += "x[" + i + "] = " + angka.get(i) + "\n";
            if (angka.get(i) > max) max = angka.get(i);
            if (angka.get(i) < min) min = angka.get(i);
        }

        output += "\nNilai terbesar = " + max + "\nNilai terkecil = " + min;

        JOptionPane.showMessageDialog(null, output);
    }
}