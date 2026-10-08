
public class twoDArray {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the rows and columns");
        // int rows = sc.nextInt();
        // int col = sc.nextInt();

        // int [][] nums = new int[rows][col]; // initialising the 2D Array.
        int[][] nums = {{3, 11, 10}, {3, 4, 0}, {1, 2, 9}}; // 3 X 3

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
        System.out.println();

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
        // int max = 0;
        // int ans = -1;
        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0;
        //     for (int j = 0; j < nums[0].length; j++) {
        //         sum = sum + nums[i][j];
        //     }
        //     if (sum > max) {
        //         max = sum;
        //         ans = i;
        //     }
        // }
        // System.out.println("max sum = " + max + " with row no : " + ans);
        // Q Find the mini element out of all the elements of each rows 
        // int mini =Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[0].length;j++){
        //         for(int k=j+1;k<nums[0].length;k++){
        //             if(nums[i][k] < nums[i][j]){
        //                 mini = Math.min(mini,nums[i][k]);
        //             }else{
        //                 mini = Math.min(mini,nums[i][j]);
        //             }
        //         }
        //     }
        // }
        // System.out.println(mini);
        // Q Find the mini element out of all the max elements in each row 
        //     ArrayList<Integer> list = new ArrayList<>();
        //     for(int i=0;i<nums.length;i++){
        //         int max = Integer.MIN_VALUE;
        //         for(int j=0;j<nums[0].length;j++){                 // math.max lena hi padega 
        //             for(int k=0;k<nums[0].length;k++){
        //                 if(nums[i][j] > nums[i][k]){
        //                     max = Math.max(max,nums[i][j]);
        //                 }
        //             }
        //         }
        //         list.add(max);      
        //     }
        //     System.out.println(list);
        //     // dynamic array 
        //     int arr[] = new int[list.size()];
        //    for(int i=0;i<list.size();i++){
        //         arr[i] = list.get(i);
        //    }
        //    int mini =Integer.MAX_VALUE;
        //    for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i]<arr[j]){
        //             mini = Math.min(mini,arr[i]);
        //         }
        //     }
        //    }
        //    System.out.println(mini);
        // For each loop in 2D array
        // for(int i=0;i<nums.length;i++){  //nums.length = 3
        //     for(int ele : nums[i]){
        //         System.out.print(ele + " ");
        //     }
        //     System.out.println();
        // }
// another way 
        // for(int [] a : nums){
        //     for(int ele : a){
        //         System.out.print(ele+" ");
        //     }
        //     System.out.println();
        // }

        // Q Print matrix in a snake pattern 
        // for (int i = 0; i < nums.length; i++) {
        //     if (i % 2 == 0) {
        //         for (int j = 0; j < nums[0].length; j++) {
        //             System.out.print(nums[i][j] + " ");
        //         }
        //     } else {
        //         for (int j = nums[0].length - 1; j >= 0; j--) {
        //             System.out.print(nums[i][j] + " ");
        //         }
        //     }
        //     System.out.println();

        // }

        // Q Reverse all rows of a given matrix and then reverse their cols 
        // for(int i=0;i<nums.length;i++){
        //     for(int j=nums[0].length-1;j>=0;j--){
        //         System.out.print(nums[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        // for(int j=0;j<nums[0].length;j++){
        //     for(int i=nums.length-1;i>=0;i--){
        //         System.out.print(nums[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // Q Snake print coloumn wise 
        
        // for(int j=0;j<nums[0].length;j++){  // to print the matrix col wise we just have to reverse the i and j !!
        //     if(j%2==0){
        //         for(int i=0;i<nums.length;i++){
        //         System.out.print(nums[i][j]+" ");
        //     }
        //     }else{
        //         for(int i=nums.length-1;i>=0;i--){
        //             System.out.print(nums[i][j]+" ");
        //         }
        //     }
        //     System.out.println();
            
        // }

        // Q Transpose of a matrix 
        // 3 11 10 
        // 3 4 0 
        // 1 2 9 

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums[0].length;j++){
        //         int temp = nums[i][j];
        //         nums[i][j] = nums[j][i];
        //         nums[j][i] = temp;
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[0].length;j++){
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }s

        // Q Rotate the matrix to the 90 degrees 
         // 3 11 10 
        // 3 4 0 
        // 1 2 9 
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[0].length;j++){
        //         nums[i][j]=nums[j][(nums.length-1)-i];
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[0].length;j++){
        //         System.out.print(nums[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // Transpose 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums[0].length;j++){
                int temp = nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i] = temp;
            }
        }
        // Reverse 
        for(int i=0;i<nums.length;i++){
            for(int j=nums[0].length-1;j>=0;j--){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
