package linked_lists_test;

import linked_lists.Two_Four;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;

public class Two_Four_Test {
    @Test
    public void checkNull() {
        Two_Four theFour = new Two_Four(null);
        theFour.partition(0);
        Assert.assertNull(theFour.getFour());

    }

    @Test
    public void checkData() {
        int[] arr = {0, 22, 93, 16, 44, 160};
        int part = 17;
        int count = 2;
        Two_Four theFour = new Two_Four(arr);
        theFour.partition(part);
        ArrayList<Integer> expected = theFour.getFour();

        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                Assert.assertTrue(expected.get(i) < part);
            } else {
                Assert.assertTrue(expected.get(i) >= part);
            }
        }

    }

    @Test
    public void checkLongData() {
        int[] arr = {0, 22, 93, 16, 44, 160, 7, 19, 3, 2, 1, 4};
        int part = 22;
        int count = 8;
        Two_Four theFour = new Two_Four(arr);
        theFour.partition(part);
        ArrayList<Integer> expected = theFour.getFour();

        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                Assert.assertTrue(expected.get(i) < part);
            } else {
                Assert.assertTrue(expected.get(i) >= part);
            }
        }

    }

    @Test
    public void checkDataNoGreater() {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 2};
        int part = 24;
        int count = arr.length;
        Two_Four theFour = new Two_Four(arr);
        theFour.partition(part);
        ArrayList<Integer> expected = theFour.getFour();

        for (int i = 0; i < arr.length; i++) {
            Assert.assertTrue(expected.get(i) < part);
        }

    }

    @Test
    public void checkDataNoLess() {
        int[] arr = {333, 316, 544, 1160, 1065, 1522};
        int part = 123;
        Two_Four theFour = new Two_Four(arr);
        theFour.partition(part);
        ArrayList<Integer> expected = theFour.getFour();

        for (int i = 0; i < arr.length; i++) {
            Assert.assertTrue(expected.get(i) >= part);
        }

    }
}
