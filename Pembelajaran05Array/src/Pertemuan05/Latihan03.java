package Pertemuan05;
import javax.swing.*;
import java.util.ArrayList;

public class Latihan03 {
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

        StringBuilder output = new StringBuilder("Data Mahasiswa:\n");
        for (ArrayList<String> row : data) {
            output.append("Nama: ").append(row.get(0))
                  .append("\nAlamat: ").append(row.get(1))
                  .append("\nTelp: ").append(row.get(2))
                  .append("\n\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
