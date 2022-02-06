package firnasbasic;
import java.util.Scanner;
public class OddorEven {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the values");
	int num=reader.nextInt();
	if(num%2==0)
	{
		System.out.println("The Number is Even");
	}
	else
	{
		System.out.println("The Number is Odd");
	}
	}
}

