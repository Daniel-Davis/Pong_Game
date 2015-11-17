package Game;

import java.awt.Component;

public class Paddle extends Component{
	   public static final int Height = 84;        // Size of Paddle
	   public static final int Width = 57;        // Size of Paddle
	   private static final int Move = Height/2;  // Size of each move
	   private static final int Border = 0;
	   private int gameAreaHeight;
	   private int locationX, locationY;

	   //Constructor//
	   public Paddle () {
	       gameAreaHeight  = 500;
	       locationX = 107-Width;
	       locationY = gameAreaHeight/2;
	   }
	   
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
	   
	   public void moveUp () {
	       if (locationY > Border )
	           locationY -= Move;
	   }// end of move up
	   
	   public void moveDown() {
	       if (locationY + Height < gameAreaHeight - Border)
	           locationY += Move;
	   }// end of move up
	   
	} // Paddle