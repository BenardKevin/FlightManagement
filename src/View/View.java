package View;

public class View implements Runnable {
	
	private Frame frame;
	
	public View(){
		this.setFrame(new Frame());
		
	}

	public void run() {
		this.show();
	}

	private void show() {
		this.frame.setVisible(true);
		
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	
	

}
