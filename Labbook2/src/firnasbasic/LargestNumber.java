package firnasbasic;
import java.util.Scanner;
public class LargestNumber {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the values");
	int n1=reader.nextInt();
	int n2=reader.nextInt();
	int n3=reader.nextInt();
	if((n1>=n2)&&(n1>=n3))
	{
		System.out.println("First is highest value");
	}
	else if((n2>=n1)&&(n2>=n3))
	{
		System.out.println("Second is highest value");
	}
	else
	{
		System.out.println("Third is highest");
	}
}
}
