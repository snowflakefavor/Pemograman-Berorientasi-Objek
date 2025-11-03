package Pertemuan05;
import javax.swing.*;
import java.util.ArrayList;

public class ArrayMultiDimensi {
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

        StringBuilder output = new StringBuilder("Matriks A:\n");
        for (ArrayList<Integer> row : A) {
            output.append(row.get(0)).append(" ").append(row.get(1)).append("\n");
        }

        output.append("\nMatriks B:\n");
        for (ArrayList<Integer> row : B) {
            output.append(row.get(0)).append(" ").append(row.get(1)).append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
