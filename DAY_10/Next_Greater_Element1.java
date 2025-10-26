import java.util.*;
public class Next_Greater_Element1 {
    public int[] nextGreaterElement(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> map=new HashMap<>();
        //For Storing NextGreater of Each number in nums2.
        Stack<Integer> st=new Stack<>();
        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.getOrDefault(nums1[i],-1);
        }
        return ans;
        //TC->O(n+m) n=length of nums1.
        //SC->O(m)
    }
}
