import java.util.*;
public class Queue_Reconstruction_By_Height {
    public int[][] reconstructQueue(int[][] people) {
        //Firstly sort height in descending order
        Arrays.sort(people,(a,b)->{ 
            if(a[0]==b[0]) return a[1]-b[1];  //same height smaller k first.
            return b[0]-a[0];  //heigher height first.
        });
        //Inserting into the list.
        List<int[]> l1=new ArrayList<>();
        for(int curr[]:people){
            l1.add(curr[1],curr);   //Index and uske corresponding value.
        }
        //Converting the list back to Array.
        return l1.toArray(new int[people.length][]);
    }
}
