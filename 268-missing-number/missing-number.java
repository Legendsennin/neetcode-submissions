class Solution {
    public int missingNumber(int[] nums) {
 int numSum =0;
 int actualSum=0;
for (int i=0 ;i<nums.length;i++){
    numSum+= nums[i]; // 0 -> 0+3->0+3+1......etc
}

for(int j=0; j<=nums.length;j++){
    actualSum=actualSum+j;
}

return actualSum-numSum;


        
    }
}