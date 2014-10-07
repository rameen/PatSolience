public class Assignment {

	public static void main(String args[]) {

		// System.out.println(reverseStringUsingLoop("arun"));
		char[] originalArray = { 'a', 'r', 'u', 'n' };

		//char[] expectedResult = { 'n', 'u', 'r', 'a' };
		
		char[] reversedOutput = reverseStringInPlace(originalArray);
		
		boolean isTestCasePassed = testreverseStringInPlace(originalArray, reversedOutput);
		if (isTestCasePassed){
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
	}

	
	public static String reverseString(String input) {
		StringBuilder ret = new StringBuilder(input);
		return ret.reverse().toString();

	}

	public static String reverseStringUsingLoop(String input) {

		String ret = "";
		int len = input.length();
		for (int i = len - 1; i >= 0; i--) {
			ret = ret + input.charAt(i);
		}
		return ret.toString();
	}

	public static char[] reverseStringInPlace(char[] input) {

		int len = input.length;

		for (int i = 0, j = len - 1; i < j; i++, j--) {
			char temp = input[i];
			input[i] = input[j];
			input[j] = temp;
		}

		for (int i = 0; i < len; i++) {
			System.out.println(input[i]);
		}

		return input;

	}

	public static boolean testreverseStringInPlace(char[] input,
			char[] reversed) {

		char[] output = reverseStringInPlace(reversed);

		if (output.length == reversed.length) {
			boolean failed = false;
			for (int i = 0; i < output.length; i++) {
				
				
				if (reversed[i] != output[i]) {
					//System.out.println("Test Case Failedddd");
					failed = true;
					return false;
				}
			}
			
			return true;
/*
			if (!failed)
				System.out.println("TestCase passed");
			else {
				System.out.println("TestCase Failed");
			}
*/
		} else {
			return false;
		}

	}

}
