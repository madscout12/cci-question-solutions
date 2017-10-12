package linked_lists_test;

import linked_lists.Two_Three;
import org.junit.Assert;
import org.junit.Test;

public class Two_Three_Test {
    @Test
    public void checkNull() {
        Two_Three theThree = new Two_Three(null);
        Assert.assertNull(theThree.toString());
        Assert.assertNull(theThree.getNode(0));
        Assert.assertNull(theThree.getNode(1));
    }

    @Test
    public void checkBook() {
        Two_Three theThree = new Two_Three("abcde");
        Two_Three.Node node = theThree.getNode(2);
        node.delete();
        Assert.assertEquals("abde", theThree.toString());
    }

    @Test
    public void checkLong() {
        Two_Three theThree = new Two_Three("somerandomlongstring");
        Two_Three.Node node = theThree.getNode(5);
        node.delete();
        Assert.assertEquals("somerndomlongstring", theThree.toString());
    }

}
