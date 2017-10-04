package Arrays_Strings;


import arrays_and_strings.One_Six;
import org.junit.Assert;
import org.junit.Test;

public class One_Six_Test {

    @Test
    public void checkNull() {
        One_Six theSix = new One_Six(null);
        theSix.rotate90NotInPlace();
        theSix.rotate90InPlace();
        Assert.assertArrayEquals(theSix.getTheArray(), null);
    }

    @Test
    public void checkNotNbyN() {
        int[][] theArray = new int[2][3];

        One_Six theSix = new One_Six(theArray);
        theSix.rotate90NotInPlace();
        theSix.rotate90InPlace();
        Assert.assertArrayEquals(theSix.getTheArray(), null);


    }

    @Test
    public void checkRotate3by3() {

        int[][] theArray = new int[3][3];
        int[][] expected = new int[3][3];

        for (int i = 0; i < theArray.length; i++) {
            for (int j = 0; j < theArray[i].length; j++) {
                theArray[i][j] = 3 * i + j;
                expected[i][j] = 3 * (2 - j) + i;
            }
        }

        One_Six theSix = new One_Six(theArray);
        theSix.rotate90NotInPlace();

        Assert.assertArrayEquals(theSix.getTheArray(), expected);
    }

    @Test
    public void checkRotate4by4() {

        int[][] theArray = new int[4][4];
        int[][] expected = new int[4][4];

        for (int i = 0; i < theArray.length; i++) {
            for (int j = 0; j < theArray[i].length; j++) {
                theArray[i][j] = 4 * i + j;
                expected[i][j] = 4 * (3 - j) + i;
            }
        }

        One_Six theSix = new One_Six(theArray);
        theSix.rotate90NotInPlace();

        Assert.assertArrayEquals(theSix.getTheArray(), expected);
    }

    @Test
    public void checkRotate3by3InPlace() {

        int[][] theArray = new int[3][3];
        int[][] expected = new int[3][3];

        for (int i = 0; i < theArray.length; i++) {
            for (int j = 0; j < theArray[i].length; j++) {
                theArray[i][j] = 3 * i + j;
                expected[i][j] = 3 * (2 - j) + i;
            }
        }

        One_Six theSix = new One_Six(theArray);
        theSix.rotate90InPlace();

        Assert.assertArrayEquals(theSix.getTheArray(), expected);
    }

    @Test
    public void checkRotate4by4InPlace() {

        int[][] theArray = new int[4][4];
        int[][] expected = new int[4][4];

        for (int i = 0; i < theArray.length; i++) {
            for (int j = 0; j < theArray[i].length; j++) {
                theArray[i][j] = 4 * i + j;
                expected[i][j] = 4 * (3 - j) + i;
            }
        }

        One_Six theSix = new One_Six(theArray);
        theSix.rotate90InPlace();

        Assert.assertArrayEquals(theSix.getTheArray(), expected);
    }

}
