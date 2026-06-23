class Solution {
    public int search(int[] nums, int target) {
        


//logic here is it keeps on looping until the target is found(while)
//use two-pointers
int left=0;
int right=nums.length-1;

        while(left<=right){
            //here is to find the middle index of array
            int middle=left+((right-left)/2);

            if(nums[middle]==target){
                return middle;
            }
            if(nums[middle]<target){
                left=middle+1;
            }
            else {
                right=middle-1;
                
            }
        

        }

        return -1;

    }
}
