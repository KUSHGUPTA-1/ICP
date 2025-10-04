class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        //Kadanes Algorithm.
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
        //TC->O(n).
        //SC->O(1).
    }
}