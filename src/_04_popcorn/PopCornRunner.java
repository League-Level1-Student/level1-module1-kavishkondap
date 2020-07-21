package _04_popcorn;

import javax.swing.JOptionPane;

public class PopCornRunner {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog(null,"What flavor of popcorn?");
	Popcorn popcorn = new Popcorn (flavor);
	Microwave microwave = new Microwave ();
	String time = JOptionPane.showInputDialog(null,"How many minutes to cook the popcorn?");
	microwave.putInMicrowave(popcorn);
	int minutes = Integer.parseInt(time);
	microwave.setTime(minutes);
}
}
