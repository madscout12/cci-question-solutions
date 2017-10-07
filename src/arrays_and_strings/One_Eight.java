/*
* 1.8 Assume you have a method "isSubstring" (for us, java provides the String class's "contains" method)
*  which checks if one word is a substring of another. Given two strings, s1, and s2, write code to check
*   if s2 is a rotation of s1 usign only one call to isSubstring (e.g. "waterbottles" is a rotation of
*   "erbottlewart".
*/

package arrays_and_strings;

public class One_Eight {
    private String theString;
    private int length;

    public One_Eight(String str) {
        theString = str + str;
        if (str == null) theString = null;
        else length = str.length();
    }

    public boolean isRotation(String rotate) {
        return theString != null && rotate != null && theString.contains(rotate) && rotate.length() == length;
    }
}
