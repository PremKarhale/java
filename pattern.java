
class pattern{

    public static void main(String[] args) {
        // this is for rectangle.
        //   for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //    System.out.println(""); 
        //   }

        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==2){
                    if(j==2|j==3|j==4){
                        System.out.print("");                       
                    }
                }
                System.out.print("*");                
            }
            System.out.println("");
        }
    }
}