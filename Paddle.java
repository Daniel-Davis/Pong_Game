package Game;

import java.awt.Component;
import java.awt.event.KeyEvent;

public class Paddle extends Component{
	   public static final int Height = 84;       // Size of Paddle
	   public static final int Width = 57;        // Size of Paddle
	   private static final int Move = Height/2;  // Size of each move
	   private static final int Border = 0;		  // Edge of screen
	   private int gameAreaHeight;				  // Height of game area
	   private int locationX, locationY;		  // locations of x and y

	   //Constructor//
	   public Paddle () {
	       gameAreaHeight  = 500;
	       locationX = 107-Width;
	       locationY = gameAreaHeight/2;
	   }// end of constructo
	   
	   public void resetLocation() {
	       gameAreaHeight  = 500;
	       locationX = 70-Width;
	   }// end of reset location
	   
	   public int getHeight() {
		   return Height;
	   }// end of get height
	   
	   public int getWidth() {
		   return Width;
	   }// end of get width
	   
	   public int getX() {
	         return locationX;
	   }// end of get x
	   
	   public int getY() {
	         return locationY;
	    }// end of get y
	   
	    public void keyPressed(KeyEvent e) { // key pressed
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_DOWN) { // moves down if button pressed
	            locationY = -1;
	        }// end of down
	        if (key == KeyEvent.VK_UP) { // moves up if button pressed
	            locationY = 1;
	        }// end of up
	    }// end of key pressed

	    public void keyReleased(KeyEvent e) { // key released
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_DOWN) {
	            locationY = 0;
	        }// end up down
	        if (key == KeyEvent.VK_UP) {
	            locationY = 0;
	        }// end of up
	    } // end of key released
	   
	} // Paddle