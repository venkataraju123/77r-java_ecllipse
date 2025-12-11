package neonNumber;

public class neonNumberinMethods {
	public boolean getneonNUmber(int num) {					
		 int square=num*num;
		 int temp=num;
		 int sum=0;
		 while (square!=0) {
			 int rem=square%10;
			 sum=sum+rem;
			 square/=10;
	}
return sum==temp;
	}
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			boolean  result =new neonNumberinMethods().getneonNUmber(i);
			if (result) {
				System.out.println(i);
				
			}
		}


	}

}
