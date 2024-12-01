import java.util.*;
class solution5{
    public static int searching(int[] nums, int target){
        HashSet<Integer> present = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            present.add(nums[i]);
            if(nums[i] == target)
                return i;
        }
            return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(searching(nums, target));
    }
}