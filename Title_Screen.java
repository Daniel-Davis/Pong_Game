package Game;

import java.awt.*;

import javax.swing.*;

import java.util.Timer;

public class Title_Screen {
	//main//
	public static void main(String args[]){
		//setting up the screen//
		
		JFrame title_frame = new JFrame("Legend of Pong"); // creates a frame to use
		// Background image //
		
		JLabel Background = new JLabel(new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\titleScreen.jpg")); // gets and holds the background image
		title_frame.setContentPane(Background); // sets the background image
		// Buttons //
		
		JButton Play = new JButton(); // creates the play button
		Play.setLocation(100, 400); // sets button location
		Play.setPreferredSize(new Dimension(50,75)); // sets button size
		Play.setVisible(true); // displays button
		Play.setEnabled(true); // makes it an active button
		JButton Exit = new JButton();
		Exit.setLocation(200,400); // sets button location
		Exit.setPreferredSize(new Dimension(50,75)); // sets button size
		Exit.setVisible(true); // displays button
		Exit.setEnabled(true); // makes it an active button
		// Title of Game //
		
		JLabel Title = new JLabel("Legend of Pong");
		title_frame.pack();
		title_frame.setResizable(false);
		title_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		title_frame.setVisible(true);
		
	}// end of main
	
}// end of class

