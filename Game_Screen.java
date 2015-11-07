package Game;

//Imports//
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Game_Screen {
	//Global Variables//
	int ScreenHeight = 500;
	int ScreenWidth = 800;
	static boolean running = true;
	static long Score = 0;
	static int Life = 3;
	static int Time;
	
	
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
		long score = getScore(); // int to hold score value
		JLabel scoreL = new JLabel(); // label to display score
		scoreL.setText(String.valueOf(score)); // connects label and int
		scoreL.setBounds(100, 15, 200, 35); // sets location of score
		scoreL.setFont(new Font("Courier New", Font.BOLD, 20)); // sets font and size of font
		scoreL.setForeground(Color.GREEN); // sets color of Score
		game_frame.add(scoreL); // adds score
		
		//Timer// //WORK ON NOW!!!!//
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
		//Paddle//
		Paddle link = new Paddle();
		//Finish above code!!!!//
		
		//run()

		
		
		
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
	public static void run(){
		//variables//
		final int TARGET_FPS = 60;
		final int OPTIMAL_TIME = 1000000000 / TARGET_FPS;
		long lastLoopTime = System.nanoTime();
		long lastFpsTime = 0;
		
		while(running == true) {
			//local variables//
			long start = System.nanoTime();
			lastLoopTime = start;
			long elapsed = start - lastLoopTime;
	        double delta = elapsed / ((double)OPTIMAL_TIME);
			
	        lastFpsTime += elapsed;
	        if(lastFpsTime >= 1000000000) {
	            lastFpsTime = 0;
	        } // end of if
			
	        update(delta);
	        
			redraw();
	        
			
			try {
				Thread.sleep( (lastLoopTime-System.nanoTime() + OPTIMAL_TIME)/1000000 );
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // end of try and catch
		
		} // end of while loop
			
			
		
	} // end of run method

	
	//game update//
	private static void update(double delta) {
		Time++;
		
		
	} // end of update
	
	//redraws the screen//
	private static void redraw() {
		
		
		
	} // end of redraw
	
}// end of class
