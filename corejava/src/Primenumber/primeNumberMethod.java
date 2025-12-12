package Primenumber;

public class primeNumberMethod {

	
		public boolean isprime(int num) {
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
		
		return count==2;
}
		public static void main(String[] args) {
			primeNumberMethod p=new primeNumberMethod();
			System.out.println((p.isprime(20))?"prime":"not prime number");
		}
	    

}
