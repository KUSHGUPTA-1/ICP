public class Unique_Paths {
    public int uniquePaths(int m,int n){
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){   //0th column ko 1 se fill kr dia.
            dp[i][0]=1;
        }
        for(int j=0;j<n;j++){   //0st row ko 1 se fill kr dia. 
            dp[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
        //TC->O(m*n).
        //SC->O(m*n).

        // int[][] dp=new int[m][n]; 
        // return countPaths(0,0,m,n,dp);
    }
    // public int countPaths(int cr,int cc,int m,int n,int[][] dp){
    //     if(cr==m-1 && cc==n-1)return 1;  //base cases for destination.
    //     if(cr>=m || cc>=n)return 0;   //base cases for out of bounds.
    //     if(dp[cr][cc]!=0)return dp[cr][cc];
    //     dp[cr][cc]=countPaths(cr,cc+1,m,n,dp)+countPaths(cr+1,cc,m,n,dp);
    //     return dp[cr][cc];
    // }
}
