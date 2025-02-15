import java.util.Scanner; // Import Scanner for user input

public class evenodd {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

      
        System.out.print("Enter a number: "); // Prompt user to enter a number
        int number = scanner.nextInt();

 
        if (number % 2 == 0) {  // Check if the number is even or odd using modulus operator
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }


        scanner.close();  // Close the scanner
    }
}
