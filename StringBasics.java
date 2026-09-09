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
        String s = "markrm";
        // int left = s.charAt(0);
        // int right = s.length()-1;
        // while(left<right){

        // }
        int i =0;
        for(int j=s.length()-1;j<i;j--){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }else{
                System.out.println("not a palindrone ");
            }
        }


}
}
