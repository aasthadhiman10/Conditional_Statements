import java.util.*; // Import Scanner to read user input

public class If_Else_Statement {
    public static void main (String[]args) {
        
        //Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        // Logic: If age is 18 or older, the user is an adult
        if(age >= 18) {
            System.out.println("Adult");
            
            //Otherwise the user is not an adult
        } else {
                System.out.println("Not Adult");
            }
            
            //close the scanner to prevent memory loss
       sc.close();

    }
}
