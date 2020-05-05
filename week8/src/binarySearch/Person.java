package binarySearch;

public class Person implements Comparable {

	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName;
	}

	@Override
	public int compareTo(Object givenObject) {
		// TODO Auto-generated method stub
		String first=((Person)givenObject).getFirstName();

		return this.firstName.compareTo(first);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
