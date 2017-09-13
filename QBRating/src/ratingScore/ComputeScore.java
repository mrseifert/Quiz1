
package ratingScore;

import java.util.Scanner;


public class ComputeScore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for number of passing attempts:");
		double passingAttempts = input.nextDouble();
		
		System.out.print("Enter a number for number of completions:");
		double completions = input.nextDouble();
		
		System.out.print("Enter a number for number of passing yards:");
		double passingYards = input.nextDouble();
		
		System.out.print("Enter a number for number of touchdown passes:");
		double touchdownPasses = input.nextDouble();
		
		System.out.print("Enter a number for number of interceptions:");
		double interceptions = input.nextDouble();
		
		
		double a = ((completions/passingAttempts)-.3)*5;
		double b = ((passingYards/passingAttempts)-3)*.25;
		double c = (touchdownPasses/passingAttempts)*20;
		double d = 2.375 - ((interceptions/passingAttempts)*25);
		
		double finalScore = ((a + b + c + d)/6) *100;
		
		System.out.println("The QB rating is " + finalScore);
	}

}
