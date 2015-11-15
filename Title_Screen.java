package Game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import java.io.File;
import java.io.IOException;

import  sun.audio.*;

import java.io.*;


public class Title_Screen {	
	
		//PlaySound//
		static void PlaySound(File sound) {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			} catch(Exception e) {
				System.out.print("File error");
			}// end of try and catch
		}// end of play sound
		
	
	//main//
	public static void main(String args[]){
		//setting up the screen//
		
		final JFrame title_frame = new JFrame("Legend of Pong"); // creates a frame to use
		
		// Background image //
		JLabel Background = new JLabel(new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\titleScreen.jpg")); // gets and holds the background image
		title_frame.setContentPane(Background); // sets the background image
		
		//button sounds//
		final File pressStart = new File("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Sounds\\pressStart.wav");
		final File pressExit = new File("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Sounds\\pressExit.wav");
		
		// Buttons //
		JButton Play = new JButton("Play"); // creates the play button
		Play.setBounds(400, 175, 75, 35); // creates button at location and with size
		Play.setVisible(true); // displays button
		Play.setEnabled(true); // makes it an active button
		title_frame.add(Play); // adds button to frame
		Play.addActionListener(new ActionListener() { // when Play button is pressed
		    public void actionPerformed(ActionEvent e) {
		    	PlaySound(pressStart);
		    	Game_Screen.main(null); // calls main method of game_screen
		    	title_frame.setVisible(false); // gets rid of the title screen
		    }
		});
		JButton Exit = new JButton("Exit"); // creates exit button
		Exit.setBounds(400, 225, 75, 35); // creates button at location and with size
		Exit.setVisible(true); // displays button
		Exit.setEnabled(true); // makes it an active button
		title_frame.add(Exit); // adds button to frame
		Exit.addActionListener(new ActionListener() { // when exit button is pressed
		    public void actionPerformed(ActionEvent e) {
		    	PlaySound(pressExit);
		    	title_frame.setVisible(false); // close the window
		    }
		}); // end of button event
		
		// Title of Game //
		JLabel Title = new JLabel("Legend of Pong"); // creates game title
		Title.setBounds(325, 50, 300, 75); // creates label at location and with size
		title_frame.add(Title); // adds title of game to the frame
		Title.setFont(new Font("Courier New", Font.BOLD, 25)); // sets font and size of font
		//Music// "C:/Users/Daniel/workspace/Pong_Game/src/resources/Sounds/Main_Menu.mp3"
		
		
		
		
		//finalizing and visually creating the frame//
		title_frame.setResizable(false); // frame can't be resized
		title_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // default exiting routine
		title_frame.setVisible(true); // sets frame to be visible
		title_frame.pack(); //creates the whole visual appeal
	}// end of main

	
	
	
}// end of class

