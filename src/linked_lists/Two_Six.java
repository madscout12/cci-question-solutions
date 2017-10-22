/*
* 2.6 Given a circular linked list, implement an algorithm which returns the node
* at the beginning of the loop.
*/

package linked_lists;

import java.util.HashSet;

public class Two_Six {
    private Corrupt_LinkedList theList;

    public Two_Six(Corrupt_LinkedList theList) {
        this.theList = theList;
    }

    public Corrupt_LinkedList.Node findLoop() {
        if (theList == null) return null;

        HashSet<Corrupt_LinkedList.Node> theSet = new HashSet<>();

        Corrupt_LinkedList.Node curr = theList.getFirst();

        while (curr != null && !theSet.contains(curr)) {
            theSet.add(curr);
            curr = theList.getNext(curr);
        }

        return curr;
    }


}
