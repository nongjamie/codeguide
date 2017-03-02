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
		/* Control the while loop. */
		boolean control = true;
		
		// T0D0 Make code easier to read and shorter.
		while( control ) {
			System.out.println( "This program is for find the Dot Product and the Cross Product." );
			System.out.print( "What do you want to find? (1)Dot Product (2)Cross Product (3)Quit : " );
			int choice = Integer.parseInt( input.nextLine() );
			switch(choice) {
			case 1:
				System.out.print( "Input coefficient of i of 1st vector : " );
				double Ux = Double.parseDouble( input.nextLine() );
				System.out.print( "Input coefficient of j of 1st vector : " );
				double Uy = Double.parseDouble( input.nextLine() );
				System.out.print( "Input coefficient of k of 1st vector : " );
				double Uz = Double.parseDouble( input.nextLine() );
				System.out.print( "Input coefficient of i of 2nd vector : " );
				double Vx = Double.parseDouble( input.nextLine() );
				System.out.print( "Input coefficient of j of 2nd vector : " );
				double Vy = Double.parseDouble( input.nextLine() );
				System.out.print( "Input coefficient of k of 2nd vector : " );
				double Vz = Double.parseDouble( input.nextLine() );
				double result_i = Ux*Vx;
				double result_j = Uy*Vy;
				double result_k = Uz*Vz;
				System.out.println( "The result of dot product is : "+(result_i+result_j+result_k) );
				break;
			case 2:
				System.out.print( "Input coefficient of i of 1st vector : " );
				double Ux2 = Double.parseDouble( input.nextLine() );
				System.out.print( "Input coefficient of j of 1st vector : " );
				double Uy2 = Double.parseDouble( input.nextLine() );
				System.out.print( "Input coefficient of k of 1st vector : " );
				double Uz2 = Double.parseDouble( input.nextLine() );
				System.out.print( "Input coefficient of i of 2nd vector : " );
				double Vx2 = Double.parseDouble( input.nextLine() );
				System.out.print( "Input coefficient of j of 2nd vector : " );
				double Vy2 = Double.parseDouble( input.nextLine() );
				System.out.print( "Input coefficient of k of 2nd vector : " );
				double Vz2 = Double.parseDouble( input.nextLine() );
				double result_i2 = (Uy2*Vz2)-(Uz2*Vy2);
				double result_j2 = (Uz2*Vx2)-(Ux2*Vz2);
				double result_k2 = (Ux2*Vy2)-(Uy2*Vx2);
				System.out.println( "The result of cross product is :" );
				System.out.println( "("+result_i2+")i + ("+result_j2+")j + ("+result_k2+")k." );
				double result_size = Math.sqrt( (result_i2*result_i2)+(result_j2*result_j2)+(result_k2*result_k2) );
				System.out.println( "The size of result vector is : "+result_size );
				break;
			case 3:
				System.out.println( "Bye Bye" );
				control = false;
				break;
			default:
				System.out.println( "Invalid choice , Please try again." );
				break;
			}
		}
	}

}
