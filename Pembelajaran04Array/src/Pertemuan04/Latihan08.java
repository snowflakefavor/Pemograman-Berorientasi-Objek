package Pertemuan04;

import javax.swing.JOptionPane;

public class Latihan08 {
    public static void main(String[] args) {
        String[][] data = {
            {"Septian Cahyadi", "Dramaga Cantik Residence II, Bogor", "‪+62 899-9506-210‬"},
            {"Isnan Mulia", "Jl. Manunggal, Bogor", "‪+62 819-3208-0875‬"},
            {"Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "‪+62 856-9380-0384‬"}
        };

        String output = "Daftar Data:\n\n";
        for (int i = 0; i < data.length; i++) {
            output += "Nama Lengkap: " + data[i][0] + 
                      "\nAlamat: " + data[i][1] + 
                      "\nNo Telp: " + data[i][2] + "\n\n";
        }

        JOptionPane.showMessageDialog(null, output, "Data Multidimensi", JOptionPane.INFORMATION_MESSAGE);
    }
}