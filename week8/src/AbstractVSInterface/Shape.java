package AbstractVSInterface;

public abstract class Shape {

	protected abstract double calArea();

	public double getArea() {
		return calArea();
	}
}
