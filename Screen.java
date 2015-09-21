package Game;
// Daniel Davis 
// Pong-like Game
// Screen class

//	Imports	//
import java.awt.*;
import javax.swing.*;
//	End of imports	//

//	Start of Class	//
public class Screen {
	//	Variables	//
	private GraphicsDevice vc; // variable to store the screen compatible with the local video/graphics card
	//	End of Variables	//
	
	//	Constructors	//
	public Screen() { // creates a screen that uses the local graphics environment
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		vc = env.getDefaultScreenDevice(); 
	}
	//	End of constructors	//

	//	Methods	//
	public void setFullScreen(DisplayMode dm, JFrame window) { // method to set game screen to full screen
		window.setUndecorated(true); // makes sure it is a blank default screen
		window.setResizable(false); // makes sure it can't change size
		vc.setFullScreenWindow(window); // gives your 
		
		if(dm != null && vc.isDisplayChangeSupported()) { // if you have any display mode and your video card display is changeable
			try{
				vc.setDisplayMode(dm); // sets the video card variable to the display mode
			}catch(Exception ex) {}
		} // end of if
	} // end of set full screen method
	
	public Window getFullScreenWindow() { // getter method for full screen
		return vc.getFullScreenWindow();
	} // end of get full screen window method
	
	public void restoreScreen() { // restores the screen to not full size
		Window window = vc.getFullScreenWindow();
		
		if(window != null) {
			window.dispose();
		} // end of if
		vc.setFullScreenWindow(null);
	} // end of restore screen method
	//	End of methods	//
	
}
//	end of Screen class	//
