package Game;

public class Paddle {
	   public static final int Height = 30;        // Size of Paddle
	   public static final int Width = 20;        // Size of Paddle
	   private static final int Move = Height/2;  // Size of each move
	   private static final int Border = 0;
	   private int gameAreaHeight;
	   private int locationX, locationY;

	   //Constructor//
	   public Paddle () {
	       gameAreaHeight  = 500;
	       locationX = 800-Width;
	       locationY = gameAreaHeight/2;
	   }
	   //reset Location
	   public void resetLocation() {
	       gameAreaHeight  = 500;
	       locationX = 800-Width;
	   }
	   //get x location
	   public int getX() {
	         return locationX;
	   }
	   //get y location
	   public int getY() {
	         return locationY;
	    }
	   //move up 
	   public void moveUp () {
	       if (locationY > Border )
	           locationY -= Move;
	   }
	   //move down
	   public void moveDown() {
	       if (locationY + Height < gameAreaHeight - Border)
	           locationY += Move;
	   }
	   
	} // Paddle
