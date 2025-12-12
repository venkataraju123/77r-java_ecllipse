package easyprogram;

public class reversenumber {
	public void reverseNumber(int num) {
		int rev=0;
		
		
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
			
			
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
	new reversenumber().reverseNumber(568);

	}

}
