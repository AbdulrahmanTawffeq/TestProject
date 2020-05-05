package linearSearch;



public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact [] people=new Contact[5];
		people[0]=new Contact("Ali","Muhammed");
		people[1]=new Contact("Oamr","Ali");
		people[2]=new Contact("Kareem","Khalid");
		people[3]=new Contact("Mustafa","Thamer");
		people[4]=new Contact("Salah","Saeed");
		
		
		Integer []numbers = {5,6,9,8,7,4};
		Integer one = new Integer(3);
		Search(numbers, one);
		Contact person = new Contact("Kareem","Khalid");
		Search(people, person);
	}
	
	public static void Search(Comparable[]comparables,Comparable target) {
		int index=0;
		boolean found=false;
		while(!found && index<comparables.length) {
			if(comparables[index].compareTo(target)==0) {
				found=true;
			}else {
				index++;
			}
		}
		if(found) {
			System.out.println(comparables[index]);
		}else {
			System.out.println("Not Founded");
		}
	}

}
