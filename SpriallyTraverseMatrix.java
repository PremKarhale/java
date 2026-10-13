import java.util.ArrayList;

public class SpriallyTraverseMatrix {

    public static void main(String[] args){
        
    }
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
            for(int i=fr;i<=lr;i++){
                list.add(nums[i][lr]);
            }
            lc--;
            for(int i=lc;i>=fc;i--){
                list.add(nums[lr][i]);
            }
            lr--;
            for(int i=lr;i>=fr;i--){
                list.add(nums[lr][fc]);
            }
            fc++;
        }

        return list;
    }
}