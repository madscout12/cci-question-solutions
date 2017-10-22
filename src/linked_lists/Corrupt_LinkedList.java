package linked_lists;

public class Corrupt_LinkedList {
    private Node first;

    public Corrupt_LinkedList(String data, int index) {
        if (data == null || data.length() <= index || index < 0) first = null;
        else {
            setupList(data, index);
        }

    }

    private void setupList(String data, int index) {
        first = new Node(data.charAt(0));
        Node runner = first;
        Node loopBack = 0 == index ? first : null;

        for (int i = 1; i < data.length(); i++) {
            runner.next = new Node(data.charAt(i));
            runner = runner.next;
            if (i == index) loopBack = runner;
        }

        runner.next = loopBack;
    }

    Node getFirst() {
        return first;
    }

    Node getNext(Node node) {
        return node.next;
    }


    public class Node {
        private Node next;
        private char data;

        private Node(char data) {
            this.data = data;
            next = null;
        }

        public char getData() {
            return data;
        }
    }
}
