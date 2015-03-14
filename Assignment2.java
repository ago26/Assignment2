
import java.util.Scanner;


public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1/2 + " int");
		System.out.println(1%2 + " int");
		System.out.println(1.0/2 + " DOUBLE");
		System.out.println(5 + 7 / 2 + " int");
		System.out.println("Beat" + ' ' + "Army" + " char");
		System.out.println(6 + 13 / 5 - 35 % 3 + " int");
		System.out.println(3.5 * (5/4) + " DOUBLE");
		System.out.println((3.5 * 5)/4 + " DOUBLE");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your 5 numbers ");
		//prompt the user to enter 5 numbers of your choosing
		double num1 = keyboard.nextDouble();
		double num2 = keyboard.nextDouble();
		double num3 = keyboard.nextDouble();
		double num4 = keyboard.nextDouble();
		double num5 = keyboard.nextDouble();
		
		//The 5 numbers of your choosing added together / by 5 = average
		double average = num1 + num2 + num3 + num4 + num5 / 5;
		//the 5 numbers of your choosing added together = sum
		double sum = num1 + num2 + num3 + num4 + num5;
		
		//The 5 selected numbers and the highest number you chose
		double max1 = Math.max(num1, num2);
		double max2 = Math.max(max1, num3);
		double max3 = Math.max(max2, num4);
		double max4 = Math.max(max3, num5);

		//The 5 selected numbers and the lowest number you chose
		double min1 = Math.min(num1, num2);
		double min2 = Math.min(min1, num3);
		double min3 = Math.min(min2, num4);
		double min4 = Math.min(min3, num5);
		
	
		
		
		//The objective answers
		System.out.println("Average amount is " + average);
		System.out.println("Sum of numbers is " + sum);
		System.out.println("Max of numbers is " + max4);
		System.out.println("Min of numbers is " + min4);


	}

}


