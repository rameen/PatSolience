import java.util.HashMap;

public class MyStrings {

	/**
	 * 
	 * @param input
	 *            ABCDE - output= EDCBA ABCD E ABC ED last append AB EDC A EDCB
	 *            EDCBA
	 */
	public String reverse(String input, int start, int end) {
		if (start == end) {
			String input2 = input.substring(start);
			System.out.println("inu:" + input2);
			return input2;

		}

		String rv = reverse(input, start + 1, end);
		return rv + input.charAt(start);
	}

	public String removeCharsPresentInMaskString(String input, String maskString) {
		int mask_length = maskString.length();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>(
				mask_length);
		StringBuilder result = new StringBuilder("");

		for (int i = 0; i < mask_length; i++) {

			hashmap.put(maskString.charAt(i), 1);

		}

		int input_length = input.length();
		for (int i = 0; i < input_length; i++) {
			char currentChar = input.charAt(i);
			if (hashmap.get(currentChar) == null) {

				result.append(currentChar);
			}
		}
		return result.toString();

	}

	public char[] removeCharsPresentInMaskStringWithoutHasHMap(char[] input,
			char[] maskString) {

		char[][] arrayMap = new char[1][256];

		for (int i = 0; i < maskString.length; i++) {

			arrayMap[0][maskString[i]] = 1;
		}

		char[] variablelength = new char[input.length];
		int j = 0;
		for (int i = 0; i < variablelength.length; i++) {
			if ( arrayMap[0][input[i]] == 0 ) {
				
				variablelength[j] = input[i];
				j++;
				
			}
		}
		return variablelength;
	}
	
	
}
