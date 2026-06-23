class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
int currentCount =0;
int maxNum =0;

    for (int i=0;i<nums.length;i++){
 if(nums[i] == 1){

currentCount+=1;

// Track the maximum: if current streak is higher, update numPlus
                if (currentCount > maxNum) {
                    maxNum = currentCount;
                }
   
    
 }
 else if(nums[i] != 1)
currentCount=0;

    }

      return maxNum;
    
    }
}