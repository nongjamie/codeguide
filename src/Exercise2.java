/**
 * Exercise1 for The Single-Responsibility Principle.
 * @author Sathira Kittisukmongkol.
 */
import java.util.Scanner;

public class Exercise2 {
	/* Create object of Scanner.*/
	static Scanner input = new Scanner(System.in);
	
	/* Run the program. */
	public static void main(String[]args){
		
		//T0D0 Make the code be shorter and easier to read.
		System.out.println( "We will calculate sin/cos/tan of your favourite number." );
		System.out.print( "Input your favourite number : " );
		double num_input = Double.parseDouble( input.nextLine() );
		System.out.println( "We will change your number to degrees unit." );
		double num_convert = (num_input*Math.PI)/180;
		System.out.println( "sin( "+num_input+" ) = "+Math.sin(num_convert) );
		System.out.println( "cos( "+num_input+" ) = "+Math.cos(num_convert) );
		System.out.println( "tan( "+num_input+" ) = "+Math.tan(num_convert) );
	}
	
}
