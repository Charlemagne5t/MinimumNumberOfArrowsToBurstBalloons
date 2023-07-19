import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void findMinArrowShotsTest1() {
        int[][] points = {
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}
        };
        int expected = 2;
        int actual = new Solution().findMinArrowShots(points);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMinArrowShotsTest2() {
        int[][] points = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        int expected = 4;
        int actual = new Solution().findMinArrowShots(points);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMinArrowShotsTest3() {
        int[][] points = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };
        int expected = 2;
        int actual = new Solution().findMinArrowShots(points);

        Assertions.assertEquals(expected, actual);
    }
}
