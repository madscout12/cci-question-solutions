package arrays_and_strings_test;

import arrays_and_strings.One_Three;
import org.junit.Assert;
import org.junit.Test;

public class One_Three_Test {

    @Test
    public void checkNull() {
        String notNull = "Not Null";

        One_Three one = new One_Three(null);
        Assert.assertFalse(one.isPermutation(notNull));

        one = new One_Three(notNull);
        Assert.assertFalse(one.isPermutation(null));

        one = new One_Three(null);
        Assert.assertFalse(one.isPermutation(null));
    }

    @Test
    public void isAPermutation() {
        String orig = "permutation";
        String perm = "prmttneuaio";

        One_Three one = new One_Three(orig);
        Assert.assertTrue(one.isPermutation(perm));

    }

    @Test
    public void isNotAPermutation() {
        String orig = "permutation";
        String perm = "prmttneuai";

        One_Three one = new One_Three(orig);
        Assert.assertFalse(one.isPermutation(perm));

        perm = "pprmttneuai";

        one = new One_Three(orig);
        Assert.assertFalse(one.isPermutation(perm));

    }

}



