package Game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.applet.*;
import java.io.*;
public class Title_Screen {	
	
	//main//
	public static void main(String args[]){
		//setting up the screen//
		
		final JFrame title_frame = new JFrame("Legend of Pong"); // creates a frame to use
		
		// Background image //
		JLabel Background = new JLabel(new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\titleScreen.jpg")); // gets and holds the background image
		title_frame.setContentPane(Background); // sets the background image
		
		// Buttons //
		JButton Play = new JButton("Play"); // creates the play button
		Play.setBounds(400, 175, 75, 35); // creates button at location and with size
		Play.setVisible(true); // displays button
		Play.setEnabled(true); // makes it an active button
		title_frame.add(Play); // adds button to frame
		Play.addActionListener(new ActionListener() { // when Play button is pressed
		    public void actionPerformed(ActionEvent e)
		    {
		       Game_Screen gs = new Game_Screen(); // creates new game screen
		       gs.main(null); // displays new game screen
		       title_frame.setVisible(false); // gets rid of the title screen
		    }
		});
		JButton Exit = new JButton("Exit"); // creates exit button
		Exit.setBounds(400, 225, 75, 35); // creates button at location and with size
		Exit.setVisible(true); // displays button
		Exit.setEnabled(true); // makes it an active button
		title_frame.add(Exit); // adds button to frame
		Exit.addActionListener(new ActionListener() { // when exit button is pressed
		    public void actionPerformed(ActionEvent e)
		    {
		       title_frame.setVisible(false); // close the window
		    }
		}); // end of button event
		
		// Title of Game //
		JLabel Title = new JLabel("Legend of Pong"); // creates game title
		Title.setBounds(400, 50, 200, 75); // creates label at location and with size
		title_frame.add(Title); // adds title of game to the frame
		
		//Music//
		
		//finalizing and visually creating the frame//
		title_frame.setResizable(false); // frame can't be resized
		title_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // default exiting routine
		title_frame.setVisible(true); // sets frame to be visible
		title_frame.pack(); //creates the whole visual appeal
	}// end of main


	
	
}// end of class
