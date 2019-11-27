package practice1;

import java.util.Scanner;

public class FirstScanner {
	public static void main(String[] args) {
		Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("input your name");
		String name=scanner.nextLine();
		System.out.println("input your age");
		int age=scanner.nextInt();
		System.out.printf("Hi,%s you are %d\n",name,age);
	}
}
