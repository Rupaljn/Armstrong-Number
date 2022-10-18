package com.rakuten.number;

public class CheckArmstrongNumber {
public static void main(String[] args) {
	int num = 125;
	int squ = 1*1*1+5*5*5+3*3*3; 
	if(num==squ){
		System.out.println("Number is armstrong");
	}
	else{
		System.out.println("Number is not armstrong");
	}
}
}
