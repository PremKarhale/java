// Taking input for 2D Array !!

public class twoDArray {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the rows and columns");
        // int rows = sc.nextInt();
        // int col = sc.nextInt();

        // int [][] nums = new int[rows][col]; // initialising the 2D Array.
        int[][] nums = {{1, 2,}, {3, 4,}}; // 2 X 2

        // // input 
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[0].length;j++){
        //         System.out.println("Enter the numbers:");
        //         nums[i][j]=sc.nextInt();
        //     }
        // }
        // output 
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

// Take a matrix as input from the user. Search for a given number X and print the indices at which it occurs 
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){              // input
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){              // input
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.print("Enter some number :");
        // int X = sc.nextInt();
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){
        //         if(numbers[i][j]==X){
        //             System.out.println("Idex of the given number is : "+i+","+j);
        //             return;
        //         }
        //     }
        // }
        //  System.out.println("Given no is not present in the matrix !");
        //Q  sum of all elements in 2D Array
        // int sum =0;
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){
        //         sum = sum + nums[i][j];
        //     }
        // }
        // System.out.println(sum);
        //Q find the row with max sum ;
        int max = 0;
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums[0].length; j++) {
                sum = sum + nums[i][j];
            }
            if (sum > max) {
                max = sum;
                ans = i+1;
            }
        }
        System.out.println("max sum = " + max + " with row no : " + ans);

    }
}
