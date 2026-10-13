import java.util.ArrayList;

public class SpriallyTraverseMatrix {

        public ArrayList<Integer> sprialMatrix(int [][] nums){
        ArrayList list = new ArrayList<>();
        int fr = 0;
        int fc =0;
        int lr = nums.length-1;
        int lc = nums[0].length-1;

        while(fr <=lr && fc <=lc){
            for(int i=fc;i<=lc;i++){
                list.add(nums[fr][i]);
            }
            fr++;
            if(fr > lr || fc >lc) break;
            for(int i=fr;i<=lr;i++){
                list.add(nums[i][lc]);
            }
            lc--;
            if(fr > lr || fc >lc) break;
            for(int i=lc;i>=fc;i--){
                list.add(nums[lr][i]);
            }
            lr--;
            if(fr > lr || fc >lc) break;
            for(int i=lr;i>=fr;i--){
                list.add(nums[i][fc]);
            }
            fc++;
        }

        return list;
    }

    public static void main(String[] args){
         int[][] nums = {{3, 11, 10}, {3, 4, 0}, {1, 2, 9},{6,5,7}}; // 3 X 3
         SpriallyTraverseMatrix obj = new SpriallyTraverseMatrix(); //obj
         System.out.println(obj.sprialMatrix(nums));
    }
}