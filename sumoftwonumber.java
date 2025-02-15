import java.util.Scanner; // Import Scanner class to take input

public class sumoftwonumber {  // Defining a public class 
    public static void main(String[] args) {        // Main method 
        
        Scanner scanner = new Scanner(System.in);  // Creating a Scanner object

        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();     //using double for allowing both whole number and decimal values

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

       
        double sum = num1 + num2; // Calculating the sum of the two numbers

       
        System.out.println("The sum is: " + sum);
       
    scanner.close();  // Closing the Scanner

    }
}
