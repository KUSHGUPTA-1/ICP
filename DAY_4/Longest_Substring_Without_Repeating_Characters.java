import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s){
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                if(set.contains(ch)){
                    break; // duplicate mila,aage check ki zarurat nahi.
                }
                set.add(ch);
                maxlen=Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;
        //TC-> O(n2)
        //SC-> O(min(n,charset)) as HashSet stores atmost n characters.
    }
}

