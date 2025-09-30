package Pertemuan01;

import java.util.Scanner;

public class Latihan01 {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Celcius : ");
	float Celcius = in.nextFloat();
	
	float Farenheit = (Celcius * (9/5f)) + 32;
	System.out.print("Farenheit : ");
	System.out.println(Farenheit);
	
	
	float Reamur = (Celcius * (4/5f));
	System.out.print("Reamur : ");
	System.out.println(Reamur);
	
	float Kelvin = (Celcius + 273.15f );
	System.out.print("Kelvin : ");
	System.out.println(Kelvin);
	
	in.close();
	}

}