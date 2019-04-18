package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		
		int score = 0;
		// 2.  Ask the user a question 
		String answer1 = JOptionPane.showInputDialog("How many rings does Michael Jordan have in the NBA?");
		String answer2 = JOptionPane.showInputDialog("How many Harry Potter movies are there?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer1.equals("6")){
			score+=5;
		}else {score--;}
		
		if(answer2.equals("8")) {
			score+=5;
	}else {score--;}
				
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
			}
}

