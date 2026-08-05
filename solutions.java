import java.util.HashSet;

public class solutions {

    // remove duplicates from an sorted array 
    // public int removeDuplicates(int[] nums){
    //     // HashSet<Integer> seen = new HashSet<>();
    //     // int index = 0;
    //     // for(int num:nums){
    //     //     if(!seen.contains(num)){
    //     //         seen.add(num);
    //     //         nums[index] = num;
    //     //         index++;
    //     //     }
    //     // }
    //     // return index; //tell no of unique elements.

    //     // optimal solution 
    //     int i =0;
    //     for(int j=1;j<nums.length;j++){
    //         if(nums[i]!=nums[j]){
    //             nums[i+1]=nums[j];
    //             i++;
    //         }
    //     }
    //     return i+1;
    // }
    public int UnionofSortedArray(int nums1[],int nums2[]){
        HashSet<Integer> seen = new HashSet<>();
        
        return -1;
    }

    public static void main(String[] args){
        int nums1[]={1,1,2,3,3,};
        int nums2[]={2,2,4,5,5,6};
        solutions sol = new solutions(); 
        // int  k =sol.removeDuplicates(nums);
        // System.out.println(k);
        
    }
}

// rotating k elements to the right 
// class Solution {
//     public void rotate(int[] nums, int k) {
//         k = k % nums.length;
//        ArrayList<Integer> list = new ArrayList<>(); // adds element dynamically 
//         for(int i=0;i<k;i++){
//             list.add(nums[i]);
//         }
//         for(int i=k;i<nums.length;i++){
//             nums[i-k]=nums[i];
//         }
//         int j=0;
//         for(int i=nums.length-k;i<nums.length;i++){
//             nums[i]=list.get(j);
//             j++;
//         }
//     }
// }
