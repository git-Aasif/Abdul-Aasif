package firnasbasic;

import java.util.Scanner;
public class FindAreaofSquare {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	double side=scanner.nextDouble();
	double area=side*side;;
	System.out.println("Area of square is:"+area);
}
}
