/*
* Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
* entire column are set to 0.
*/

package arrays_and_strings;

import java.util.HashSet;

public class One_Seven {

    private int[][] theArray;
    private int[] zeroRow;

    public One_Seven(int[][] theArray) {
        this.theArray = theArray;
        if (theArray == null) {
            this.theArray = new int[0][0];
            zeroRow = new int[0];
        } else {
            zeroRow = new int[theArray[0].length];
        }
    }

    public void process() {
        HashSet<Integer> cols = new HashSet<>();
        markRowsCols(cols);
        zeroCols(cols);
    }

    private void markRowsCols(HashSet<Integer> cols) {
        boolean flag = false;

        for (int i = 0; i < theArray.length; i++) {
            for (int j = 0; j < theArray[i].length; j++) {
                if (theArray[i][j] == 0) {
                    cols.add(j);
                    flag = true;
                }
            }
            if (flag) theArray[i] = zeroRow;
            flag = false;
        }
    }

    private void zeroCols(HashSet<Integer> cols) {
        for (Integer col : cols) {
            for (int i = 0; i < theArray.length; i++) {
                theArray[i][col] = 0;
            }
        }

    }

    public int[][] getTheArray() {
        return this.theArray;
    }

}
