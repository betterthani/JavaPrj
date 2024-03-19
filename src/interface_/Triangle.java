package interface_;

public class Triangle implements Shape{
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height / 2.0;
	}
}
