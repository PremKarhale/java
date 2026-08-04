public class solutions {
    public int removeDuplicates(int[] nums){
        // HashSet<Integer> seen = new HashSet<>();
        // int index = 0;
        // for(int num:nums){
        //     if(!seen.contains(num)){
        //         seen.add(num);
        //         nums[index] = num;
        //         index++;
        //     }
        // }
        // return index; //tell no of unique elements.

        // optimal solution 
        int i =0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args){
        int nums[]={1,1,2,3,3,};
        solutions sol = new solutions(); 
        int  k =sol.removeDuplicates(nums);
        System.out.println(k);
        
    }
}
