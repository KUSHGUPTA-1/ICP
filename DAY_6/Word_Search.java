public class Word_Search {
    public boolean exist(char[][] board, String word) {
        int n=board.length,m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        boolean result=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){   //Only starts recursion if first letter matches.
                    result=search(board,word,visited,0,i,j);
                    if(result) return true;   //If word found return immediately.
                }
            }
        }
        return false;
    }
    public boolean search(char board[][],String word,boolean visited[][],int index,int i,int j){
        if(index==word.length()){   //Base case
            return true;
        }
        //Edge cases ke liye check kra.
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j] || board[i][j]!=word.charAt(index)){
            return false;
        }
        visited[i][j]=true;  //Marked as visited.
        //Call in 4 directions (go,up,right,left).
        if(search(board,word,visited,index+1,i+1,j) || search(board,word,visited,index+1,i-1,j) || search(board,word,visited,index+1,i,j-1) || search(board,word,visited,index+1,i,j+1)){
            return true;
        }
        visited[i][j]=false;  //Backtrack and mark them as unvisited.
        return false;    //Word nhi mila puri grid mai.
        //TC->O(m*n*4^L).
        //SC->O(l).
    }
}
