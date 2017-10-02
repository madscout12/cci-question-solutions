//TODO: Add test showing execution time for a non-trivial string of characters.

package Arrays_Strings;

import arrays_and_strings.One_One;
import org.junit.Assert;
import org.junit.Test;

public class One_One_Test {

    @Test
    public void checkNull() {
        One_One one = new One_One(null);
        Assert.assertTrue("One_One in Arrays_Strings does not handle Null as desired", one.hasNoDuplicates());
        Assert.assertTrue("One_One in Arrays_Strings does not handle Null as desired", one.hasNoDuplicatesEff());

    }

    @Test
    public void checkDuplicate() {
        One_One one = new One_One("This String has duplicates.");
        Assert.assertFalse("Returned False Incorrectly", one.hasNoDuplicates());
        Assert.assertFalse("Returned False Incorrectly", one.hasNoDuplicatesEff());
    }

    @Test
    public void checkNoDuplicate() {
        One_One one = new One_One("No Dups");
        Assert.assertTrue("Returned True Incorrectly", one.hasNoDuplicates());
        Assert.assertTrue("Returned True Incorrectly", one.hasNoDuplicatesEff());
    }

}
