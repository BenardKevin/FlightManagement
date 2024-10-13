package View;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import Contract.IController;

public class Frame extends JFrame implements KeyListener{
	
	private IController controller;
	
	private static final long serialVersionUID = 1L;

	public Frame() {
		this.build();
	}
	
	private void build() {
		
	}

	public void keyPressed(KeyEvent KeyCode) {

	}

	public void keyReleased(KeyEvent KeyCode) {
		this.controller.handleKeyEvent(KeyCode);
	}

	public void keyTyped(KeyEvent KeyCode) {
		this.controller.handleKeyEvent(KeyCode);

	}

}
