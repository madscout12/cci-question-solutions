/*
* 2.4 Write code to partition a linked list around a value x, such that all nodes
* less than x come before all nodes greater than or equal to x.
*/

package linked_lists;

import java.util.ArrayList;

public class Two_Four {

    private Node first;

    public Two_Four(int[] data) {
        first = null;
        if (data == null) return;
        for (int d : data) {
            Node temp = new Node(d);
            temp.next = first;
            first = temp;
        }
    }

    public void partition(int x) {
        if (first == null) return;
        Node greater = null;
        Node less = null;
        Node less_last = null;
        Node runner = first;
        Node temp;

        while (runner != null) {
            temp = runner;
            runner = runner.next;
            if (temp.data < x) {
                temp.next = less;
                less = temp;
                if (less.next == null) {
                    less_last = less;
                }
            } else {
                temp.next = greater;
                greater = temp;
            }
        }
        if (less_last != null) {
            less_last.next = greater;
            first = less;
        } else {
            first = greater;
        }
    }

    public ArrayList<Integer> getFour() {
        if (first == null) return null;

        ArrayList<Integer> toReturn = new ArrayList<>();
        Node temp = first;
        int i = 0;

        while (temp != null) {
            toReturn.add(i, temp.data);
            i++;
            temp = temp.next;
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
