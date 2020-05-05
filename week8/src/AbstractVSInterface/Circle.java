package AbstractVSInterface;

public class Circle extends Shape {

	private final double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public void hello() {
		System.out.println("Hello");
	}

	@Override
	protected double calArea() {
		// TODO Auto-generated method stub
		return Math.pow(radius, 2)*Math.PI;
	}

	
}
