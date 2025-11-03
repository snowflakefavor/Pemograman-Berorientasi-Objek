package javax.swing;


public class JOptionPane {
    private String fullname;
    private String usia;
    private String alamat;

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getFullname() {
        return fullname;
    }

    public String getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }

    public String tampilkanData() {
        return "=== DATA BIODATA ===\n"
             + "Nama Lengkap : " + fullname + "\n"
             + "Usia         : " + usia + "\n"
             + "Alamat       : " + alamat;
    }
}