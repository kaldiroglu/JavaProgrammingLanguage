package org.javaturk.jp.ch15;

class Window {
	boolean open;
	int width;

	 boolean isOpen() {
		return open;
	}

	 void setOpen(boolean open) {
		this.open = open;
	}

	 int getWidth() {
		return width;
	}

	 void setWidth(int width) {
		this.width = width;
	}

	 void open(){
		open = true;
	}
	
	 void close(){
		open = false;
	}
	
	public static void main(String[] args) {
		Window window = new Window();
		window.setOpen(true);
		System.out.println("Open? : " + window.isOpen());
		
		window.close();
		System.out.println("Open? : " + window.isOpen());
	}
}
