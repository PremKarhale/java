class Recursion{
    // global variable or local vriable --> first priority is given to local vrialbe always. variables are mutuable 
    static int  x = 20; //global variable 


  // Standared Recursion !!  
    // public static void print(int n){
    //     if(n>x) return; // base case
    //     System.out.println(n); // work
    //     print(n+1); // call
    // }

//  Magic recursion
    // public static void print(int n){
    //     if(n==0)return;
    //     print(n-1);
    //     System.out.print(n+" "); //1 2 3 4 5 6 7 8 9 10 
    // }

    // Q Print Decreasing or Increasing  5432112345
    // public static void ans(int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.println(n);
    //     ans(n-1);
    //     System.out.println(n);
        
    // }

    // Q Find factorial of a no 
    // public static int factorial(int n){
    //     // if(n==0||n==1) return 1;
    //     // int ans = n*factorial(n-1);
    //     // return ans ;
    //     // return (n<=1) ? 1:n*factorial(n-1);
    // }

    // Q A raised to the power of B 
    public static int araisedtob(int a , int b){
        int ans =1;
        for(int i=0;i<b;i++){
            ans *= a;
        }
        return ans;
    }


    public static void main(String args[]){
        // ans(5);
        // System.out.println(factorial(4));
       System.out.println( araisedtob(2, 3));
        
    }
}