package SortObjectArray;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact[] friends = new Contact[8];
		friends[0] = new Contact("Omar", "H");
		friends[1] = new Contact("Salah", "G");
		friends[2] = new Contact("Kadir", "F");
		friends[3] = new Contact("Siraj", "E");
		friends[4] = new Contact("Ali", "D");
		friends[5] = new Contact("Sara", "C");
		friends[6] = new Contact("Kamal", "B");
		friends[7] = new Contact("Sameer", "A");

	sort(friends);
	
	Integer[]number= {9,8,7,6,5,4,3,2,1};
	sort(number);
	}
	
	
	
	private static void sort(Comparable []comparables) {
		int i,j;
		Comparable temp;
		
		for(i=0;i<comparables.length-1;i++) {
			for(j=i+1;j<comparables.length;j++) {
				if(comparables[j].compareTo(comparables[i])<0) {
					temp=comparables[j];
					comparables[j]=comparables[i];
					comparables[i]=temp;
				}
			}
		}
		for(Comparable var:comparables) {
			System.out.println(var);
		}
	}
}
