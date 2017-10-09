package linked_lists_test;

import linked_lists.Two_Two;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Two_Two_Test {

    @Test
    public void checkNull() {
        Two_Two theTwo = new Two_Two(null);
        Assert.assertEquals(theTwo.findKth(100), -1);

    }

    @Test
    public void checkEmpty() {
        Two_Two theTwo = new Two_Two(new ArrayList<>());
        Assert.assertEquals(theTwo.findKth(0), -1);
    }

    @Test
    public void checkOne() {
        ArrayList<Integer> theList = new ArrayList<>();
        theList.add(1);
        Two_Two theTwo = new Two_Two(theList);
        Assert.assertEquals(-1, theTwo.findKth(1));
        Assert.assertEquals(1, theTwo.findKth(0));
    }

    @Test
    public void checkSeveral() {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayList<Integer> theList = new ArrayList<>();
        for (int i : list) {
            theList.add(i);
        }
        Two_Two theTwo = new Two_Two(theList);
        Assert.assertEquals(12, theTwo.findKth(0));
        Assert.assertEquals(10, theTwo.findKth(2));
        Assert.assertEquals(-1, theTwo.findKth(13));
    }


}
