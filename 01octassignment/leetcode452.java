import java.util.*;
class Solution {
    public int findMinArrowShots(int[][] points) {
        int arrow=1;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int a=points[0][1];
        for(int i=1;i<points.length;i++){
            if(a<points[i][0]){
                arrow++;
                a=points[i][1];
            }
        }
        return arrow;





    }
}