import java.util.*;

class usrinput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //scanner call 
        // String name = sc.nextLine();
        //
        // System.out.print("Enter your age :"); 

        // if else statements 
        // int age = sc.nextInt();
        // if (age > 18){
        //     System.out.println("You are adult");
        // }else{
        //     System.out.println("No you are not a adult , you are a small kid !");
        // }
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("it is even");
        }
        else{
            System.out.println("Odd");
        }

    }

}