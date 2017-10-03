/*
* 1.5 Implement a method to perform basic string compression using the counts
* of repeated characters. For example, the string aabcccccaaa would become
* a2b1c5a3. If the "compressed" string  would not become smaller than the original
* string.
*/

package arrays_and_strings;

public class One_Five {

    private String theString;

    public One_Five(String theString) {
        this.theString = theString;
        if (this.theString != null) {
            process();
        }
    }

    public String getTheString() {
        return theString;
    }

    private void process() {
        StringBuilder compressedString = new StringBuilder();
        char curr = theString.charAt(0);
        compressedString.append(curr);
        int i = 1;
        int count = 1;

        while (i < theString.length()) {
            if (curr == theString.charAt(i)) {
                count++;
            } else {
                if (count > 1) {
                    compressedString.append(count);
                    count = 1;
                }

                curr = theString.charAt(i);
                compressedString.append(curr);
            }
            i++;
        }

        theString = compressedString.toString();

    }

}
