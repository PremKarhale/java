// Home work questions
import java.util.*;


public class functions2 {
    // public static int average(int a, int b , int c){
    //     return ((a+b+c)/3);
    // }
    
    public static void oddSum(int n){
        int sum =1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("sum of odd no. is : "+sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddSum(5);


    }
}
