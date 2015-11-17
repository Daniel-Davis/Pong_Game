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
	Timer timer = new Timer();
	
	//Constructor//
	public Game_Screen() {
	JFrame game_frame = new JFrame("Legend of Pong"); // creates the jframe
	JLabel Background = new JLabel(new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\gameScreen.jpg")); // gets the BG image
	game_frame.setContentPane(Background); // places background image

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
	timeL.setText("Time(sec): " + String.valueOf(time)); // connects label and int
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
	
	//Paddle//
	JPanel paddle = new JPanel(); // new panel for paddle object and image
	Paddle object = new Paddle(); // creates new paddle object
	JLabel link = new JLabel(new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\Link.gif")); // new paddle image(also link)
	paddle.add(object); // adds the actual object
	paddle.add(link); // adds image to the paddle Panel
	paddle.setBounds(object.getX(), object.getY(), object.getWidth(), object.getHeight()); // sets location and size of the paddle
	game_frame.add(paddle); // game_frame gets link image
	
	// a single ball = test //
	JPanel ball = new JPanel(); // creates the JPanel to hold the ball object and image
	Ball obj = new Ball(); // creates the ball object
	JLabel stone = new JLabel(new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\Ball.png")); // creates the ball image
	ball.add(obj); // adds the object
	ball.add(stone); // adds the image
	ball.setBounds(750, 250, obj.getWidth(), obj.getHeight()); // sets ball location and size
	game_frame.add(ball); // adds it to the screen
	
	//final frame things//
	game_frame.pack();
	game_frame.setResizable(false);
	game_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	game_frame.setVisible(true);
	
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
			update();
			redraw();
			
			
			
			
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
