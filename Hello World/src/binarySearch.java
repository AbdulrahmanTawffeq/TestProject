
public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[]people =new Person[5];
		people[0]=new Person("A","Muhammed");
		people[1]=new Person("B","Jamal");
		people[2]=new Person("C","Zuhair");
		people[3]=new Person("D","Mustafa");
		people[4]=new Person("E","Ali");
		
		Person person =new Person("E","Ali");
		binarySearch(people,person);
	}
	
	
	
	
	
	public static void binarySearch(Comparable[]comparables,Comparable target) {
		int low=0;
		int mid=0;
		int high=comparables.length-1;
		int Try=0;
		
		while(low<=high) {
			Try++;
			mid=low+high/2;
			if(target.compareTo(comparables[mid])==0) {
				System.out.println("Founded: "+target);
				System.out.println(Try);
				break;
			}else if(target.compareTo(comparables[mid])<0){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
