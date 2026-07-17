// Taking input for 2D Array !!
import java.util.*;
public class twoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int [][] numbers = new int[rows][col]; // initialising the 2D Array.

        // input 
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the numbers:");
                numbers[i][j]=sc.nextInt();
            }
        }
        // output 
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
