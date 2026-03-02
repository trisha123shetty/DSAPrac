package org.self.DSA;

import java.util.HashMap;
import java.util.Map;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }

        // }
        // return false;

        Map<Integer, Integer> mpp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                return true;
            }else{
                mpp.put(nums[i],mpp.get(nums[i]+1));
            }
        }
        return false;
    }
}