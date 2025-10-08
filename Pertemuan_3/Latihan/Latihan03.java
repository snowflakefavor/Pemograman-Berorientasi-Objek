package Pertemuan_3;

import javax.swing.JOptionPane;

public class Latihan03 {
	public static void main(String[] args) {
	    String inputAngka1;
	    String inputAngka2;
	    double angka1, angka2, hasil;

	    inputAngka1 = JOptionPane.showInputDialog(null, 
	        "Masukan Angka Pertama",
	        "Input Angka 1",
	        JOptionPane.QUESTION_MESSAGE);

	    if (inputAngka1 == null || inputAngka1.trim().isEmpty()) {
	        JOptionPane.showMessageDialog(null, 
	            "Input angka pertama dibatalkan atau kosong",
	            "Error",
	            JOptionPane.ERROR_MESSAGE);
	    }

	    inputAngka2 = JOptionPane.showInputDialog(null, 
	        "Masukan Angka Kedua",
	        "Input Angka 2",
	        JOptionPane.QUESTION_MESSAGE);

	    if(inputAngka2 == null || inputAngka2.trim().isEmpty()) {
	        JOptionPane.showMessageDialog(null,
	            "Input angka kedua dibatalkan atau kosong",
	            "Error",
	            JOptionPane.ERROR_MESSAGE);
	    }

	    try {
	        angka1 = Double.parseDouble(inputAngka1);
	        angka2 = Double.parseDouble(inputAngka2);

	        hasil = angka1 + angka2;

	        String pesanHasil = "Hasil Penjumlahan: \n"
	                + angka1 
	                + " + " 
	                + angka2 
	                + " = " 
	                + hasil;
	            JOptionPane.showMessageDialog(null, 
	                pesanHasil, 
	                "Hasil Perhitungan", 
	                JOptionPane.INFORMATION_MESSAGE);

	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, 
	                "Input Nilai tidak Valid! Pastikan Anda Memasukan Angka", 
	                "Error Konversi", 
	                JOptionPane.ERROR_MESSAGE);
	        }
	}
}