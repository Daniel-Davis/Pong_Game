package Game;

//Imports//
import java.awt.*;

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
	scoreL.setText(String.valueOf(score)); // connects label and int
	scoreL.setBounds(100, 15, 200, 35); // sets location of score
	scoreL.setFont(new Font("Courier New", Font.BOLD, 20)); // sets font and size of font
	scoreL.setForeground(Color.GREEN); // sets color of Score
	game_frame.add(scoreL); // adds score
	
	//Timer//
	int time = getTime();
	JLabel timeL = new JLabel(); // label to hold time
	timeL.setText(String.valueOf(time)); // connects label and int
	timeL.setBounds(400, 15, 200,35); // set location of time
	timeL.setFont(new Font("Courier New", Font.BOLD, 20)); // sets font and size of font
	timeL.setForeground(Color.GREEN); // sets color
	game_frame.add(timeL); // adds time
	
	//Life//
	int life = getLife(); // int to hold value of lives left
	JLabel lifeL = new JLabel(); // label to hold life
	lifeL.setText(String.valueOf(life)); // connects label and int
	lifeL.setBounds(700, 15, 200, 35); // sets location of life
	lifeL.setFont(new Font("Courier New", Font.BOLD, 20)); // sets font and size of font
	lifeL.setForeground(Color.GREEN); // sets color of life
	game_frame.add(lifeL); // adds life	
	
	//Paddle//?

	
	}// end of screen constructor
	
	
	
	//Main//
	public static void main(String args[]){
		Game_Screen gs = new Game_Screen();
		gs.start();
	}// end of main
	
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
	public void start(){
		timer.schedule(new gameLoop(), 0, 1000/60);
	} // end of loop method
	
	private class gameLoop extends java.util.TimerTask{
		public void run() {
			if(!running) { // running is false
				this.cancel(); // stop timer/loop
			} // end of if
			else if(Life == 0){
				JOptionPane.showMessageDialog(null, "Game Over");
				this.cancel();
			}// end of else if
			else {
			update();
			redraw();
			} // end of else
			
			
			
		}// end of run
	} // end of gameLoop
	
	//updates anything needing an update//
	private static void update() {
		Time++;
		
		
		
		
	} // end of update
	
	//redraws the screen//
	private static void redraw() {
		
		
		
	} // end of redraw
	
}// end of class
