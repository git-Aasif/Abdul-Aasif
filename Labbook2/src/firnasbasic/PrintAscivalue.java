package firnasbasic;
import java.util.Scanner;
public class PrintAscivalue {
public static void main(String[] args) {
	System.out.println("Enter a character");
	Scanner reader=new Scanner(System.in);
	char ch=reader.next().charAt(0);
	int ascii=ch;
	System.out.println("The Ascii value is"+ch+" is:"+ascii);
	
}
}
