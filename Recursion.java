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
    public static void ans(int n){
        if(n==0)return;
        System.out.println(n);
        ans(n-1);
        System.out.println(n);
        
    }


    public static void main(String args[]){
        ans(5);
        
    }
}