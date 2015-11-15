package Game;

//Imports//
import java.awt.*;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.util.Timer;

public class Game_Screen {
	
	//Global Variables//
	int ScreenHeight = 500;
	int ScreenWidth = 800;
	boolean running = true;
	static long Score = 0;
	static int Life = 3;
	static int Time;
	Timer timer;
	
	//Constructor//
	public Game_Screen() {
	JFrame game_frame = new JFrame("Legend of Pong");
	JLabel Background = new JLabel(new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\gameScreen.jpg"));
	game_frame.setContentPane(Background);
	game_frame.pack();
	game_frame.setResizable(false);
	game_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	game_frame.setVisible(true);
	
	//setting the header section//
	
	//Score//
	long score = getScore(); // int to hold score value
	JLabel scoreL = new JLabel(); // label to display score
	scoreL.setText("Score: " + String.valueOf(score)); // connects label and int
	scoreL.setBounds(25, 15, 200, 35); // sets location of score
	scoreL.setFont(new Font("Courier New", Font.BOLD, 20)); // sets font and size of font
	scoreL.setForeground(Color.GREEN); // sets color of Score
	game_frame.add(scoreL); // adds score
	
	//Timer//
	int time = getTime();
	JLabel timeL = new JLabel(); // label to hold time
	timeL.setText("Time: " + String.valueOf(time)); // connects label and int
	timeL.setBounds(350, 15, 200,35); // set location of time
	timeL.setFont(new Font("Courier New", Font.BOLD, 20)); // sets font and size of font
	timeL.setForeground(Color.GREEN); // sets color
	game_frame.add(timeL); // adds time
	
	//Life//
	int life = getLife(); // int to hold value of lives left
	JLabel lifeL = new JLabel(); // label to hold life
	lifeL.setText("Lives: " + String.valueOf(life)); // connects label and int
	lifeL.setBounds(700, 15, 200, 35); // sets location of life
	lifeL.setFont(new Font("Courier New", Font.BOLD, 20)); // sets font and size of font
	lifeL.setForeground(Color.GREEN); // sets color of life
	game_frame.add(lifeL); // adds life	
	
	//Paddle//?
	Paddle link = new Paddle(); // new paddle (link)
	JLabel linkL = new JLabel(new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\Link.jpg")); // new paddle image(also link)
	JPanel paddle = new JPanel(); // new Jpanel to hold the paddle object
	link.resetLocation(); // paddles gets location reset
	int paddleX = link.getX(); // stores x location of paddle
	int paddleY = link.getY(); // stores y location of paddle
	linkL.setBounds(paddleX, paddleY, 20, 30); // link image over the paddle
	paddle.add(linkL); // Jpanel gets paddle
	paddle.setVisible(true); // turns it visible
	linkL.setVisible(true); // turns image visible
	game_frame.add(paddle);
	game_frame.add(linkL);
	
	
	}// end of screen constructor
	
	
	

	
	///Methods///
	
	//getters and setters//
	public static long getScore() {
		return Score;
	}
	public void setScore(long score) {
		Score = score;
	}
	public static int getLife() {
		return Life;
	}
	public void setLife(int life) {
		Life = life;
	}
	public static int getTime() {
		return Time;
	}
	public void setTime(int time) {
		Time = time;
	}
	// end of getters and setters
	
	//game loop//
	private class gameLoop extends java.util.TimerTask{
		public void run() {
			if(!running) { // running is false
				timer.cancel(); // stop timer/loop
			} // end of if
			else if(Life == 0){
				JOptionPane.showMessageDialog(null, "Game Over");
				timer.cancel();
			}// end of else if
			else {
			update();
			redraw();
			} // end of else
		}// end of run
	} // end of gameLoop
	
		public void start(){
		timer.schedule(new gameLoop(), 0, 1000/60);
	} // end of loop method
		
	//updates anything needing an update//
	private static void update() {
		Time++;
	} // end of update
	
	//redraws the screen//
	private static void redraw() {

	} // end of redraw
	
	//PlaySound//
	static void PlaySound(File sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/1000);
		} catch(Exception e) {
		}// end of try and catch
	}// end of play sound
	
		//Main//
	public static void main(String args[]){
		Game_Screen gs = new Game_Screen();
		gs.start();
	}// end of main
	
}// end of class
