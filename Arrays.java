
import java.util.Scanner;

public class Arrays {


    public static void main(String args[]){
        // dynamic memory allocation []

        // int [] marks = new int[3]; // array initialisation syntax ;
        // or --> int marks[] = new int[3];

        // marks[0]=1;
        // marks[1]=2;
        // marks[2]=3;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // Static memory allocation {} --> here the size of the array is fixed from earlier.
        // int marks[] = {97,99,96}; //fixed size
        // for(int i=0;i<4;i++){
        //     System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt(); // array size input
        // int marks [] = new int[size];

        // // input
        // for(int i=0;i<size;i++){
        //     marks[i] = sc.nextInt();
        // }

        // //output
        // for(int i=0;i<size;i++){
        //     System.out.println(marks[i]);
        // }

// Take the input array from the user and search for a given no x. and print the index at which the no occurs.
        int size = sc.nextInt();
        int find[] = new int[size];
        for(int i =0;i<size;i++){
            find[i]=sc.nextInt();
        }

        int x = sc.nextInt();
        for(int i =0;i<find.length;i++){
            if(find[i]==x){
                System.out.println("the index of no. "+x+" is :"+i);
                return;
            }
        }
      System.out.println("no as such no. in an array !");
    }
   
}
