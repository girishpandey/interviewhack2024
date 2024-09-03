package com.gcp.dsalgo.leetcode;

public class Palindrome {
	public boolean isPalindrome(int x) {
        int rev = 0,rem = 0, num = x;
		while(num>0){
        	rem = num%10;
        	rev = (rev*10)+rem;
        	num = num/10;
        }
		return (x == rev);
    }
	
	public static void main(String [] args){
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome(-121));
	}
}
