package Quiz1;

import java.util.Scanner;

public class Quiz_1 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the number of touchdowns for your player: ");
		double TD = input1.nextDouble();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the number of total yards for your player: ");
		double Yards = input2.nextDouble();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter the number of interceptions for your player: ");
		double INT = input3.nextDouble();
		
		Scanner input4 = new Scanner(System.in);
		System.out.println("Enter the number of completions for your player: ");
		double comp = input4.nextDouble();
		
		Scanner input5 = new Scanner(System.in);
		System.out.println("Enter the number of passes attempted for your player: ");
		double ATT = input5.nextDouble();
		
		double a  = ((comp/ATT) - 0.3) * 5;
		double b = ((Yards/ATT) - 3) * 0.25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - ((INT/ATT) * 25);
		
		double passer_rating = (((a + b + c + d)/6) * 100);
		
		System.out.println("The Passer Rating for your player is " + passer_rating);

	}

}
