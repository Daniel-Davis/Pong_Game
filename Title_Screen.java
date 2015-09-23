package Game;
import java.awt.*;
import javax.swing.JFrame;

public class Title_Screen extends JFrame{
	public static void main(String[] args) {
		DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN); // creates local displaymode
		Title_Screen ts = new Title_Screen(); // creates local title screen
		ts.run(dm); // runs the screen
	} // end of main
	
	public void run(DisplayMode dm) { // run method
		setBackground(Color.blue); // test background
		setForeground(Color.yellow); // text front color
		setFont(new Font("Ariel",Font.PLAIN, 24)); // test font
		
		Screen s = new Screen(); // creates a new instance of screen class
		try{
			s.setFullScreen(dm, this); // sets it to full screen
			try{
				Thread.sleep(5000); // displays my test view for 5 secs
			}catch(Exception ex){}
		}finally{
			s.restoreScreen(); // then exits the screen view
		}
	} // end of run method
	
	public void paint(Graphics g) {
		g.drawString("Two buttons and game title: here", 200, 200); // simply displays some test text
	}// end of paint method
	
}// end of class
