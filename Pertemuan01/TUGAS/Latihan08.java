package Pertemuan01;

import java.util.Scanner;

public class Latihan08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print(" NPM : ");
		String NPM = in.nextLine();
		
		System.out.print(" Nama Lengkap : ");
		String Nama = in.nextLine();
		
		System.out.print(" Nama Kelas : ");
		String Kelas = in.nextLine();
		
		System.out.print(" Semester : ");
		String Semester = in.nextLine();
		
		System.out.print(" IPK : ");
		String IPK = in.nextLine();
		
		System.out.println(" NPM : " + NPM);
		
		System.out.println(" Nama Lengkap : " + Nama);
		
		System.out.println(" Nama Kelas : " + Kelas);
		
		System.out.println(" Seemester : " + Semester);
		
		System.out.println(" IPK : " + IPK);
		
		in.close();
	}
	
}