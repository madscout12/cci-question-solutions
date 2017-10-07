package Arrays_Strings;

import arrays_and_strings.One_Eight;
import org.junit.Assert;
import org.junit.Test;

public class One_Eight_Test {

    @Test
    public void checkNull() {
        One_Eight theEight = new One_Eight(null);
        Assert.assertFalse(theEight.isRotation(null));
        Assert.assertFalse(theEight.isRotation(""));
        Assert.assertFalse(theEight.isRotation("a string"));
    }

    @Test
    public void bookExample() {
        One_Eight theEight = new One_Eight("waterbottle");
        String rotation = "erbottlewat";
        Assert.assertTrue(theEight.isRotation(rotation));
    }

    @Test
    public void wrapAround() {
        String string = "waterbottle";
        One_Eight theEight = new One_Eight(string);
        String wraper = string + string;
        for (int i = 0; i < string.length(); i++) {
            Assert.assertTrue("Failded at index: " + i,
                    theEight.isRotation(wraper.substring(i, i + string.length())));
        }

    }

    @Test
    public void noWrapAround() {
        String string = "banana";
        String not1 = "apple";
        String not2 = "bananar";
        String not3 = "ana";

        One_Eight theEight = new One_Eight(string);
        Assert.assertFalse(theEight.isRotation(not1));
        Assert.assertFalse(theEight.isRotation(not2));
        Assert.assertFalse(theEight.isRotation(not3));
    }
}
