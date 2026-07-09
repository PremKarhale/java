
class pattern{

    public static void main(String[] args) {
        // this is for rectangle.
        //   for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //    System.out.println(""); 
        //   }


        // next pattern this :
        // *****
        // *   *
        // *   *
        // *****

    //     for(int i=1;i<=4;i++){
    //         for(int j=1;j<=5;j++){
    //             if (i==1||i==4 || j==1 || j==5 ){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }              
    //         }
    //         System.out.println("");
    // }

    // 3) half pyrimid
    // for(int i=1;i<=4;i++){
    //     for(int j =1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // 4 ) inverted pyramid
        // for(int i =1;i<=4;i++){
        //     for(int j = 5; j>i ;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 5) inverted half pyramid
        // for (int i =1; i<=4; i ++){
        //     for(int j =1;j<=4-i;j++){
        //         System.out.print(" ");  // blanks
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("8");
        //     }
        //     System.out.println();
        // }

        // 6) number printing pattern 
        // for(int i =1;i<=5;i++){
        //     for(int j =1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // 7) inverted half number pyramid
        // for (int i =5;i>=1;i--){
        //     for(int j=1;j<=i;j++ ){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 8) print the pattern:
        // int n =1;
        // for(int i=1;i<=5;i++){
        //     for(int j = 1; j<=i;j++){
        //         System.out.print(n+" ");
        //         n++;
        //     }
        //     System.out.println();
        // }
        // 9) print the pattern :
        for(int i =1; i<=5;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum % 2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");

        }

    }
}