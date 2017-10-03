/*
* 1.3Given two strings, write a method to decide if one is a permutation of the other.
*
*/

package arrays_and_strings;

import java.util.ArrayList;
import java.util.HashMap;

public class One_Three {
    private HashMap<Character, ArrayList<Character>> theMap;
    private String one;

    public One_Three(String orig) {
        one = orig;
        theMap = new HashMap<>();
        makeHashMap();
    }

    public boolean isPermutation(String two) {

        if (one == null || two == null) return false;

        ArrayList<Character> list;

        for (int i = 0; i < two.length(); i++) {
            list = theMap.get(two.charAt(i));

            if (list == null || list.isEmpty()) {
                return false;
            } else {
                list.remove(0);
                if (list.isEmpty()) theMap.remove(two.charAt(i));
            }
        }
        return theMap.isEmpty();

    }

    private void makeHashMap() {
        if (one == null) return;

        ArrayList<Character> list;
        for (int i = 0; i < one.length(); i++) {
            list = theMap.get(one.charAt(i));

            if (list == null) {
                list = new ArrayList<>();
                list.add(one.charAt(i));
                theMap.put(one.charAt(i), list);
            } else {
                list.add(one.charAt(i));
            }

        }
    }
}
