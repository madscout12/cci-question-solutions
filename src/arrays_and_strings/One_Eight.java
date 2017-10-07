package arrays_and_strings;

public class One_Eight {
    private String theString;

    public One_Eight(String str) {
        theString = str + str;
        if (str == null) theString = null;
    }

    public boolean isRotation(String rotate) {
        return theString != null && rotate != null && theString.contains(rotate);
    }
}
