import java.util.Scanner;             //A Java statement that allows you to use the Scanner class
public class studentid {             // Defining a public class

    public static void main(String[] args) {   // Main method
              
        Scanner user = new Scanner(System.in);
        String Studentname;             // Declaring variables
        Long ID ;
        int Age ;
        float Fees;
        char Grade;
         
        System.out.println("enter name");
        Studentname =  user.nextLine();         //reading data

        System.out.println("ID");
        ID =  user.nextLong();

        System.out.println("Age");
        Age =  user.nextInt();

        System.out.println("Fees");
        Fees =  user.nextFloat();

        System.out.println("Grade");
        Grade =  user.next().charAt(0);

        System.out.println("Student name is:" + Studentname); // Displaying the collected data
        System.out.println("ID is:" + ID); 
        System.out.println("Age is:" + Age); 
        System.out.println("Fees is:" + Fees); 
        System.out.println("Grade is:" + Grade); 
        
         user.close();  // Closing the Scanner object



    }
    
}
