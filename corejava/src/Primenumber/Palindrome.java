package Primenumber;
//If you reverse it and it stays the same, it is a palindrome.
public class Palindrome {
	
	    public static void main(String[] args) {
	        int num = 562;  
	        int temp = num;
	        int rev = 0;

	        while (temp > 0) {
	            int digit = temp % 10;
	            rev = rev * 10 + digit;
	            temp /= 10;
	        }

	        if (rev == num) {
	            System.out.println(num + " is a palindrome");
	        } else {
	            System.out.println(num + " is not a palindrome");
	        }
	    }
	}

	
	