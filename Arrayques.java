
import java.util.Scanner;

public class Arrayques {
    public static void main(String[] args) {
//Take an array of names as input from the user and print them on the screen.

        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // sc.nextLine();
        // String names[] = new String[size];
        // for(int i=0;i<names.length;i++){
        //     names[i] = sc.nextLine();
        // }
        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);   
        // }
        // System.out.println("completed !!");
        // System.out.println(names.length);

/*Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.*/
       System.out.print("Enter the size of array :");
       int size = sc.nextInt();
       int Ordering[]=new int[size];
       // input
       for(int i=0;i<Ordering.length;i++){
        System.out.print("Enter number :");
        Ordering[i] = sc.nextInt();
       }
       // output print 
       for(int i = 0;i<Ordering.length;i++){
        System.out.print(Ordering[i]);
       }

       boolean isAssending = true;
       for(int i =0;i<Ordering.length-1;i++){
        if(Ordering[i] > Ordering[i+1]){
            isAssending = false;
            System.out.println(" This is not a sorted asscending array ");
            return;
        }
       }
        System.out.println(" Yes this is an ascending sorted array ");


    }
}
