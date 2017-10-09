/*
* 2.1 Write code to remove duplicates from an unsorted linked list
*  FOLLOW UP
*  How would you solve this problem if a temporary buffer is not allowed?
*/

package linked_lists;

import java.util.ArrayList;

public class Two_One {
    private Node first;

    public Two_One(int[] list) {
        Node temp;
        first = null;
        if (list == null) return;
        for (Integer i : list) {
            temp = new Node(i);
            temp.next = first;
            first = temp;
        }

    }

    public void removeDuplicates() {
        if (first == null) return;
        Node curr = first;
        Node runner = first.next;
        Node prev = first;

        while (curr != null) {
            while (runner != null) {
                if (runner.data == curr.data) {
                    prev.next = runner.next;
                    runner = runner.next;
                }
                if (runner != null) {
                    prev = runner;
                    runner = runner.next;
                }

            }

            curr = curr.next;
            if (curr != null) {
                runner = curr.next;
            }
            prev = curr;
        }
    }

    public ArrayList<Integer> toArray() {
        ArrayList<Integer> toReturn = new ArrayList<>();
        Node curr = first;
        while (curr != null) {
            toReturn.add(curr.data);
            curr = curr.next;
        }
        return toReturn;
    }


    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
            next = null;
        }
    }

}
