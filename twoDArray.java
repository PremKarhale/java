// Taking input for 2D Array !!
import java.util.*;
public class twoDArray {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int [][] numbers = new int[rows][col]; // initialising the 2D Array.

        // // input 
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.println("Enter the numbers:");
        //         numbers[i][j]=sc.nextInt();
        //     }
        // }
        // // output 
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(numbers[i][j]+" ");
        //     }
        //     System.out.println();
        // }


// Take a matrix as input from the user. Search for a given number X and print the indices at which it occurs 
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){              // input
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){              // input
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter some number :");
        int X = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(numbers[i][j]==X){
                    System.out.println("Idex of the given number is : "+i+","+j);
                    return;
                }
            }
        }
         System.out.println("Given no is not present in the matrix !");



    }
}
