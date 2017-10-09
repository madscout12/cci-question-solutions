package arrays_and_strings_test;


import arrays_and_strings.One_Four;
import org.junit.Assert;
import org.junit.Test;

public class One_Four_Test {

    @Test
    public void checkNull() {
        One_Four theFour = new One_Four(null);
        theFour.replace();
        Assert.assertNull(theFour.getString());
    }

    @Test
    public void testStrings() {
        String one = "string with spaces";
        String result = "string%20with%20spaces";
        char[] theArray = new char[one.length() + 4];
        one.getChars(0, one.length(), theArray, 0);

        One_Four theFour = new One_Four(theArray);
        theFour.replace();
        Assert.assertEquals(theFour.getString(), result);

        String two = "nospaces";
        theArray = two.toCharArray();
        theFour = new One_Four(theArray);
        theFour.replace();
        Assert.assertEquals(theFour.getString(), two);


    }

}
