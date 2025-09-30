public class Max_Consecutive_Ones_3 {
    public int longestOnes(int[] nums, int k) {
        int strt=0;  //left pointer in sliding window.
        int end=0;   //right pointer in sliding window.
        int z=0;     //zeros count in current window.
        while(end<nums.length){
            if(nums[end]==0){    
                z++;        //Count the zeros.
            }
            end++;   //Expand kr du window size ko.
            if(z>k){  //Zeros k se jyada then window invalid.
                if(nums[strt]==0){   
                    z--;   //window shrink kr do.
                }
                strt++;    //left pointer aage bada diya.
            }
        }
        return end-strt;  //It gives length of longest window.
        //TC-> o(n) as each element processed atmost twice(once by end,once by strt).
        //SC-> O(1) as no extra array or data structure used.
    }
}
