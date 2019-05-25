package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		String butter = JOptionPane.showInputDialog("What flavor would you like?");
		Popcorn popcorn = new Popcorn(butter);
		Microwave microwave = new Microwave();
		String minutes =JOptionPane.showInputDialog("How many minutes would you like to cook it?");
		microwave.setTime(Integer.parseInt(minutes));
		microwave.putInMicrowave(popcorn);
		microwave.startMicrowave();
	}
}
