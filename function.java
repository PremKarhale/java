import java.util.*;

public class function{
    // public static void printMyName(String name){
    //     System.out.println(name);    //first function
    //     return;
    // }

    // * sum
    // public static int sum(int a,int b){
    //     return a+b;
    // }

    // *Product
    public static int product(int a , int b ){
        int product = a*b;
        return product;
    }


    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(product(a,b));
    }
}