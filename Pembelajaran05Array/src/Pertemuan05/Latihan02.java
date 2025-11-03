package Pertemuan05;
import javax.swing.*;
import java.util.ArrayList;

public class Latihan02 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        JOptionPane.showMessageDialog(null, "Input elemen untuk matriks A (2x2)");
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                int value = Integer.parseInt(JOptionPane.showInputDialog("Masukkan elemen A[" + i + "][" + j + "]:"));
                row.add(value);
            }
            A.add(row);
        }

        JOptionPane.showMessageDialog(null, "Input elemen untuk matriks B (2x2)");
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                int value = Integer.parseInt(JOptionPane.showInputDialog("Masukkan elemen B[" + i + "][" + j + "]:"));
                row.add(value);
            }
            B.add(row);
        }

        int[][] C = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A.get(i).get(k) * B.get(k).get(j);
                }
            }
        }

        StringBuilder output = new StringBuilder("Hasil C = A x B:\n");
        for (int i = 0; i < 2; i++) {
            output.append(C[i][0]).append(" ").append(C[i][1]).append("\n");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}
