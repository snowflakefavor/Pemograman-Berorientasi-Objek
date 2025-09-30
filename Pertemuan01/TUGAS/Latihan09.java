package Pertemuan01;
import java.util.Scanner;

class Students {
    int NPM;
    String Fullname;
    String ClassName;
    int Semester;
    float GPA;

    int getNPM(int value) {
        NPM = value;
        return NPM;
    }

    String getFullname(String value) {
        Fullname = value;
        return Fullname;
    }

    String getClassName(String value) {
        ClassName = value;
        return ClassName;
    }

    int getSemester(int value) {
        Semester = value;
        return Semester;
    }

    float getGPA(float value) {
        GPA = value;
        return GPA;
    }
}

public class Latihan09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Students myBio = new Students();

        System.out.print("Masukkan NPM: ");
        int npm = in.nextInt();
        myBio.getNPM(npm);

        in.nextLine(); 
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = in.nextLine();
        myBio.getFullname(nama);

        System.out.print("Masukkan Nama Kelas: ");
        String kelas = in.nextLine();
        myBio.getClassName(kelas);

        System.out.print("Masukkan Semester: ");
        int semester = in.nextInt();
        myBio.getSemester(semester);

        System.out.print("Masukkan GPA: ");
        float gpa = in.nextFloat();
        myBio.getGPA(gpa);

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NPM       : " + myBio.NPM);
        System.out.println("Nama      : " + myBio.Fullname);
        System.out.println("Kelas     : " + myBio.ClassName);
        System.out.println("Semester  : " + myBio.Semester);
        System.out.println("GPA       : " + myBio.GPA);

        in.close();
    }
}