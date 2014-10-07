package com.example.bits;

public class BitShiftOperators {

	public static void main(String args[]) {

		int x = 5;
		System.out.println("SIZE of integer : "+ Integer.SIZE);
		System.out.println("Value of x:" + x + ":Bits:"
				+ getBitRepresentation(x));
		/*
		 *Left Shift operators : no cyclic shift of bits
		 * actual shift = shift amount % integer size i.e no shift 
		 * 
		 * Left shift on negative numbers
		 * */
		
		x = x << Integer.SIZE;
		System.out.println("Value After left shift x:" + x + ":Bits:"
				+ getBitRepresentation(x));
		
		x = x >> 1;
		
		System.out.println("Value After Right shift x:" + x + ":Bits:"
				+ getBitRepresentation(x));

		
		x = x >>> 1;
		
		System.out.println("Value After Right unsigned shift x:" + x + ":Bits:"
				+ getBitRepresentation(x));

		
		int negX = -4;
		System.out.println("Value of negX:" + negX + ":Bits:"
				+ getBitRepresentation(negX));
		
		negX =  negX << Integer.SIZE-5;
		
		System.out.println("Value of after left shift negX:" + negX + ":Bits:"
			+ getBitRepresentation(negX) + ":mul:"+4*Math.pow(2, Integer.SIZE-5));
		
		
		negX = negX >> 1;
		
		System.out.println("Value of after right unsigned shift negX:" + negX + ":Bits:"
				+ getBitRepresentation(negX));
		
		negX = negX >>> 1;
		
		System.out.println("Value of after right shift negX:" + negX + ":Bits:"
				+ getBitRepresentation(negX));
		
		
		
		
		
		
	}

	private static String getBitRepresentation(int n) {
		int position = 1;
		StringBuilder bits = new StringBuilder();
		int numberOfbits = Integer.SIZE;
		for (int i = 0; i < numberOfbits; i++) {
			position = 1 << i;
			int res = (n & position);
			//System.out.println("print res" + res + ":pos" + position);
			if (res != 0) {
				bits.append("1");
			} else {
				bits.append("0");
			}

		}
		return bits.reverse().toString();
	}

	private static void printByteArray(byte[] b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);

		}
		System.out.println();
	}

}
