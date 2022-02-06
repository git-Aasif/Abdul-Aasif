package firnasbasic;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		System.out.println("Enter the characters");
		Scanner reader=new Scanner(System.in);
		char ch=reader.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("This character is vowel");
		}
		else
		{
			System.out.println("This character is consonant");
		}
		}
	}


