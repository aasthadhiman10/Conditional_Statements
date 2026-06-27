import java.util.*; // Import Scanner to read user input

public class If_Else_Statement_2 {
    public static void main (String[]args) {
        
        //create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number:");
        int x = sc.nextInt();

        //If the remainder is 0 when x is divided by 2, then the number is an even number
        if(x % 2 == 0){
            System.out.println("Even Number");
        } else {

            //Otherwise the number is an odd number
            System.out.println("Odd Number");
        }

        //close the scanner to prevent memory loss
        sc.close();

        }

    }
    
