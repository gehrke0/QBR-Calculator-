import java.util.Scanner;

public class QBRCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of touchdowns: ");
		Double TDs = input.nextDouble();
		
		System.out.println("Enter number of yards: ");
		Double Yards = input.nextDouble();
		
		System.out.println("Enter number of interceptions: ");
		Double INTs = input.nextDouble();
		
		System.out.println("Enter number of completions: ");
		Double COMPs = input.nextDouble();
		
		System.out.println("Enter number of Attempts: ");
		Double ATTs = input.nextDouble();
		
		Double a = (COMPs / ATTs - .3) * 5;
		Double b = (Yards / ATTs - 3) * .25;
		Double c = (TDs / ATTs) * 20;
		Double d = 2.375 - (INTs / ATTs * 25);
		
		Double QBR = ((a + b + c + d)/6) * 100;
		
		System.out.println(QBR);
	}

}
