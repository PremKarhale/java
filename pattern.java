
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
        for (int i =1; i<=4; i ++){
            for(int j =1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("8");
            }
            System.out.println();
        }


    }
}