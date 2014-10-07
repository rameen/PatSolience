import com.example.utils.Util;


public class Arrays {

	class ShiftAllZeroes{
		
		
		public int[] shiftAllZeroesRight(int arr[])
		{
			int len = arr.length;
			
			int zeroLocFromBegin = 0,nonZeroLocFromEnd=len-1;
			
			
			while (true){
				
				if (zeroLocFromBegin >= nonZeroLocFromEnd) break;
				if (arr[zeroLocFromBegin] == 0){
					if (arr[nonZeroLocFromEnd] !=0 ) {
						Util.swap(arr, zeroLocFromBegin, nonZeroLocFromEnd);
						zeroLocFromBegin++;
						nonZeroLocFromEnd--;
					}else {
						nonZeroLocFromEnd--;
					}
				}else {
					zeroLocFromBegin++;
				}
			}
			
			return arr;
			
		}
	}
	

	public static void main(String args[])
	{
		int arr[] = {1,0,2,0,3,0,0,4,5,6,7,0,0,0};
		
		Arrays arrays = new Arrays();
		
		ShiftAllZeroes shifter = arrays.new ShiftAllZeroes();
		Util.printArrayHorizontallySpaced(arr);
		Util.printArrayHorizontallySpaced(shifter.shiftAllZeroesRight(arr));
		
		int arr2[] = {0,0,0,0,0,0,0,0,0,1};
		Util.printArrayHorizontallySpaced(arr2);
		Util.printArrayHorizontallySpaced(shifter.shiftAllZeroesRight(arr2));
		
		
	}
	
	
}
