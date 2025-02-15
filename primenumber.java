import java.util.Scanner; // Import Scanner class to take input

public class primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: "); // Get input from user
        int num = scanner.nextInt();
        scanner.close();

        boolean isPrime = true;

        
        if (num <= 1) {               // Check if the number is prime
            isPrime = false;      // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        
        if (isPrime) {   // Display the result
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
