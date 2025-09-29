import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        int minr=0,minc=0;
        int maxr=arr.length-1,maxc=arr[0].length-1;
        int c=0; 
        int te=arr.length*arr[0].length; 
        while(c<te){
            //Top to Bottom
            for(int i=minc;i<=maxc && c<te;i++){
                result.add(arr[minr][i]);
                c++;
            }
            minr++;
            //Left to Right
            for(int i=minr;i<=maxr && c<te;i++){
                result.add(arr[i][maxc]);
                c++;
            }
            maxc--;
            //Bottom to Top
            for(int i=maxc;i>=minc && c<te;i--){
                result.add(arr[maxr][i]);
                c++;
            }
            maxr--;
            //Right to Left
            for(int i=maxr;i>=minr && c<te;i--) {
                result.add(arr[i][minc]);
                c++;
            }
            minc++;
        }
        return result;
        //TC-> O(n*m)
        //SC-> O(1)
    }
}
