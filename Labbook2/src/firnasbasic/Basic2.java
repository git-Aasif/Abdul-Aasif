package firnasbasic;

import java.util.Scanner;

public class Basic2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first values");
	int num1=scan.nextInt();
	System.out.println("Enter the second values");
	int num2=scan.nextInt();
	int mul=num1*num2;
	System.out.println("The multiplication value is"+mul);
	
}
}
