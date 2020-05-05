package Polymorphism;

public class HolidayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Holiday holiday=new Nawroz();
		holiday.celebrate();
		((Nawroz)holiday).fireDisplay();
	}

}
