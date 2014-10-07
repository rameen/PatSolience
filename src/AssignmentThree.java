public class AssignmentThree {

	public static void main(String argrs[]) {

		int input[] = { 3, 4, -5, 10, -11, 4 };

	}

	public static void maxSum(int[] input)
	{
		
		int maxSum = 0;
		int currentSum = 0;
		int posSum = 0;
		for ( int i = 0; i < input.length; i ++ ){
			
			
			currentSum += input[i];
			
			
			if ( input[i] <  0){
				
				//maxSum = maximum(maxSum + posSum,currentSum);
			    currentSum = input[i];
			    posSum = 0;
			}
			
		}
	}
	
	
	
	
	
}
