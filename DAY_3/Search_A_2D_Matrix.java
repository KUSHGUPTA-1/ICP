public class Search_A_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Brute Force Approach
        // for(int i=0;i<matrix.length;i++){
		// 	for(int j=0;j<matrix[i].length;j++){
		// 		if(matrix[i][j]==target)
        //             return true;
		// 	}
		// }
        // return false;
        //TC--> O(m*n).
        //SC--> O(1)

        //Optimised Approach
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
        //TC--> O(log(m*n))
        //SC-->O(1)
	}
}
