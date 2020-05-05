package linearSearch;

public class Contact implements Comparable{

	private String firstName;
	private String lastName;
	public Contact(String firstName, String lastName) {
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
		String first=((Contact)givenObject).getFirstName();
		String last=((Contact)givenObject).getLastName();
		
		this.firstName.compareTo(first);
		this.lastName.compareTo(last);
		
		return this.firstName.compareTo(first)+this.lastName.compareTo(last);
	}
}
