class Recursion{
    // global variable or local vriable --> first priority is given to local vrialbe always. variables are mutuable 
    static int  x = 20; //global variable 

    public static void print(int n){
        if(n>x) return;
        System.out.println(n);
        print(n+1);
    }

    public static void main(String args[]){
        print(1);
        
    }
}