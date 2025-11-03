package Pertemuan04;

import javax.swing.JOptionPane;

public class Latihan05 {
    public static void main(String[] args) {
        String[] field = {"Nama Lengkap", "Alamat", "No Telp"};
        String[] data = new String[field.length];

        for (int i = 0; i < field.length; i++) {
            data[i] = JOptionPane.showInputDialog("Masukkan " + field[i] + ":");
        }

        String output = "Nama Lengkap: " + data[0] + 
                        "\nAlamat: " + data[1] + 
                        "\nNo Telp: " + data[2];

        JOptionPane.showMessageDialog(null, output, "Data Diri", JOptionPane.INFORMATION_MESSAGE);
    }
}
