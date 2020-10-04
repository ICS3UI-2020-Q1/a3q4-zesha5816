import java.util.Scanner;
/**
 * that will ask the user for a positive integer. If that number is between 1 and 10 inclusively, have the program print out the “written form” of the number. If it is not within that range, have the computer print out “not in the range”
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for the user 
		Scanner input = new Scanner(System.in);
		//prompt user for a integer 
		System.out.println("Please enter a positive integer:");
		//get the input from user
		int number = input.nextInt();
		//a if staement which outputs the number according to the input
		switch (number) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			case 10:
				System.out.println("Ten");
				break;
			default:
			//not in specified range will output not in range
				System.out.println("not in range");
				break;

		}

    
  }
}
