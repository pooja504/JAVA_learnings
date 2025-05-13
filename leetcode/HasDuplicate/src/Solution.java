import java.util.HashSet;

public class Solution {
    public boolean hasDuplicate(int[] nums) {
//        HashSet<Integer> h=new HashSet<>();
//        for (int i :nums){
//            h.add(i);
//        }
//        return !(h.size()==nums.length);



//        for(int i=0; i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    return true;
//
//                }
//            }
//
//        }
//        return false;
        for (int i=0;i<nums.length;i++){

            for (int j=0;j<i;j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;




    }

}
