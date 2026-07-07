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

        // System.out.print("Enter the no a:");
        // int a  = sc.nextInt();
        // System.out.print("Enter the no b :");
        // int b = sc.nextInt();
        // if (a==b){
        //     System.out.println("Equal");
        // }else if(a>b) {
        //     System.out.println("a is greater so we do addition");
        //     int sum = a+b;
        //     System.out.println("its sum is : "+ sum);
        // }else{
        //     System.out.println("a is smaller so we do subtraction");
        //     int sub = a-b;
        //     System.out.println("its sub is :"+sub);

        // }
        // switch case 
        // int button = sc.nextInt();
        // switch(button){
        //     case 1 :System.out.println("hello");
        //     break;
        //     case 2 :System.out.println("namaste");
        //     break;
        //     case 3 :System.out.println("hi");
        //     break; 
        //     default: System.out.println("invalid button");

        // for loop syntax for(initialisation , condition , updation )
        // for (int i = 0;i<100;i++){
        //     System.out.println("i am good !");    // simple for loop 
        // }
        // }
        // int i =0;  initialisation
        // while (i<11){
        //     System.out.println(i);
        //     i = i + 1;

        // }
        // do{
        //     System.out.println(i);
        //     i = i+1;

        // }while(i<11);

        // Print the sum of firt 4 natural numbers 
        // int n = 1;
        // int sum = 0 ;
        // while(n<=4){
        //     sum = sum + n;
        //     n++;
        // }
        // System.out.println("Total sum of natural no is : "+sum);

        // or 
        // int n = 4;
        // int sum =0;
        // for (int i =1;i<=4;i++){
        //     sum = sum + i;

        // }
        // System.out.println(sum);

        // print the table by taking input from the user n 
        char choice = 'T';
        while(choice =='T' || choice == 't'){
        System.out.print("Enter the no to get his table : ");
        int n = sc.nextInt();
        for (int i = 1;i<=10;i++){
            System.out.println(n + "*"+i + "="+ n*i);
        }
        System.out.println("Do you want to get the other table (T/F):");
        choice = sc.next().charAt(0);

        }
        System.out.println("Loop terminated sucessfully !");



    } 
}
    

