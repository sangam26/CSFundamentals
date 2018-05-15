
public class main {

	public static void main(String[] args) {
		//random unsorted array; 
		int[] array = {3,2,1,6,7,3,3,11,1}; 
		
		//creating sorting object
		Sorting sort = new Sorting(); 
		
		
		sort.insertionSort(array);
		
		for(int val : array){
			System.out.print(val+" ");
		}
	}

}
