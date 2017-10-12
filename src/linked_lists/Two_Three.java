/*
* 2.3 Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
* EXAMPLE: Input: the node c from a -> b -> c -> d -> e
*  Result: nothing is returned, but the new linked list looks like a-> b-> d -> e
*/

package linked_lists;

public class Two_Three {

    private Node first;

    public Two_Three(String data) {
        if (data == null) {
            first = null;
        } else {
            for (int i = data.length() - 1; i >= 0; i--) {
                Node temp = new Node(data.charAt(i));
                temp.next = first;
                first = temp;
            }
        }
    }

    public String toString() {
        if (first == null) return null;

        StringBuilder toReturn = new StringBuilder();
        Node temp = first;

        while (temp != null) {
            toReturn.append(temp.data);
            temp = temp.next;
        }

        return toReturn.toString();
    }


    public Node getNode(int i) {
        if (first == null) return null;

        Node temp = first;
        int j = 0;

        while (j < i && temp != null) {
            temp = temp.next;
            j++;
        }
        return temp;
    }


    public class Node {
        private char data;
        private Node next;

        private Node(char data) {
            this.data = data;
            next = null;
        }

        public char getData() {
            return data;
        }

        public void delete() {
            Node temp = this;
            while (temp.next.next != null) {
                temp.data = temp.next.data;
                temp = temp.next;
            }
            temp.data = temp.next.data;
            temp.next = null;
        }
    }
}
