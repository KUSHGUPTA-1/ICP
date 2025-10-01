import java.util.Arrays;
public class Non_Overlapping_Intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));  //Sort Intervals by end time.
        int prev=intervals[0][1];    //End time for last kept interval.
        int c=1;   //non-overlapping interval ka count.
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=prev){
                c++;
                prev=intervals[i][1];
            }
        }
        return intervals.length-c;
        //TC->O(nlogn + n).
        //Sc->O(1).
    }
}
