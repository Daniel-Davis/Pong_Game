package Game;

//Imports//
import java.awt.*;

import javax.swing.*;

import java.util.Timer;

public class Game_Screen {
	
	//main//
	public static void main(String args[]){
		JFrame game_frame = new JFrame("Legend of Pong");
		JLabel Background = new JLabel(new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\gameScreen.jpg"));
		game_frame.setContentPane(Background);
		game_frame.pack();
		game_frame.setResizable(false);
		game_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		game_frame.setVisible(true);
		
	}// end of main
	
	
}// end of class
