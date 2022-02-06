package firnasbasic;
import java.util.Scanner;
public class FindAreaofCircle {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a radius value");
	double radius=scanner.nextDouble();
	double area=Math.PI*(radius*radius);
	System.out.println("The area of circlr is:"+area);
	double circumference=Math.PI*2*radius;
	System.out.println("The circumference of the circle is:"+circumference);
}
}
