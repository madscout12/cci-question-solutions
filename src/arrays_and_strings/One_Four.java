/*
* 1.4 Write a method to replace all spaces in a string with '%20'.
* You may assume that the string has suffcient space at the end of the string to hold
* the additional charecters, and that you are given the "true" length of the string.
* (Note: if implementing in Java, please use a character array so that you can perform
* this operation in place.)
*/
package arrays_and_strings;


public class One_Four {

    private char[] theArray;

    public One_Four(char[] theArray) {
        this.theArray = theArray;
    }

    public void replace() {
        if (theArray == null) return;
        int index = findLastChar();

        for (int i = theArray.length - 1; i >= 0; i--) {
            if (theArray[index] == 32) {
                theArray[i] = '0';
                theArray[i - 1] = '2';
                theArray[i - 2] = '%';
                i = i - 2;
            } else {
                theArray[i] = theArray[index];
            }
            index--;
        }

    }

    public String getString() {
        if (theArray == null) return null;
        return new String(theArray);
    }

    private int findLastChar() {
        for (int i = theArray.length - 1; i >= 0; i--) {
            if (theArray[i] != 0) return i;
        }
        return -1;
    }


}
