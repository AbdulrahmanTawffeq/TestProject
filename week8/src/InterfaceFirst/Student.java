package InterfaceFirst;

public class Student extends Person implements Notifiable {

	public Student(String name, String code) {
		super(name, code);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void _notify() {
		System.out.println("Send notification via phone");
		
	}

}
