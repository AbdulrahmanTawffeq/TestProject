package AbstractVSInterface;

public class Square extends Shape {

	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	protected double calArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
