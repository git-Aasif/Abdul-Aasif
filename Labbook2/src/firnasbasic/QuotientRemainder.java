package firnasbasic;

import java.util.Scanner;

public class QuotientRemainder {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the dividend values");
	int dividend=reader.nextInt();
	System.out.println("Enter the divisor values");
	int divisor=reader.nextInt();
	int Quotient=dividend/divisor;
	int Remainder=dividend%divisor;
	System.out.println("The quotient value is"+Quotient+"The Remainder value is"+Remainder);
}
}
