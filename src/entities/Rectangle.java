package entities;

public class Rectangle {
	public double Width;
	public double Height;
	
	public double area() {
		return Width * Height;
	}
	
	public double perimeter() {
		return 2*(Width + Height);
	}
	public double diagonal() {
		return Math.sqrt((Math.pow(Width, 2))+(Math.pow(Height, 2)));
	}
	
	public String toString(){
		return "AREA = "
	+ String.format("%.2f",area())
	+ "\n"
	+ "PERIMETER = " 
	+ String.format("%.2f",perimeter())
	+ "\n"
	+ "DIAGONAL = " 
	+ String.format("%.2f",diagonal());
	
	}
}
