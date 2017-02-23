package example_1;

import javax.swing.JOptionPane;

public class ToLowerCase {
	public static void main(String[] args) {
		String st = "Meu_Nome@SERvidor.com.BR";
		String st_aux = st;
		st = st.toLowerCase();
		JOptionPane.showMessageDialog(null, "o e-mail digitado foi:    "+ st_aux +"    e o e-mail armazenado foi:    "+ st);
	}

}
