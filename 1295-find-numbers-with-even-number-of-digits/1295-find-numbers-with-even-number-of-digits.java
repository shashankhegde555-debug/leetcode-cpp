class Solution {
    public boolean nos(int nums){
        int count=0;
        while(nums!=0){
            nums=nums/10;
            count++;
        }
        return count%2==0;
    }
    public int findNumbers(int[] nums){
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nos(nums[i])){
                count2++;
            }
        }
        return count2;
    }
}