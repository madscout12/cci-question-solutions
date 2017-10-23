package linked_lists_test;

import linked_lists.Two_Seven;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class Two_Seven_Test {

    @Test
    public void checkNull() {
        Two_Seven theSeven = new Two_Seven(null);
        Assert.assertFalse(theSeven.checkPalindrome());
    }

    @Test
    public void checkEvenPalin() {
        LinkedList<Character> theList = makeList("abba");
        Two_Seven theSeven = new Two_Seven(theList);
        Assert.assertTrue(theSeven.checkPalindrome());
    }

    @Test
    public void checkOddPalin() {
        LinkedList<Character> theList = makeList("aba");
        Two_Seven theSeven = new Two_Seven(theList);
        Assert.assertTrue(theSeven.checkPalindrome());
    }

    @Test
    public void checkEvenNotPalin() {
        LinkedList<Character> theList = makeList("abbata");
        Two_Seven theSeven = new Two_Seven(theList);
        Assert.assertFalse(theSeven.checkPalindrome());
    }

    @Test
    public void checkOddNotPalin() {
        LinkedList<Character> theList = makeList("abbat");
        Two_Seven theSeven = new Two_Seven(theList);
        Assert.assertFalse(theSeven.checkPalindrome());
    }


    private LinkedList<Character> makeList(String s) {
        LinkedList<Character> theList = new LinkedList<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            theList.push(s.charAt(i));
        }

        return theList;
    }
}
