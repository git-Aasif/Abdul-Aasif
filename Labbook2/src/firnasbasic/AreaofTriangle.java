package firnasbasic;

import java.util.Scanner;
public class AreaofTriangle {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the base value:");
	double base=scanner.nextDouble();
	System.out.println("Enter the height value");
	double height=scanner.nextDouble();
	double Area=0.5*base*height;
	System.out.println("The Area of triangle is:"+Area);
}
}
