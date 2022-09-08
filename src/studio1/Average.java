package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer for n1: ");
		int n1 = in.nextInt();
		System.out.print("Enter an integer for n2: ");
		int n2 = in.nextInt();
		double sum = n1 + n2 ;
		double avg = sum / 2.0 ;
		System.out.println("Your average is " + avg);
		}

}
