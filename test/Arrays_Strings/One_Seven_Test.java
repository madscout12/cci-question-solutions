package Arrays_Strings;

import arrays_and_strings.One_Seven;
import org.junit.Assert;
import org.junit.Test;

public class One_Seven_Test {

    @Test
    public void handleNull() {
        One_Seven theSeven = new One_Seven(null);
        theSeven.process();
        Assert.assertArrayEquals(theSeven.getTheArray(), new int[0][0]);
    }

    @Test
    public void noZeros() {
        int[][] theArray = {{1, 2, 3}, {7, 8, 2}, {9, 5, 3}};
        One_Seven theSeven = new One_Seven(theArray);
        theSeven.process();
        Assert.assertArrayEquals(theSeven.getTheArray(), theArray);

    }

    @Test
    public void zeros() {
        int[][] theArray = {{0, 13, 1}, {1, 1, 2}, {1, 12, 0}};
        int[][] expected = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        One_Seven theSeven = new One_Seven(theArray);
        theSeven.process();
        Assert.assertArrayEquals(theSeven.getTheArray(), expected);
    }

    @Test
    public void zerosMN() {
        int[][] theArray = {{0, 13, 1}, {1, 1, 2}, {1, 12, 0}, {22, 16, 93}};
        int[][] expected = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}, {0, 16, 0}};
        One_Seven theSeven = new One_Seven(theArray);
        theSeven.process();
        Assert.assertArrayEquals(theSeven.getTheArray(), expected);
    }


}
