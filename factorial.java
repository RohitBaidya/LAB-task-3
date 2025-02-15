import java.util.Scanner; // Import Scanner class to take input

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number: ");  // Get input from user
        int num = scanner.nextInt();
        scanner.close();

        long factorial = 1; // Variable to store the factorial

       
        for (int i = 1; i <= num; i++) {   // Calculate factorial using loop
            factorial *= i;
        }

        // Display the result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
