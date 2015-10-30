package Game;

//Imports//
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Game_Screen {
	//Variables//
	private static int Score = 0;
	private static int Life = 3;
	Timer timer;
	
	//Main//
	public static void main(String args[]){
	/////Building the display/////
		JFrame game_frame = new JFrame("Legend of Pong");
		JLabel Background = new JLabel(new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\gameScreen.jpg"));
		game_frame.setContentPane(Background);
		game_frame.pack();
		game_frame.setResizable(false);
		game_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		game_frame.setVisible(true);
		
		//setting the header section//
		
		//Score//
		int score = getScore(); // int to hold score value
		JLabel scoreL = new JLabel(); // label to display score
		scoreL.setText(String.valueOf(score)); // connects label and int
		scoreL.setBounds(100, 15, 200, 35); // sets location of score
		scoreL.setFont(new Font("Courier New", Font.BOLD, 20)); // sets font and size of font
		scoreL.setForeground(Color.GREEN); // sets color of Score
		game_frame.add(scoreL); // adds score
		//Timer// //???//
		//Life//
		int life = getLife(); // int to hold value of lives left
		JLabel lifeL = new JLabel(); // label to hold life
		lifeL.setText(String.valueOf(life)); // connects label and int
		lifeL.setBounds(700, 15, 200, 35); // sets location of life
		lifeL.setFont(new Font("Courier New", Font.BOLD, 20)); // sets font and size of font
		lifeL.setForeground(Color.GREEN); // sets color of life
		game_frame.add(lifeL); // adds life
		
	}// end of main
	
	//Setters and getters//
	public static int getScore() {
		int score=Score;
		return score;
	}// end of getScore
	public static int setScore(int score) {
		score=Score;
		return score;
	}// end of setScore
	public static int getLife() {
		int life=Life;
		return life;
	}// end of getLife
	public static int setLife(int life) {
		life=Life;
		return life;
	}// end of setLife
	//End Of Setters & Getters//
	
	
	//Methods//
	public void update(){
		
		
		
	} // end of update
	
}// end of class
