
public class AssignmentTwo {

	public static void main(String[] args)
	{
		
		char[] input= {'i',' ','a','m',' ','b','i','r','d'};
		input = reverseSentence(input);
		
		for ( int  i = 0 ; i < input.length; i++){
			
			System.out.println(input[i]);
		}
		//System.out.println(factorial(1));
		//i am  bird
		//bird am i
		
	}
	
	public static char[] reverseSentence(char[] sentence)
	{
		
		int len = sentence.length;
		int lastIndex = len -1;
		char[] reversedSentence =  new char[len];
		int reverseSentenceIndex = 0;
		for (int  j = len-1; j>=0; j--){
			if (sentence[j] == ' ' ){
				System.out.println("jj"+j +"star index"+(j+1)+"end index " + lastIndex);
				char[] tempArray = mySubString(sentence,j ,lastIndex );
				int tempLen = lastIndex-(j)+1;
				System.out.println("temp len"+tempLen);
				for ( int l = 0;l< tempLen ; l++){
					
					reversedSentence[reverseSentenceIndex++] = tempArray[l];
					
				}
				
				
				lastIndex = len-j-1-1;
			}
		}
		
		return reversedSentence;
		
	}
	
	public static char[] mySubString(char[] sent,int startIndex,int endIndex)
	{
		
		int len = endIndex-startIndex+1;
		System.out.println("temp len2"+len);
		char[] tempArray = new char[len];
		for (int i = 0; i <len;i++ ){
			tempArray[i] = sent[startIndex+i];
		}
		
		for (int i = 0; i < len; i++){
			System.out.println(tempArray[i]);
		}
		return tempArray;
	}
	

	
}
