public class Number_Of_Islands {
    public void send(char[][] grid, int i, int j, int m, int n) {   //We applied DFS here
        if (i<0 || i>=m || j<0 || j>=n || grid[i][j]=='0')return;
        grid[i][j]='0';  //Mark kr dia sb cells visited hai. { 1->(land),0->(water) }
        send(grid,i+1,j,m,n); //down
        send(grid,i,j+1,m,n); //right
        send(grid,i-1,j,m,n); //up
        send(grid,i,j-1,m,n); //left
    }
    public int numIslands(char[][] grid) {
        int m=grid.length
        int n=grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if(grid[i][j]=='1'){    //found a new Island.
                    send(grid,i,j,m,n);  //Sink the whole Island.
                    ans++;   //count one Island.
                }
            }
        }
        return ans;
        //TC-> O(m*n) -> Each cell is visited once.
        //SC-> O(m*n) -> if the entire grid is one big island.
    }
}
