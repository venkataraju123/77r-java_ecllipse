package Primenumber;

public class primeNumber {
/*A prime number is a number that is divisible only by 1 and itself.

That means a prime number has exactly 2 factors:
✔️ 1
✔️ the number itself
*/
	public static void main(String[] args){
		int num=19;
		int count=0;
		for(int i=1;i<=num;i++) {
		if (num%i==0) {
		count ++;
		
		}	
	}
System.out.println((count==2)?"prime":"not primenumber");
	}
	}
