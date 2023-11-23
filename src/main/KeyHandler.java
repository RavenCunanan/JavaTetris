package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	public static boolean upPressed, downPressed, leftPressed, rightPressed, reversePressed, pausePressed;
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_UP ||code == KeyEvent.VK_W ) {
			upPressed=true;
		}
		
		if(code == KeyEvent.VK_LEFT ||code == KeyEvent.VK_A) {
			leftPressed=true;
		}
		
		if(code == KeyEvent.VK_DOWN ||code == KeyEvent.VK_S) {
			downPressed=true;
		}
		
		if(code == KeyEvent.VK_RIGHT ||code == KeyEvent.VK_D) {
			rightPressed=true;
		}
		
		if(code == KeyEvent.VK_Z ||code == KeyEvent.VK_P) {
			reversePressed=true;
		}
		
		if(code == KeyEvent.VK_ESCAPE) {
			if(pausePressed) {
				pausePressed= false;
				GamePanel.music.play(0,true);
				GamePanel.music.loop();			}
			else {
				pausePressed = true;
				GamePanel.music.stop();
			}
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
