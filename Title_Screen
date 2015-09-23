package Game;
import java.awt.*;
import javax.swing.JFrame;

public class Title_Screen extends JFrame{
	public static void main(String[] args) {
		DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN);
		Title_Screen ts = new Title_Screen();
		ts.run(dm);
	} // end of main
	
	public void run(DisplayMode dm) {
		setBackground(Color.blue);
		setForeground(Color.yellow);
		setFont(new Font("Ariel",Font.PLAIN, 24));
		
		Screen s = new Screen();
		try{
			s.setFullScreen(dm, this);
			try{
				Thread.sleep(5000);
			}catch(Exception ex){}
		}finally{
			s.restoreScreen();
		}
	} // end of run method
	
	public void paint(Graphics g) {
		g.drawString("Two buttons and game title: here", 200, 200);
	}
	
}// end of class
