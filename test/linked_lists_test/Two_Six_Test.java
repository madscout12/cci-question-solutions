package linked_lists_test;

import linked_lists.Corrupt_LinkedList;
import linked_lists.Two_Six;
import org.junit.Assert;
import org.junit.Test;

public class Two_Six_Test {

    @Test
    public void checkNull() {
        Corrupt_LinkedList nullList = new Corrupt_LinkedList(null, 0);
        Corrupt_LinkedList badIndex = new Corrupt_LinkedList("string", 7);
        Corrupt_LinkedList lowIndex = new Corrupt_LinkedList("string", -2);


        Two_Six theSix = new Two_Six(nullList);
        Assert.assertEquals(theSix.findLoop(), null);

        theSix = new Two_Six(badIndex);
        Assert.assertEquals(theSix.findLoop(), null);

        theSix = new Two_Six(lowIndex);
        Assert.assertEquals(theSix.findLoop(), null);

    }

    @Test
    public void bookExample() {

        Corrupt_LinkedList theList = new Corrupt_LinkedList("ABCDE", 2);
        Two_Six theSix = new Two_Six(theList);
        Assert.assertEquals('C', theSix.findLoop().getData());

    }
}
