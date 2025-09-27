import java.util.PriorityQueue;
public class Kth_Largest_Element_In_An_Array {
    public int findKthLargest(int[] nums, int k) {
        //With Sorting.
        // int n=nums.length;
        // Arrays.sort(nums);
        // return nums[n-k];

        //without Sorting.
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){      // k elements tak ka ek peiorityqueue bna liya.
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(pq.peek()<nums[i]){  //ab peek wala topper nhi rha toh isko remove kar do.
                pq.remove();  // pq.poll() it also has same meaning.
                pq.add(nums[i]);  //naye topper ko add kar do.
            }
        }
        return pq.peek();
    }
}
