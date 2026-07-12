// Home work questions

import java.util.*;

public class functions2 {
    // public static int average(int a, int b , int c){
    //     return ((a+b+c)/3);
    // }

//Write a function to print the sum of all odd numbers from 1 to n.
    public static void oddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum of odd no. is : " + sum);
    }
//Write a function which takes in 2 numbers and returns the greater of those two.

    public static int greater(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
//Write a function that takes in the radius as input and returns the circumference of a circle.

    public static double circumference(int r) {
        double cercum = (2 * Math.PI * r);
        return cercum;
    }
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

    public static void age(int a) {
        if (a > 18) {
            System.out.println("Go give a vote!!");
            return;
        }
        System.out.println("NO you are still a kid to vote !");
    }
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

    static int positive = 0;
    static int negative = 0;  // to access the main function variabls from the class directly we use static before it !!
    static int zeros = 0;

    public static void  count(int a) {
        if (a > 0) {
             positive++;
        } else if (a < 0) {
             negative++;
        } else {
             zeros++;
        }
    }

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    public static double power(int a , int n){
        double result = Math.pow(a, n);
        return result;

    }
/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that 
*/
    public static void fibonacci(int a){
        
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char choice = 'Y';
        // while (choice == 'Y' || choice == 'y') {
        //     System.out.print("Enter some number : ");
        //     int a = sc.nextInt();
        //     count(a);
        //     System.out.print("want to continue (Y/N): ");                // <--- COUNT FUNCTION EXECUTION
        //     choice = sc.next().charAt(0);
        // }
        // System.out.println("Positive Number :" + positive);
        // System.out.println("Negative Number :" + negative);
        // System.out.println("Zeros Number :" + zeros);

        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(a,n));
    }
}
