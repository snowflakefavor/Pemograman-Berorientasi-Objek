package Pertemuan04;
import javax.swing.JOptionPane;

public class Latihan06 {
    public static void main(String[] args) {
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];

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

        String output = "Matriks A:\n";
        for (int[] row : A) {
            output += row[0] + " " + row[1] + "\n";
        }

        output += "\nMatriks B:\n";
        for (int[] row : B) {
            output += row[0] + " " + row[1] + "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Hasil Matriks", JOptionPane.INFORMATION_MESSAGE);
    }
}