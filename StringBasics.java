public class StringBasics {
    public static void main(String[] args){
        // String s = "hello";
        // System.out.println(s);
        // System.out.println(s.charAt(1));
        
        // Q) Count the no of vowels in word "Karhale"
    //     String k = "Karhale";
    //     int count =0;
    //     for(int i=0;i<k.length();i++){
    //         char ch = k.charAt(i);
    //         if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    //             count ++;
    //         }
    //     }
    //     System.out.println(count);
    // }
    
    // Q ) find the following the sting is palendrome or not 
        String s = "markram";
        // int i =s.length()-1;
        // for(int j=0;j<i;j++){
        //     if(s.charAt(i)==s.charAt(j)){
        //         i--;
        //     }else{
        //         System.out.println("not a palindrone ");
        //         break;
        //     }
        // }
        // int i =0;
        // int j = s.length()-1;
        // while(i<j){
        //     if(s.charAt(i)!= s.charAt(j)){
        //         System.out.println("String is not a palindrome");
        //         break;
        //     }
        //     i++;
        //     j--;
        // }
        // System.out.println("String is palindrome");

        // putting string into char array 
        s = "Gopi";
        // System.out.println(s);  hense strings are mutable

        // puting char strings into an array 
        // char arr[]= s.toCharArray();
        // for(char ch:arr){
        //     System.out.println(ch);
        // }

    // Q Print all substrings of Prem
    // System.out.println(s.substring(0));
    for(int j=0;j<s.length();j++){
        for(int i=j;i<=s.length();i++){
        System.out.println(s.substring(j,i));
    }
    }
    
}
}
