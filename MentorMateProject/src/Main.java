import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of desired stars to print the pattern's boldness: ");

        
        Creator creator = new Creator();
        int n = scanner.nextInt();
        int rows = n + 1;
        if(n < 2 || n > 9999) {
        	System.out.println("You have inputed an incorect number!");
        }
        else {
        	creator.createDoubleM(n,rows);
        }
        
      
        
	}

}
