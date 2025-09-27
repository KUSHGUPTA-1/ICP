public class Merged_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Brute Force Approach
        // int i=0,j=0;
        // for(j=0,i=m;j<n;j++){
        //     nums1[i]=nums2[j];
        //     i++;
        // }
        // Arrays.sort(nums1);

        //Optimisation ke sath.
        int a=m-1;
        int b=n-1;
        int merge=m+n-1;
        while(b>=0){
            if(a>=0 && nums1[a]>nums2[b]){
                nums1[merge--]=nums1[a--];
            }
            else{
                nums1[merge--]=nums2[b--];
            }
        }
    }
}
