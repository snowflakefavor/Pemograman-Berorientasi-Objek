package Pertemuan05;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Latihan04 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> data = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ArrayList<String> row = new ArrayList<>();
            String nama = JOptionPane.showInputDialog("Masukkan Nama Lengkap:");
            String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");
            String telp = JOptionPane.showInputDialog("Masukkan No Telp:");
            row.add(nama);
            row.add(alamat);
            row.add(telp);
            data.add(row);
        }

        data.sort(Comparator.comparing(o -> o.get(0).toLowerCase()));

        StringBuilder output = new StringBuilder("Data Tersortir (Ascending):\n");
        for (ArrayList<String> row : data) {
            output.append("Nama: ").append(row.get(0))
                  .append("\nAlamat: ").append(row.get(1))
                  .append("\nTelp: ").append(row.get(2))
                  .append("\n\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
