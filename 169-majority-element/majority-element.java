class Solution {
    public int majorityElement(int[] nums) {

        int majority = nums[0];
        int vote = 1;

        for(int i = 1; i < nums.length; i++){

            if(vote == 0){
                majority = nums[i];
                vote = 1;
            }
            else if(majority == nums[i]){
                vote++;
            }
            else{
                vote--;
            }
        }

        return majority;
    }
}