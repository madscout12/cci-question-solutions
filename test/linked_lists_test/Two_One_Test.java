package linked_lists_test;

import linked_lists.Two_One;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;

public class Two_One_Test {

    @Test
    public void handleNull() {

        Two_One theOne = new Two_One(null);
        theOne.removeDuplicates();
        Assert.assertTrue(theOne.toArray().equals(new ArrayList<>()));
    }

    @Test
    public void noDuplicates() {
        int[] list = {1, 2, 3, 4, 5};
        Two_One theOne = new Two_One(list);
        ArrayList<Integer> theList = toArrayList(list);
        theOne.removeDuplicates();
        Assert.assertTrue(equals(theOne.toArray(), theList));

    }

    @Test
    public void listOfNone() {
        int[] list = {};
        Two_One theOne = new Two_One(list);
        ArrayList<Integer> theList = toArrayList(list);
        theOne.removeDuplicates();
        Assert.assertTrue(equals(theOne.toArray(), theList));

    }

    @Test
    public void listOfOne() {
        int[] list = {1};
        Two_One theOne = new Two_One(list);
        ArrayList<Integer> theList = toArrayList(list);
        theOne.removeDuplicates();
        Assert.assertTrue(equals(theOne.toArray(), theList));

    }

    @Test
    public void duplicates() {
        int[] list = {1, 1, 2, 3, 5, 5};
        int[] stripped = {1, 2, 3, 5};
        Two_One theOne = new Two_One(list);
        ArrayList<Integer> theList = toArrayList(list);
        ArrayList<Integer> theStripped = toArrayList(stripped);

        theOne.removeDuplicates();

        Assert.assertFalse(equals(theOne.toArray(), theList));
        Assert.assertTrue(equals(theOne.toArray(), theStripped));
    }

    private ArrayList<Integer> toArrayList(int[] arr) {
        ArrayList<Integer> theList = new ArrayList<>();
        for (int i : arr) {
            theList.add(i);
        }
        return theList;
    }

    private boolean equals(ArrayList<Integer> one, ArrayList<Integer> two) {
        boolean toReturn = true;
        for (int data : one) {
            toReturn &= two.contains(data);
        }
        return toReturn && one.size() == two.size();
    }
}
