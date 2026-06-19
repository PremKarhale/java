import java.util.*;

class usrinput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //scanner call 

        // String name = sc.nextLine();
        // System.out.print("Enter your age :"); 
        // if else statements 
        // int age = sc.nextInt();
        // if (age > 18){
        //     System.out.println("You are adult");
        // }else{
        //     System.out.println("No you are not a adult , you are a small kid !");
        // }

        System.out.print("Enter the no a:");
        int a  = sc.nextInt();
        System.out.print("Enter the no b :");
        int b = sc.nextInt();
        if (a==b){
            System.out.println("Equal");
        }else if(a>b) {
            System.out.println("a is greater so we do addition");
            int sum = a+b;
            System.out.println("its sum is : "+ sum);
        }else{
            System.out.println("a is smaller so we do subtraction");
            int sub = a-b;
            System.out.println("its sub is :"+sub);

        }
    }
    

}