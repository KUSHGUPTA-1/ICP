import java.util.Arrays;
public class Boats_To_Save_People {
    public int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);
        int l=0;    //lightest person.
        int r=people.length-1;    //Heaviest person.
        int c=0;    //count no.of boats used.
        while(l<=r){
            if(people[l]+people[r] <= limit){   //Ekdum lightest ko sabse heaviest ke sath pair then check.
                l++;
            }
            r--;     //Right hamesha boat pe jayega.
            c++;     
        }
        return c;
        //TC-> O(n log n).
        //SC-> O(1).
    }
}
