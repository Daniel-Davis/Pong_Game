package Game;

import java.awt.Component;

public class Ball extends Component{
	
	private final int Height = 25;
	private final int Width = 25;
	
	private int xdir,ydir,x,y, score, life;
	
	//constructor//
	public Ball() {
		xdir = 0;
		ydir = 0;
		resetLoc();
	} // end of constructor
	
	public void move() {
        
        x = xdir;
        y = ydir;

        if (x == 0 + Width) { // if the ball hits the left edge of screen lose a life
            setXDir(1);
            life = life -1;
        }// end of if
        if (x == 800 - Width) { // if ball hits the right edge of screen gain points
            setXDir(-1);
            score = score + 25;
        }// end of if
        if (y == 0 + Height) { // if ball hits the top of screen just bounce
            setYDir(1);
        }// end of if
        if (y == 500 - Height) { // if ball hits the bottom of screen just bounce
        	setYDir(-1);
        }// end of if
    } // end of move
	
	public int getHeight() {
		return Height;
	}// end of get height
	public int getWidth() {
		return Width;
	}// end of get width
	public int getX() {
		return x;
	}//end of get X
	public int getY() {
		return y;
	}//end of get y
	public void setXDir(int x) {
		xdir = x;
	} // end of setXDir
	public int getXDir() {
		return xdir;
	} // end of getXDir
	public void setYDir(int y) {
		ydir = y;
	} // end of setYDir
	public int getYDir() {
		return ydir;
	} // end of getYDir
	
    private void resetLoc() { // middle of the right screen
        x = 800;
        y = 250;
    } // end of reset Location

	
}// end of Ball class