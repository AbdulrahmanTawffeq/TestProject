package InterfaceFirst;

public class TesterKust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Notifiable first = new Employee("Ali","F15");
		first._notify();
		((Employee)first).hello();
	}

}
