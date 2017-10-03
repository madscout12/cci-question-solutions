package Arrays_Strings;

import arrays_and_strings.One_Five;
import org.junit.Assert;
import org.junit.Test;

public class One_Five_Test {

    @Test
    public void checkNull() {
        One_Five theFive = new One_Five(null);
        Assert.assertNull(theFive.getTheString());
    }

    @Test
    public void repeatString() {
        String repeat = "aaabcccddFFFFg";
        String expected = "a3bc3d2F4g";
        One_Five theFive = new One_Five(repeat);
        Assert.assertEquals(theFive.getTheString(), expected);
    }

    @Test
    public void noRepeatString() {
        String noRepeat = "abcFDS";
        One_Five theFive = new One_Five(noRepeat);
        Assert.assertEquals(theFive.getTheString(), noRepeat);
    }

}
