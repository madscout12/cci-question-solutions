package linked_lists_test;

import linked_lists.Two_Five;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class Two_Five_Test {
    @Test
    public void checkNull() {
        Two_Five theFive = new Two_Five(null, null);
        theFive.sumReverse();
        Assert.assertNull(theFive.getSum());

        LinkedList<Integer> theList = new LinkedList<>();
        theList.push(5);

        theFive = new Two_Five(theList, null);
        theFive.sumReverse();
        Assert.assertNull(theFive.getSum());

        theFive = new Two_Five(null, theList);
        theFive.sumReverse();
        Assert.assertNull(theFive.getSum());

    }

    @Test
    public void bookExample() {

        LinkedList<Integer> x = new LinkedList<>();
        x.push(6);
        x.push(1);
        x.push(7);

        LinkedList<Integer> y = new LinkedList<>();
        y.push(2);
        y.push(9);
        y.push(5);

        Two_Five theFive = new Two_Five(x, y);
        theFive.sumReverse();

        LinkedList<Integer> theSum = new LinkedList<>();
        theSum.push(9);
        theSum.push(1);
        theSum.push(2);

        Assert.assertTrue(theFive.getSum().equals(theSum));

        theFive.sumReverse();
        Assert.assertTrue(theFive.getSum().equals(theSum));

    }

    @Test
    public void bookExampleTwo() {

        LinkedList<Integer> x = new LinkedList<>();
        x.push(7);
        x.push(1);
        x.push(6);

        LinkedList<Integer> y = new LinkedList<>();
        y.push(5);
        y.push(9);
        y.push(2);

        Two_Five theFive = new Two_Five(x, y);
        theFive.sumForward();

        LinkedList<Integer> theSum = new LinkedList<>();
        theSum.push(2);
        theSum.push(1);
        theSum.push(9);

        Assert.assertTrue(theFive.getSum().equals(theSum));

        theFive.sumForward();
        Assert.assertTrue(theFive.getSum().equals(theSum));

    }

    @Test
    public void unBalancedExample() {

        LinkedList<Integer> x = new LinkedList<>();
        x.push(1);
        x.push(2);

        LinkedList<Integer> y = new LinkedList<>();
        y.push(3);
        y.push(3);
        y.push(9);
        y.push(7);

        Two_Five theFive = new Two_Five(x, y);


        LinkedList<Integer> theSum = new LinkedList<>();
        theSum.push(3);
        theSum.push(4);
        theSum.push(0);
        theSum.push(9);

        theFive.sumReverse();
        Assert.assertTrue(theFive.getSum().equals(theSum));

        theFive.sumReverse();
        Assert.assertTrue(theFive.getSum().equals(theSum));

        theSum = new LinkedList<>();
        theSum.push(4);
        theSum.push(5);
        theSum.push(9);
        theSum.push(7);

        theFive.sumForward();
        Assert.assertTrue(theFive.getSum().equals(theSum));

        theFive.sumForward();
        Assert.assertTrue(theFive.getSum().equals(theSum));


    }


}
