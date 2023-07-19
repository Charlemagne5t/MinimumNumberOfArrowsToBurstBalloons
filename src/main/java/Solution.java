import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return 0;
        }
        int arrows = 1;
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int arrowPoint = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if(points[i][0] > arrowPoint){
                arrows++;
                arrowPoint = points[i][1];
            }
        }

        return arrows;
    }
}