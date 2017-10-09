/*
* 2.2 Implement an algorithm to find the kth to last element
* of a singly linked list.
*/

package linked_lists;

import java.util.ArrayList;

public class Two_Two {
    private Node first;

    public Two_Two(ArrayList<Integer> list) {
        first = null;
        if (list == null) return;
        for (int i : list) {
            insertLast(new Node(i));
        }
    }

    public int findKth(int k) {
        if (first == null) return -1;
        Node found = new Node(-k);
        found = recurseFind(first, found);
        if (found.data > 0) return found.data;
        return -1;

    }

    private Node recurseFind(Node curr, Node found) {
        if (curr.next == null) {
            if (found.data == 0) return curr;
            found.data++;
            return found;
        } else {
            Node temp = recurseFind(curr.next, found);
            if (temp.data < 0) {
                temp.data++;
                return temp;
            } else if (temp.data == 0) {
                return curr;
            } else {

                return temp;
            }

        }

    }


    private void insertLast(Node n) {
        if (first == null) {
            first = n;
            return;
        }
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
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
