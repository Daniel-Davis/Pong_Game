package Game;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.util.Timer;


public class Title_Screen extends JFrame{
	
	//variables//
	private Screen s;
	private Image bg;
	private boolean loaded;
	private Button play;
	private Button exit;
	Timer timer = new Timer();
	
	
	//methods//
	// main //
	public static void main(String[] args) {
		DisplayMode dm = new DisplayMode(1900,1200,16,DisplayMode.REFRESH_RATE_UNKNOWN); // creates local displaymode
		Title_Screen ts = new Title_Screen(); // creates local title screen
		ts.run(dm); // runs the screen
	} // end of main
	
	// load pictures //
	public void loadPics() {
		bg = new ImageIcon("C:\\Users\\Daniel\\workspace\\Pong_Game\\src\\resources\\Pics\\.Title_Screen.jpg").getImage(); // sets global variable bg to get the back ground image
		loaded = true; // images are loaded
		repaint(); // repaints/refreshes the screen
	} // end of loadPics method
	
	
	// run //
	public void run(DisplayMode dm) {
		setBackground(Color.blue); // test background
		setForeground(Color.yellow); // text front color
		setFont(new Font("Ariel",Font.PLAIN, 24)); // test font
		loaded = false; // no images are loaded
		
		s = new Screen(); // creates a new instance of screen class
		try{
			s.setFullScreen(dm, this); // sets it to full screen
			loadPics(); // loads images for screen
			try{
				Thread.sleep(5000); // displays my test view for 5 seconds
			}catch(Exception ex){}
		}finally{
			s.restoreScreen(); // then exits the screen view
		}
	} // end of run method
	
	// paint //
	public void paint(Graphics g) {
		if(loaded == true) { // if images are loaded
			g.drawImage(bg,0,0,null); // draws background image - - - - FIX!! NO IMAGE DISPLAYS?????
		}// end of if
	}// end of paint method
	
}// end of class
