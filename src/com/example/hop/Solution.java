package com.example.hop;

public class Solution {

	public static void main(String args[]) {
			double d = 10.0/-0;
			if (d == Double.POSITIVE_INFINITY){
				System.out.println("posi");
			}else {
				System.out.println("neg");
			}
			
			System.out.println("Integer Range :" + Integer.MIN_VALUE +"---"+Integer.MAX_VALUE);
			byte b1 =  (byte) (127 + 1); 
			System.out.println("Byte Value:" + Byte.MIN_VALUE+"---"+Byte.MAX_VALUE + "b1 value"+ b1);
			
			System.out.println("test string concatenation " + (2 - 3));
	}

	
	
}
