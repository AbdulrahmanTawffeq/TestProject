package InterfaceFirst;

public class Employee extends Person implements Notifiable {

	public Employee(String name, String code) {
		super(name, code);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void _notify() {
		System.out.println("Send notification via E-mail");
		
	}
	
	public void hello() {
		System.out.println("Hello");
	}

}
