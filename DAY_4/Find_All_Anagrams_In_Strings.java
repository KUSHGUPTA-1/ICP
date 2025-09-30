import java.util.*;
public class Find_All_Anagrams_In_Strings {
    public List<Integer> findAnagrams(String s, String p) {
        int[] reqF = new int[26];
        int[] currF = new int[26];
        for(int c=0;c<p.length();c++){
            reqF[p.charAt(c)-'a']=reqF[p.charAt(c)-'a']+1;
        }
        int l=0;
        int r=0;
        List<Integer> ans=new ArrayList<>();
        while(r<s.length()){
            currF[s.charAt(r)-'a']=currF[s.charAt(r)-'a']+1;
            if(r-l+1==p.length()){
                if(Arrays.equals(currF,reqF)){
                    ans.add(l);
                }
                currF[s.charAt(l)-'a']=currF[s.charAt(l)-'a']-1;
                l++;
            }
            r++;
        }
        return ans;
    }
}
