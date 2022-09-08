import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = in.nextInt();
		boolean even4 = year % 4 == 0 ;
		boolean neven100 = year % 100 != 0;
		boolean even400 = year % 400 == 0;
		boolean leapyear = even4 && neven100 || even400;
		System.out.println(year + " is a leap year: " + leapyear + ".");
	}

}
