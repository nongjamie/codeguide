/**
 * Exercise1 for The Programming for interface Principle.
 * @author Sathira Kittisukmongkol.
 */
import java.util.Scanner;

public class Exercise1 {
	/* Create object of Scanner.*/
	static Scanner input = new Scanner(System.in);
	
	/* Run the program. */
	public static void main(String[]args){
		/* Create object of Doraemon class. */
		Doraemon doraemon = new Doraemon();
		/* Create object of Doraemon class. */
		Doraeme doraeme = new Doraeme();
		/* To control the while loop. */
		boolean control = true;
		
		// T0D0 Make the code be shorter by create interface.
		while(control) {
			System.out.print( "(1)Doraemon / (2)Doraeme / (3)quit : " );
			int choice = Integer.parseInt(input.nextLine());
			switch(choice) {
			case 1:
				System.out.println( doraemon.toString() );
				doraemon.canFly();
				doraemon.canSwim();
				doraemon.canRun();
				break;
			case 2:
				System.out.println( doraeme.toString() );
				doraeme.canFly();
				doraeme.canSwim();
				doraeme.canRun();
				break;
			case 3 :
				System.out.println( "Bye Bye" );
				control = false;
				break;
			default:
				System.out.println( "Invalid choice , please try again." );
				break;
			}
		}
		
	}
	
}

class Doraemon {
	/* Name of the object of Doraemon class. */
	private String name;
	/* Year of the object of Doraemon class. */
	private int year;
	
	/*
	 * This is the constructor.
	 */
	public Doraemon() {
		name = "Doraemon";
		year = 2017;
	}
	
	/**
	 * This is the constructor with the input year.
	 * @param year , set the year to the object.
	 */
	public Doraemon( int year ) {
		name = "Doraemon";
		this.year = year;
	}
	
	/* Print how object can fly. */
	public void canFly() {
		System.out.println( "I can fly with speed 100 m/s and height 100 m from the ground." );
	}
	
	/* Print how object can Run. */
	public void canRun() {
		System.out.println( "I can run with speed 100,00 m/s." );
	}
	
	/* Print how object can swim. */
	public void canSwim() {
		System.out.println( "I can swim with speed 50 m/s." );
	}
	
	/**
	 * The introduce detail of object.
	 * @return the introduce sentence.
	 */
	public String toString() {
		return "Hello I am "+name+" "+year+".Nice to meet you.";
	}
	
}

class Doraeme {
	/* Name of the object of Doraeme class. */
	private String name;
	/* Year of the object of Doraemon class. */
	private int year;
	
	/*
	 * This is the constructor.
	 */
	public Doraeme() {
		name = "Doraeme";
		year = 2017;
	}
	
	/**
	 * This is the constructor with the input year.
	 * @param year , set the year to the object.
	 */
	public Doraeme( int year ) {
		name = "Doraeme";
		this.year = year;
	}
	
	/* Print how object can fly. */
	public void canFly() {
		System.out.println( "I can fly with speed 100 m/s and height 100 m from the ground." );
	}
	
	/* Print how object can Run. */
	public void canRun() {
		System.out.println( "I can run with speed 100,00 m/s." );
	}
	
	/* Print how object can swim. */
	public void canSwim() {
		System.out.println( "I can swim with speed 50 m/s." );
	}
	
	/**
	 * The introduce detail of object.
	 * @return the introduce sentence.
	 */
	public String toString() {
		return "Hello I am "+name+" "+year+".Nice to meet you.";
	}
	
}
