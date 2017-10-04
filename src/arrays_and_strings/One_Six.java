/*
* 1.6 Given an image represented by an NxN matrix, where each pixel in the image is
* 4 bytes write a method to rotate the image by 90 degrees. Can you do this in place?
*/

package arrays_and_strings;

public class One_Six {

    private int[][] theArray;

    public One_Six(int[][] theArray) {
        this.theArray = theArray;
        if (theArray != null && !this.isBalanced()) {
            this.theArray = null;
        }
    }

    public int[][] getTheArray() {
        return theArray;
    }

    public void rotate90NotInPlace() {
        if (theArray == null) return;

        int[][] temp = new int[theArray.length][theArray.length];

        for (int i = 0; i < theArray.length; i++) {
            for (int j = 0; j < theArray.length; j++) {
                temp[i][j] = theArray[theArray.length - 1 - j][i];
            }
        }

        theArray = temp;
    }

    public void rotate90InPlace() {
        if (theArray == null) return;

        int l = theArray.length - 1;

        for (int i = 0; i < l; i++) {
            for (int j = i; j < l - i; j++) {
                theArray[j][l - i] = theArray[i][j] + theArray[j][l - i];
                theArray[i][j] = theArray[j][l - i] - theArray[i][j];
                theArray[j][l - i] = theArray[j][l - i] - theArray[i][j];

                theArray[l - i][l - j] = theArray[i][j] + theArray[l - i][l - j];
                theArray[i][j] = theArray[l - i][l - j] - theArray[i][j];
                theArray[l - i][l - j] = theArray[l - i][l - j] - theArray[i][j];

                theArray[l - j][i] = theArray[i][j] + theArray[l - j][i];
                theArray[i][j] = theArray[l - j][i] - theArray[i][j];
                theArray[l - j][i] = theArray[l - j][i] - theArray[i][j];
            }
        }

    }

    private boolean isBalanced() {
        for (int[] row : theArray) {
            if (theArray.length != row.length) {
                return false;
            }
        }
        return true;
    }

}
