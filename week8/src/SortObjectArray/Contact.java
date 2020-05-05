package SortObjectArray;

import java.util.Objects;

public class Contact implements Comparable {

	private String firstName;
	private String lastName;

	public Contact(String firstName, String lastName) {
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
		return firstName + " " + lastName;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) {
			return true;
		} else if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Contact contact = (Contact) o;
		return firstName.equals(contact.firstName) && lastName.equals(contact.lastName);

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(firstName, lastName);
	}

	@Override
	public int compareTo(Object given) {
		// TODO Auto-generated method stub
		int result;
		String firstGiven=((Contact)given).getFirstName();
		String lastGiven=((Contact)given).getLastName();
		
		if(lastName.equals(firstGiven)) {
			result=firstName.compareTo(firstGiven);
		}else {
			result=lastName.compareTo(lastGiven);
		}
		return result;
	}

}
