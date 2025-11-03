package Pertemuan04;

import javax.swing.JOptionPane;

public class Latihan07 {
    public static void main(String[] args) {
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        JOptionPane.showMessageDialog(null, "Masukkan elemen matriks A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("A[" + i + "][" + j + "] = "));
            }
        }

        JOptionPane.showMessageDialog(null, "Masukkan elemen matriks B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = Integer.parseInt(JOptionPane.showInputDialog("B[" + i + "][" + j + "] = "));
            }
        }

        String operasi = JOptionPane.showInputDialog("Masukkan operasi: (+ untuk tambah, - untuk kurang)");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (operasi.equals("+")) {
                    C[i][j] = A[i][j] + B[i][j];
                } else {
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
        }

        String output = "Hasil Matriks C:\n";
        for (int[] row : C) {
            output += row[0] + " " + row[1] + "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Hasil Operasi Matriks", JOptionPane.INFORMATION_MESSAGE);
    }
}