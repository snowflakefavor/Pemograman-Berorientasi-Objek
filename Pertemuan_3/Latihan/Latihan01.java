package Pertemuan_3;


import javax.swing.JOptionPane;

public class Latihan01 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		jop.showMessageDialog(null, "This is a sample Message Dialog");
		jop.showMessageDialog(null, 
				"Pesan dengan INFORMATION MESSAGE", 
				"Pesan Informasi", 
				jop.INFORMATION_MESSAGE);
		
		jop.showMessageDialog(null, 
				"Pesan dengan WARNING MESSAGE", 
				"Pesan Warning", 
				jop.WARNING_MESSAGE);
		
		jop.showMessageDialog(null, 
				"Pesan dengan ERROR MESSAGE", 
				"Pesan Error", 
				jop.ERROR_MESSAGE);
		
		jop.showMessageDialog(null, 
				"Pesan dengan QUESTION MESSAGE", 
				"Pesan Pertanyaan", 
				jop.QUESTION_MESSAGE);
		
	}
}
