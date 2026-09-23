public class StringBasics {
    public static void main(String[] args){
        // String s = "hello";
        // System.out.println(s);
        // System.out.println(s.charAt(1)); e
        
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
        // String s = "markram";
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
        
        // s = "Gopi";
        // puting char strings into an array 
        // char arr[]= s.toCharArray();
        // for(char ch:arr){
        //     System.out.println(ch);
        // }

    // Q Print all substrings of Prem
    // System.out.println(s.substring(0));
    // for(int j=0;j<s.length();j++){
    //     for(int i=j;i<=s.length();i++){
    //     System.out.println(s.substring(j,i));
    // }
    // }

    // Q) find the sum of all possible substrings of this string 
    // String s ="234";
    // int sum =0;
    // for(int i=0;i<s.length();i++){
    //     for(int j=i+1;j<=s.length();j++){
    //         int num = Integer.parseInt(s.substring(i,j));
    //         sum = sum + num;
    //     }
    // }
    // System.out.println(sum);//300

    // Strings are inmutable 
    // String s1= "raghav";
    // String s2 = "raghav";
    // System.out.println(s1==s2);// true    because both s1 and s2 are pointing to the same String "raghav " in the memory  [ S1 ----> "raghav" <---- S2]

    // // now 
    // String s1 = new String("raghav"); // this created a totally new string 
    // String s2 = new String("raghav");

    // System.out.println(s1==s2);//false  // because now it compares address location of the strings in the memory 
    // System.out.println(s1.equals(s2)); //true

    // StringBuilder s = new StringBuilder( "prem");  // string builder does not create a new memory location every time while appending. it appends new string in the existing string.

    // System.out.println(s.length()+" "+s.capacity());
    
    // s.append(" "+"karhale");//prem karhale
    // System.out.println(s);
    // System.out.println(s.length()+" "+s.capacity()); //12 20

    // String s = "prem";
    // s = s + "karhale"; // now it became a new string s pointing to a "premkarhale"

    // sb.append("jain");
    
    // Manually perform operation of reversing the string 
    // StringBuilder sb = new StringBuilder("PremKarhale");
    // System.out.println(sb.reverse()); 
    // int i =0 ;
    // int j = sb.length()-1;
    // while(i<=j){
    //     char temp = sb.charAt(i);
    //     sb.setCharAt(i,sb.charAt(j));
    //     sb.setCharAt(j, temp);

    //     i++;
    //     j--;
    // }
    // System.out.println(sb);

    // if you want to reverse the String s , then it is very difficult and not efficient , one such way of doing it is to convert it into StringBuilder and then doing it 
    String s = "prem";
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    s = sb.toString(); // sb is converted back to String 
    System.out.println(s);








    
}
}
