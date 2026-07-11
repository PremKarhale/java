
import java.util.*;

public class function {
    // public static void printMyName(String name){
    //     System.out.println(name);    //first function
    //     return;
    // }

    // * sum
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // *Product
    // public static int product(int a , int b ){
    //     int product = a*b;
    //     return product;
    // }
    // *Factorial
    public static void factorial(int a) {
        if (a < 0) {
            System.out.println("Enter the positive no .");
            return;
        } 
        else {

            long fact = 1;
            for (int i = a; i >= 1; i--) {
                fact = fact * i;
            }
            System.out.println("Factorail on the no. " + a + "is : " + fact);
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(product(a,b));
        char choice = 'T';
        while (choice == 'T' || choice == 't') {

            System.out.print("Enter the no who you want to find the factorial :");
            int a = sc.nextInt();
            factorial(a);
            System.out.print("Do you want to find other no factorial (T/F) :");
            choice = sc.next().charAt(0);
        }
        System.out.println("Program terminated sucessfully !!");

    }

}
