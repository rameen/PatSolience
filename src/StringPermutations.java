public class StringPermutations {

	static int cnt = 0;

	public static void main(String args[]) {
		
		char input[] = { 'A', 'B', 'C', 'D', 'S' };

		// printAllPermutations(input, 0, input.length - 1);
		// System.out.println("length " + input.length+"cnt:"+cnt +
		// ":Factorial::"+ factorial(input.length));

		/*
		 * MyStrings myString = new MyStrings(); String input2 = "abcde";
		 * System.out.println(myString.reverse(input2, 0,input2.length()-1));
		 */
		
		MyStrings myString = new MyStrings();
		System.out.println(myString.removeCharsPresentInMaskString("testString", "mask"));
		char[] maskString = {'A','D'};
		char[] result = myString.removeCharsPresentInMaskStringWithoutHasHMap(input, maskString);
		//Need variable length char array
		for ( int i = 0 ; i < result.length; i++)
		{
			System.out.print(result[i]);
		}
		System.out.println("input lenght:"+ result.length);

	}

	private static int factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static void printAllPermutations(char input[], int start, int end) {

		if (start == end) {
			print(input);
			cnt++;
			return;
		}
		for (int i = start; i <= end; i++) {
			swap(input, start, i);
			printAllPermutations(input, start + 1, end);
			swap(input, i, start);
		}

	}

	private static void print(char[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
		}
		System.out.println("---");
	}

	private static void swap(char[] input, int start, int i) {

		char temp = input[start];
		input[start] = input[i];
		input[i] = temp;
	}

}
