import java.util.*; //create scanner to read user input

 public class Switch_Break_Statement {

    public static void main(String[]args) {

        //create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Read the button number entered by the user
            int button = sc.nextInt();

            // Check the value of 'button' and execute the matching case
            switch(button) {

                // If button is 1, print "C" and exit the switch block
                case 1 : System.out.println("C");
                break;

                // If button is 2, print "C++" and exit the switch block
                case 2 : System.out.println("C++");
                break;

                // If button is 3, print "Python" and exit the switch block
                case 3 : System.out.println("Python");
                break;

                // If button is 4, print "Java" and exit the switch block
                case 4 : System.out.println("Java");
                break;

                // If button is 5, print "Invalid Button"
                default : System.out.println("Invalid Button");
            }

            //close scanner to prevent memory loss
            sc.close();
        }
    }


    
    


