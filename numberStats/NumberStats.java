/** @author Moaz Aamir
 * @date 04/25/2024
 * Allow the user to input a number, then return some properties of that specific number including odd/even and whether or not it is a prime number
 */
package numberStats;

import java.util.Scanner;

/**
 * This class represents a program to perform various operations on a number.
 */
public class NumberStats {

    /**
     * The main method of the program.
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // To ask the user for a number, use `input.nextInt()`
        int num = input.nextInt();
        MyNumber myNumber = new MyNumber(num);
        
        System.out.println(myNumber.getVal());
        System.out.println(myNumber.isEven());
        System.out.println(myNumber.isOdd());
        System.out.println(myNumber.isPrime());
    }
}

/**
 * This class represents a number with various operations.
 */
class MyNumber {
    private int val;
    
    /**
     * Constructor to initialize the number.
     * @param val The value of the number.
     */
    public MyNumber (int val) {
    	this.val = val;
    }
    
    /**
     * Gets the value of the number.
     * @return The value of the number.
     */
    public int getVal() {
    	return val;
    }
    
    /**
     * Checks if the number is odd.
     * @return True if the number is odd, false otherwise.
     */
    public boolean isOdd() {
    	return val % 2 != 0;
    }
    
    /**
     * Checks if the number is even.
     * @return True if the number is even, false otherwise.
     */
    public boolean isEven() {
    	return val % 2 == 0;
    }
    
    /**
     * Checks if the number is prime.
     * @return True if the number is prime, false otherwise.
     */
    public boolean isPrime() {
    	if (val <= 1) {
    		return false;
    	}
    	for (int i = 2; i < val; i++) {
    		if (val % i == 0) {
    			return false;
    		}
    	} return true;
    }
}
