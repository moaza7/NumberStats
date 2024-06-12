/** @author Moaz Aamir
 * @date 04/25/2024
 * Allow the user to input a number, then return some properties of that specific number including odd/even and whether or not it is a prime number
 */
package numberStats;

import java.util.Scanner;

public class NumberStats {
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

class MyNumber {
    private int val;
    
    public MyNumber (int val) {
    	this.val = val;
    }
    
    public int getVal() {
    	return val;
    }
    
    public boolean isOdd() {
    	return val % 2 != 0;
    }
    
    public boolean isEven() {
    	return val % 2 == 0;
    }
    
    // a method is created using syntax like this
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
