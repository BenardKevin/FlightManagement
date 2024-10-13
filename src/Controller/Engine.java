package Controller;

import java.awt.event.KeyEvent;
import java.util.Observable;

import Contract.IController;

public class Engine extends Observable implements IController  {

	private IController controller;
	private int keyPressed;
	
	public void handleKeyEvent(KeyEvent KeyCode) {
		switch (KeyCode.getID()) {
		case KeyEvent.KEY_PRESSED:
			keyPressed = KeyCode.getKeyCode();
		
			
		
		
		}
		
	}

	public IController getController() {
		return controller;
	}

	public void setController(IController controller) {
		this.controller = controller;
	}
	
	

}
