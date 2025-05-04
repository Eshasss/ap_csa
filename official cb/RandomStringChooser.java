//** 2016 FRQ 1 */
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.math.*;

// Declare a public RandomStringChooser class

public class RandomStringChooser{

    /** Declare any fields (instance variables) **/

    private ArrayList<String> alist;


    /** Declare any constructors */
    public RandomStringChooser(ArrayList<String> list){
        alist = list;



    }

    /** Write the getNext method */

    public String getNext(){

        static double a =  Math.random();









    }

    /** This is a main method for testing the class */
    public static void main(String[] args)
    {
        System.out.println("It should print the words in the array in a random order and then NONE twice");
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++)
        {
           System.out.println(sChooser.getNext() + " ");
        }

     } // end of main

} // end of class
