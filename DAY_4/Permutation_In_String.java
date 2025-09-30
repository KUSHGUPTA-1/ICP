public class Permutation_In_String {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length(),n2=s2.length();
        if(n1>n2){
            return false;
        }
        int c1[]=new int[26];  //String s1 ki frequency.
        int c2[]=new int[26];  //Frequency of current window in s2.
        for(char ch:s1.toCharArray()){
            c1[ch-'a']++;
        }
        for(int i=0;i<n1;i++){
            c2[s2.charAt(i)-'a']++;
        }
        if(matches(c1,c2)) return true;
        //slide the window
        for(int i=n1;i<n2;i++){
            c2[s2.charAt(i)-'a']++;   // add a new character.
            c2[s2.charAt(i-n1)-'a']--;  //remove an old  character.
            if(matches(c1,c2)) return true;  //means permutation exists.
        }
        return false;
    }
    public boolean matches(int c1[],int c2[]){
        for(int i=0;i<26;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
    //TC-> O(n2).
    //SC-> O(1).
}
