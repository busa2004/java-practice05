package prob6;

public class Rectangle extends Shape implements Resizable {

		
	double width;
	double height;
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+height) * 2;
	}

	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}

}
