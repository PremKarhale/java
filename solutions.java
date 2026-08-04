import java.util.HashSet;

// Remove duplicates from the array
public class solutions {
    public int removeDuplicates(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;
        for(int num:nums){
            if(!seen.contains(num)){
                seen.add(num);
                nums[index] = num;
                index++;
            }
        }
        return index; //tell no of unique elements.
    }

    public static void main(String[] args){
        int nums[]={1,2,1,2,4,3,3,};
        solutions sol = new solutions(); 
        int  k =sol.removeDuplicates(nums);
        System.out.println(k);
        
    }
}
