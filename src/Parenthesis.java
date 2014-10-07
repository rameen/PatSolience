public class Parenthesis {

	public static char LEFT_BRACE = '{';
	public static char RIGHT_BRACE = '}';

	public static void main(String args[]) {
		
		StringBuilder res = new StringBuilder();
		printAllCombination(res , 0, 0, 3);
	}

	public static void  printAllCombination(StringBuilder res, int lbc, int rbc,int n) {

			
		if ( lbc == n && rbc== n){
			System.out.println(res);
			return;
		}
		StringBuilder temp = new StringBuilder(res.toString());
		if(lbc<n) {
			StringBuilder temp2 = res.append(LEFT_BRACE);
			//System.out.println("<n"+res+"temp2"+temp2);
			
			printAllCombination(res, lbc+1, rbc, n);
		}
		
		if (rbc <= n && lbc <=n && lbc > rbc){
			//System.out.println("rbc:"+temp);
			temp.append(RIGHT_BRACE);
			//System.out.println("rbc:"+temp);
		
			printAllCombination(temp, lbc, rbc+1, n);
		}
	}
	
	
	public static void printAllCombos2(StringBuilder res,int lbc,int rbc,int n)
	{
		
		if (lbc == rbc){
			
			if ( lbc == n ){
				
				System.out.println(res);
				return;
				
			}else {
				res.append(LEFT_BRACE);
				lbc++;
				printAllCombos2(res, lbc, rbc, n);
			}
			
		}
		if (lbc < n)
		
		if ( lbc > rbc && rbc < n) {
			res.append(RIGHT_BRACE);
			rbc++;
			printAllCombos2(res, lbc, rbc, n);
		}
		
		
	}
}
