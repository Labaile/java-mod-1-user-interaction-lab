
import java.util.Scanner;  //import the scanner class

public class Main {
 public static void main(String[] args) {
        // your code here
        Scanner reader = new Scanner(System.in); //Create a Scanner Object
        System.out.println("Please enter your age: ");
        int n = reader.nextInt(); //Read user input
        System.out.println("You are: " + n); //Output user input
        reader.close();
        
        if (n < 18 && n < 10 ){
            System.out.println("Congrats! You are under 10!");
        } else if (n < 18 ) {
            System.out.println("Congrats! You are under 18!");
        }
        else if (n >= 18){
            System.out.println("Congrats! You are over 18!");
        } else { 
            //reader.close();
            return; }

        
    }
} 
