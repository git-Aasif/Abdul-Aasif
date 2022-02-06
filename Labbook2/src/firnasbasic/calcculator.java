package firnasbasic;

import java.util.Scanner;
public class calcculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter a number....");
	int num1=scan.nextInt();
	System.out.println("please enter another number");
	int num2=scan.nextInt();
	int sum=num1+num2;
	System.out.println("Addition of two number is...."+sum);
}
}
