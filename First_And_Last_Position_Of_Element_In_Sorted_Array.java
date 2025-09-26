public class First_And_Last_Position_Of_Element_In_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int z=nums.length;
        int f=-1;
        int l=-1;
        for(int i=0;i<z;i++){
            if(nums[i]==target){
                if(f==-1){
                    f=i;
                }
                l=i;
            }
        }
        return new int[]{f,l};
    }
}
