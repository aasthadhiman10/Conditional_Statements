import java.util.*; // Import Scanner to read user input

public class Else_If_Statement {
    public static void main(String[]args) {

        //create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            //If both 'a' and 'b' are equal, then print 'Equal'
            if(a == b) {
                System.out.println("Equal");

                //If 'a' is greater than 'b',then print a is greater than b
            } else if(a > b) {
                System.out.println("a is greater than b");

                 //If 'b' is greater than 'a',then print b is greater than a
            } else {
                System.out.println("b is greater than a");
            }


            //close the scanner to prevent memory loss
            sc.close();



        }

    }
    

