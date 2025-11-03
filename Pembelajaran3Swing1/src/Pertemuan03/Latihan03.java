package Pertemuan03;
import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        while (true) {
            Biodata bio = new Biodata();
            String fullname = "";
            String usiaStr = "";
            String alamat = "";

            // Input dengan validasi cancel
            fullname = JOptionPane.showInputDialog("Masukkan Nama Lengkap:");
            if (fullname == null) {
                if (konfirmasiKeluar()) break;
                else continue;
            }

            usiaStr = JOptionPane.showInputDialog("Masukkan Usia:");
            if (usiaStr == null) {
                if (konfirmasiKeluar()) break;
                else continue;
            }

            alamat = JOptionPane.showInputDialog("Masukkan Alamat:");
            if (alamat == null) {
                if (konfirmasiKeluar()) break;
                else continue;
            }

            // Validasi kosong
            if (fullname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (usiaStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (alamat.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Validasi numerik usia
            int usia = 0;
            try {
                usia = Integer.parseInt(usiaStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Isian usia harus angka", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Validasi panjang alamat
            if (alamat.length() < 10) {
                JOptionPane.showMessageDialog(null, "Masukkan alamat minimum 10 karakter", "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            // Jika semua valid → simpan ke objek
            bio.setFullname(fullname);
            bio.setUsia(usia);
            bio.setAlamat(alamat);

            // Tampilkan info data
            JOptionPane.showMessageDialog(null, bio.tampilkanData(), "Informasi", JOptionPane.INFORMATION_MESSAGE);

            // Konfirmasi keluar setelah data tampil
            int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Program selesai. Terima kasih!");
                break;
            }
        }
    }

    // Method konfirmasi keluar saat Cancel ditekan
    private static boolean konfirmasiKeluar() {
        int keluar = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        return keluar == JOptionPane.YES_OPTION;
    }
}