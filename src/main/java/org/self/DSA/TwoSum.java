package org.self.DSA;

import java.util.HashMap;
import java.util.Map;

 class TwoSum{
   class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     //Brute force tc:O(n2)
    //     int sum;
    //     int result[]=new int[2];
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //       sum=0;
    //       sum=nums[i]+nums[j];

    //       if(sum==target){
    //         return new int[]{i,j};
    //       }
    //         }
    //     }
    //     return new int[]{0,0};
    // }

     Map<Integer, Integer> mp= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int need= target-nums[i];
        if(mp.containsKey(need)){
            return new int[]{mp.get(need),i};
        }else{
            mp.put(nums[i],i);
        }
    }
    return new int[]{0,0};
    }
}
 }