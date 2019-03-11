package hoang.dev;

public class Rectangle {
	int width ;
	int height ;
	
	void setwidth(int w) {
		width = w ;
	}
	
	int getwidth() {
		return width;
	}
	void setheight(int w) {
		height = w ;
	}
	
	int getheight() {
		return height;
	}
	
	int chuVi() {
		return ( width + height)*2;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	int dienTich() {
		return width * height;
	}
}
