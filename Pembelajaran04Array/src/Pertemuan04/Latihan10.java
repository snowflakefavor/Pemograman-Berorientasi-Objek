package Pertemuan04;

import javax.swing.*;
import java.util.ArrayList;

public class Latihan10 {
    public static void main(String[] args) {
        String[] field = {"Nama Lengkap", "Alamat", "No Telp"};
        ArrayList<String> data = new ArrayList<>();

        for (String f : field) {
            data.add(JOptionPane.showInputDialog("Masukkan " + f + ":"));
        }

        String output = "Nama Lengkap: " + data.get(0) + 
                        "\nAlamat: " + data.get(1) + 
                        "\nNo Telp: " + data.get(2);

        JOptionPane.showMessageDialog(null, output, "Data Diri (ArrayList)", JOptionPane.INFORMATION_MESSAGE);
    }
}