 import java.util.*; //create scanner to read user input

 public class Else_If_Statement_2 {

    public static void main(String[]args) {

        //create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);
            int button = sc.nextInt();

            //If we press button = 1 ,then it prints 'C'
            if(button == 1) {
                System.out.println("C");

               //If we press button = 2 ,then it prints 'C++'
            } else if(button == 2) {
                System.out.println("C++");

                 //If we press button = 4 ,then it prints 'Python'
            } else if(button == 3) {
                System.out.println("Python");

                //Otherwise, it prints 'Java'
             } else {
                    System.out.println("Java");
                }

             //close the scanner to prevent memory loss
            sc.close();

            }

        }

    
    


