/*
* 2.7 Implement a function to check if a linked list is a palindrome.
*/

package linked_lists;

import java.util.LinkedList;

public class Two_Seven {
    private LinkedList<Character> theList;

    public Two_Seven(LinkedList<Character> theList) {
        this.theList = theList;
    }

    public boolean checkPalindrome() {
        if (theList == null) return false;
        int size = theList.size();

        LinkedList<Character> temp = new LinkedList<>();

        for (int i = 0; i < size / 2; i++) {
            temp.push(theList.pop());
        }

        if (size % 2 == 1) theList.pop();

        while (!theList.isEmpty()) {
            if (!temp.pop().equals(theList.pop())) return false;
        }
        return true;
    }
}
