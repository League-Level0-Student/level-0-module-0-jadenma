package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
//score
		int score = 0;
//question 1
		String input = JOptionPane.showInputDialog("What is 1 + 1?");
		if (input.equalsIgnoreCase("2")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!! Your score is now 1");

			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!! You did not earn a point");
		}
//question 2

		input = JOptionPane.showInputDialog("What is 2 + 2?");
		if (input.equalsIgnoreCase("4")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!! Your score is now 2");

			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!! You did not earn a point");
		}
//question 3

		input = JOptionPane.showInputDialog("What is 3 + 3?");
		if (input.equalsIgnoreCase("6")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!! Your score is now 3");

			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!! You did not earn a point");
		}
//question 4

		input = JOptionPane.showInputDialog("What is 4 + 4?");
		if (input.equalsIgnoreCase("8")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!! Your score is now 4");

			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!! You did not earn a point");
		}
//question 5

		input = JOptionPane.showInputDialog("What is 5 x 5?");
		if (input.equalsIgnoreCase("25")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!! Your score is now 5");

			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!! You did not earn a point");
		}
//final score
		JOptionPane.showMessageDialog(null, "Your final score is "+score+"");
	}

}
