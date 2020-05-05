
public class Person implements Comparable {

	private String firstName;
	private String lastName;
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirst() {
		return firstName;
	}
	public String getLast() {
		return lastName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName;
	}
	@Override
	public int compareTo(Object given) {
		// TODO Auto-generated method stub
		String first=((Person)given).getFirst();
		String last=((Person)given).getLast();
		return this.firstName.compareTo(first)+this.lastName.compareTo(last);
	}
	
	
}
