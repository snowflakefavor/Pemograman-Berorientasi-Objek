package Pertemuan_3;

import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();

        String nama = jop.showInputDialog(null, "Masukkan Nama Anda:");
        System.out.println(nama);
        
        int confirm = jop.showConfirmDialog(null,
                "Apakah ini kelas PBO?",
                "Konfirmasi",
                jop.YES_NO_OPTION);

            if (confirm == 1) {
                jop.showMessageDialog(null, "Anda memilih NO!");
            } else {
                jop.showMessageDialog(null, "Anda memilih YES!");
            } 
    }
}