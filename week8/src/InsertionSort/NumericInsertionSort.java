package InsertionSort;

public class NumericInsertionSort {

	
	
	public static  void insertionSort(int[] list) {
		for(int i=1;i<list.length;i++) {
			int currentElement=list[i];
			int currentPosition=i;
			while(currentPosition>0 && currentElement<list[currentPosition-1]) {
				list[currentPosition]=list[currentPosition-1];
				currentPosition--;
			}
			list[currentPosition]=currentElement;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]numbers= {5,4,1,6,2,3};
		
		insertionSort(numbers);
		for(int var:numbers) {
			System.out.println(var);
		}
		
	}
	


}

