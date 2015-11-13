package Game;

public class Ball {
	
	private int xdir,ydir,x,y;
	
	//constructor//
	public Ball() {
		xdir = 0;
		ydir = 0;
		resetLoc();
	} // end of constructor
	
	public void move() {
        
        x = xdir;
        y = ydir;

        if (x == 0) {
            setXDir(1);
        }// end of if
        if (x == 800 - 8) {
            setXDir(-1);
        }// end of if
        if (y == 0) {
            setYDir(1);
        }// end of if
    } // end of move
	
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
