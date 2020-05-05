package SortObjectArraySimpleJustFirstName;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact[] collection = new Contact[4];
		collection[0] = new Contact("Zuhair", "Ali");
		collection[1] = new Contact("Lazi", "Kamel");
		collection[2] = new Contact("Nawwar", "Ahmed");
		collection[3] = new Contact("Baraa", "Oamr");

		System.out.println("Not Soted");
		for (Contact var : collection) {
			System.out.println(var);
		}
		
		sortArrayOfObjects(collection);
		System.out.println("Soted");
		for (Contact var : collection) {
			System.out.println(var);
		}
	}

	public static void sortArrayOfObjects(Comparable[] comparables) { // this is the polymorphism because Conatct
																		// implements Comparables then it is a
																		// Comparable in a way
		int i, j;
		Comparable temp;

		for (i = 0; i < comparables.length - 1; i++) {
			for (j = i + 1; j < comparables.length; j++) {
				if (comparables[i].compareTo(comparables[j]) > 0) {
					temp=comparables[i];
					comparables[i]=comparables[j];
					comparables[j]=temp;
				}

			}
		}
	}

}
