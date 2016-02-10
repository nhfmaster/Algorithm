package Sort;
/** 
* @author  Snake
* @date 2016年2月10日 下午5:02:39 
* @version 1.0 
* @features  
*/

public class BubbleSort {
	public static void main(String args[]){
		int a[] = {33,27,2,73,14,25,16};
		int b[] = BubbleSort(a);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	public static int[] BubbleSort(int []array){
		int temp = 0;
		
		for (int i = 0; i < array.length-1; i++) {
			
			for (int j = 0; j < array.length-i-1; j++) {
				if(array[j] > array[j+1]){
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}
}

