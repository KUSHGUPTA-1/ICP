public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();   //Final answer
        List<Integer> l1=new ArrayList<>();   //Current Combination.
        Combinations(1,n,k,ans,l1);   //Recursion ko 1 se strt kia.
        return ans;
    }
    public void Combinations(int start,int n,int k,List<List<Integer>> ans,List<Integer> l1){
        if(l1.size()==k){    //Base case.
            ans.add(new ArrayList<>(l1));    //Copy the current list to ans.
            return;
        }
        for(int i=start;i<=n;i++){
            l1.add(i);   //choose i
            Combinations(i+1,n,k,ans,l1);   //Recursion with next Number.
            l1.remove(l1.size()-1);    //For Backtracking.
        }
        //TC-> O(C(n,k)*k).
        //SC-> O(k).
    }
}
