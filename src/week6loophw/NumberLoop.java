package week6loophw;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberLoop {

    //Finds sum of array list

    static ArrayList<Integer> numbers = new ArrayList<>();
    
    static Scanner in = new Scanner(System.in);
    static int total;



    public static void main(String args[]) {

    // Loop to enter 5 numbers from a user

    int i = 0;
    for (i = 0; i < 5; i ++ ) {


        System.out.println("Enter your number");
  
        @SuppressWarnings("resource")
        
        int number = new Scanner(System.in).nextInt();
        System.out.println();
        numbers.add(number);

        }

    // Loop to get all numbers in the list then add them then print them

    
    
    for (int a = 0; a < numbers.size(); a++) {
        total += numbers.get(a);
        }

        System.out.println("The sum of your numbers is " + total);
        System.out.println();
        
        
        int highestNum = Collections.max(numbers);
		System.out.println("The highest number is : " + highestNum);
		
		int lowestNum = Collections.min(numbers);
		System.out.println("The lowest number is : " + lowestNum);
        
     

    }
    
    
       
}


