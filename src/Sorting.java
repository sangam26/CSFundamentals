
public class Sorting {
	//define all fundamental functions related to sorting inputs 
	public Sorting(){
		//constructor, nothing to initialize
	}
	
	public void insertionSort(int[] array){
		for(int i=0; i<array.length; i++){
			int previousIndex = i-1; 
			while (previousIndex >= 0 && array[previousIndex] > array[previousIndex+1]){
				int previousVal = array[previousIndex]; 
				array[previousIndex] = array[previousIndex+1]; 
				array[previousIndex+1] = previousVal; 
				previousIndex--; 
			}
		}
	}
	
}