package InterfaceFirst;

public class Person {
	protected String name;
	protected String code;

	
	protected Person(String name, String code) {
		this.name = name;
		this.code = code;
	}

	protected String getName() {
		return name;
	}

	protected String getCode() {
		return code;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+code;
	}

}
