/*
* 2.5 You have two numbers represented by a linked list, where each node contains
* a single digit. The digits are stored in reverse order, such that the 1's digit is
* at the head of the list. Write a function that adds the two numbers and returns the sum
* as a linked list. Suppose the digits are stored in forward order. Repeat the above problem.
*/

package linked_lists;

import java.util.LinkedList;

public class Two_Five {
    private LinkedList<Integer> theSum;
    private LinkedList<Integer> x;
    private LinkedList<Integer> y;

    public Two_Five(LinkedList<Integer> x, LinkedList<Integer> y) {
        this.x = x;
        this.y = y;
        theSum = null;
    }

    public void sumReverse() {
        if (x == null || y == null) return;
        theSum = new LinkedList<>();
        LinkedList<Integer> temp_x = new LinkedList<>();
        LinkedList<Integer> temp_y = new LinkedList<>();

        int sum;
        int local_x = 0;
        int local_y = 0;
        int tens = 1;

        while (!x.isEmpty() || !y.isEmpty()) {
            if (!x.isEmpty()) {
                local_x = local_x + x.peek() * tens;
                temp_x.addLast(x.pop());
            }
            if (!y.isEmpty()) {
                local_y = local_y + y.peek() * tens;
                temp_y.addLast(y.pop());
            }
            tens *= 10;
        }
        x = temp_x;
        y = temp_y;
        sum = local_x + local_y;

        while (tens > 1) {
            tens /= 10;
            theSum.push(sum / tens);
            sum %= tens;
        }

    }

    public void sumForward() {
        if (x == null || y == null) return;
        theSum = new LinkedList<>();
        LinkedList<Integer> temp_x = new LinkedList<>();
        LinkedList<Integer> temp_y = new LinkedList<>();

        int sum;
        int local_x = 0;
        int local_y = 0;


        while (!x.isEmpty() || !y.isEmpty()) {
            if (!x.isEmpty()) {
                local_x = local_x * 10 + x.peek();
                temp_x.addLast(x.pop());
            }
            if (!y.isEmpty()) {
                local_y = local_y * 10 + y.peek();
                temp_y.addLast(y.pop());
            }

        }

        x = temp_x;
        y = temp_y;
        sum = local_x + local_y;

        while (sum > 0) {
            theSum.push(sum % 10);
            sum /= 10;
        }


    }


    public LinkedList<Integer> getSum() {
        return theSum;
    }
}
