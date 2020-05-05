package SortObjectArraySimpleJustFirstName;

public class Contact implements Comparable{

	private String firstName;
	private String lastName;

	public Contact(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+firstName+" "+lastName;
	}

	@Override
	public int compareTo(Object object) {
		// TODO Auto-generated method stub
		//we should cast the object we have to Contact in order to get the firstName which is of type Contact
		String first=((Contact)object).getFirstName();
		return this.firstName.compareTo(first);
		//this compareTo here is related to String class which is also imlements the Comparable class
		//this method return int 0,-1, or 1
	}
	
	

}
