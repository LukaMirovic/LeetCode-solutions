import java.util.*;
public class Prvi {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapa=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mapa.containsKey(target-nums[i])){
                int arr[]=new int[2];
                arr[0]=mapa.get(target-nums[i]);
                arr[1]=i;
                return arr;
            }else{
                mapa.put(nums[i], i);
            }
        }
        int arr[]=new int[2];
        return arr;
    }
}
