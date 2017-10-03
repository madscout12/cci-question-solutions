/*
 * 1.1 Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 * The below implementation "hasNoDuplicates"doesn't use additional data structures.
 * It is O(N^2)
 *
 * The below implementation of "hasNoDuplicatesEff" uses a HashMap.
 * It is O(N)
 *
 */

package arrays_and_strings;

import java.util.HashMap;

public class One_One {
    private String stringy;

    public One_One(String one) {
        if (null == one) {
            stringy = "";
        } else {
            stringy = one;
        }
    }

    public boolean hasNoDuplicates() {

        for (int i = 0; i < stringy.length(); i++) {
            for (int j = i + 1; j < stringy.length(); j++) {
                if (stringy.charAt(j) == stringy.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasNoDuplicatesEff() {

        HashMap<Character, Character> theMap = new HashMap<>();
        Character temp;

        for (int i = 0; i < stringy.length(); i++) {

            temp = stringy.charAt(i);
            if (theMap.remove(temp) != null) {
                return false;
            }
            theMap.put(temp, temp);
        }
        return true;
    }

}
