package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
//score
		int score = 0;
//question 1
		String input = JOptionPane.showInputDialog("What is 1 + 1?");
		if (input.equalsIgnoreCase("2")) {
			score++;
			JOptionPane.showMessageDialog(null, "CORRECT!!! Your score is now "+score+"");

		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!! You did not earn a point");
		}
//question 2

		input = JOptionPane.showInputDialog("What is 2 + 2?");
		if (input.equalsIgnoreCase("4")) {
			score++;
			JOptionPane.showMessageDialog(null, "CORRECT!!! Your score is now "+score+"");

		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!! You did not earn a point");
		}
//question 3

		input = JOptionPane.showInputDialog("What is 3 + 3?");
		if (input.equalsIgnoreCase("6")) {
			score++;
			JOptionPane.showMessageDialog(null, "CORRECT!!! Your score is now "+score+"");
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!! You did not earn a point");
		}
//question 4

		input = JOptionPane.showInputDialog("What is 4 + 4?");
		if (input.equalsIgnoreCase("8")) {
			score++;
			JOptionPane.showMessageDialog(null, "CORRECT!!! Your score is now "+score+"");

		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!! You did not earn a point");
		}
//question 5

		input = JOptionPane.showInputDialog("What is 5 x 5?");
		if (input.equalsIgnoreCase("25")) {
			score++;
			JOptionPane.showMessageDialog(null, "CORRECT!!! Your score is now "+score+"");

		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!! You did not earn a point");
		}
//final score
		JOptionPane.showMessageDialog(null, "Your final score is "+score+"");
	}

}
