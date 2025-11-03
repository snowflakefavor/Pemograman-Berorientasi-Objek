package Pertemuan03;

public class Biodata {
    private String fullname;
    private String usia;
    private String alamat;

    // Setter
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter
    public String getFullname() {
        return fullname;
    }

    public String getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }

    // Method untuk menampilkan data
    public String tampilkanData() {
        return "=== DATA BIODATA ===\n"
             + "Nama Lengkap : " + fullname + "\n"
             + "Usia         : " + usia + "\n"
             + "Alamat       : " + alamat;
    }
}