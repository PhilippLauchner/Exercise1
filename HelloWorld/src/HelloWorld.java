import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	private static Scanner scanner;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

		System.out.println("Hello ASE2015 - how are you now? :)");
		System.out.println("Please enter your name: ");
		
		String userName = scanner.next();
		HelloUser hello = new HelloUser(userName);
		hello.greetUser();
	}
}
