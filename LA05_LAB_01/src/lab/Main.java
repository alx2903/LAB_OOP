package lab;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
		
	public Main() {
		// TODO Auto-generated constructor stub
		
//		input and output & data type
		
//		System.out.println(43);
		
		String name = "Alex";
		int age = 19;
		float pi = 3.14f;
//		System.out.println("Hello my name is " + name + " hi");
//		System.out.printf("Hello my name is %s hi\n", name);
//		System.out.println("The value of age is " + age);
//		System.out.println("The value of pi is " + pi);
//		System.out.println("Input your name: ");
//		name = scan.nextLine();
//		System.out.println("Your name is: " + name);
//		System.out.println("Input your age: ");
//		age = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Your age is: " + age);
		
//		arithmatic operator = + - * / %
		
//		int numA = 8;
//		int numB = 18;
//		
//		int result = numA * numB;
//		System.out.println("Value: " + result);
		
//		logical operator && || !
		
//		if(1==2) {
//			System.out.println("1 = 1");
//		}else if(1 == 2 && 5 == 5){
//			System.out.println("1 != 2 && 5 = 5");
//		}else if((true && true) || false) {
//			System.out.println("True");
//		}else {
//			System.out.println("wrong statement");
//		}
		
		int opt = 1;
		
//		switch (opt) {
//			case 1:{
//				System.out.println("Case 1");
//				break;
//			}
//			case 2:{
//				System.out.println("Case 2");
//				break;
//			}
//			default:{
//				System.out.println("Case ?");
//				break;
//			}
//		}
		
//		repetition for, while, do while
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Value of i: " + i);
//		}
		
		int i = 6;
		int j = 6;
		
		while (i < 5) {
			System.out.println("Value of i: "+ i);
			i++;
		}
		
		System.out.println("\n");
		
		do {
			System.out.println("Value of j: " + j);
			j++;
		} while (j < 5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
