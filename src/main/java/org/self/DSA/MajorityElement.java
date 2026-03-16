
import java.util.HashMap;
import java.util.Map;

class MajorityElement {
    public int majorityElement(int[] nums) {
        int max= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            int majority=nums[0];
            if(count>max){
                max=count;
                majority=nums[i];
            }
        }
        return majority;
    }
     public int majorityElement2(int[] nums) {
       Map<Integer , Integer> mp =new HashMap<>();
       for(int i=0;i<nums.length;i++){
        mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
       }
       int max=0, majority=nums[0];
       for(int key:mp.keySet()){
        if(mp.get(key)>max){
            max=mp.get(key);
            majority=key;
        }

       }
       return majority;


    }
}