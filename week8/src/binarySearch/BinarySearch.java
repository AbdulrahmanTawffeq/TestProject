package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[]people=new Person[10];
		people[0]=new Person("C","F");
		people[1]=new Person("B","G");
		people[2]=new Person("F","S");
		people[3]=new Person("E","Y");
		people[4]=new Person("A","Z");
		people[5]=new Person("I","D");
		people[6]=new Person("G","I");
		people[7]=new Person("I","O");
		people[8]=new Person("M","P");
		people[9]=new Person("K","E");

		sort(people);
		for(Person var:people) {
			System.out.println(var);
		}
		
		Person toSearch=new Person("B","B");
		linearSearch(people, toSearch);
	}
	
	
	public static void sort(Comparable[]comparables) {
		int i,j;
		Comparable temp;
		
		for(i=0;i<comparables.length-1;i++) {
			for(j=i+1;j<comparables.length;j++) {
				if(comparables[j].compareTo(comparables[i])<0) {
					temp=comparables[i];
					comparables[i]=comparables[j];
					comparables[j]=temp;
				}
			}
			
		}
	}
	
	public static void linearSearch(Comparable[]comparables,Comparable target) {
		int index=0;
		boolean found=false;
		int Try=0;
		
		while(!found && index<comparables.length) {
			Try++;
			if(comparables[index].compareTo(target)==0) {
				found=true;
			}else {
				index++;
			}
		}
		System.out.println(Try);
		if(found) {
			System.out.println("Founded: "+comparables[index]);
		}else {
			System.out.println("Null");
		}
	}
	
	public static void binarySearch(Comparable[]comparables,Comparable target) {
		int low=0;
		int mid=0;
		int high=comparables.length-1;
		int Try=0;
		
		while(low<=high) {
			Try++;
			mid=low+high/2;
			if(comparables[mid].compareTo(target)==0) {
				System.out.println("Founded: "+comparables[mid]);
				break;
			}else if(comparables[mid].compareTo(target)<0){
				low=mid+1;
			}else if(comparables[mid].compareTo(target)>0){
				high=mid-1;
			}
		}
		System.out.println(Try);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
