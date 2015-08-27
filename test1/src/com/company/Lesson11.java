package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by md212 on 25.08.15.
 */
public class Lesson11 {
    @Test
    public void test () {
        Assert.assertEquals(12, 5 + 5);

    }
    @Test
    public void test1 () {
      Assert.assertEquals(25, sumAll(new int[]{1, 2, 3, 2, 2}));
    }

    @Test
    public void test2 () {
        Assert.assertEquals(40, sumAll(new int[] {10, 20, 5, 4}));
    }

    @Test
    public void test3 () {
        Assert.assertEquals(40, sumAll(new int[] {10, 20, 5, 5}));
    }

    @Test
    public void test4() {
        Assert.assertEquals(45, sumAll(new int[] {10, 10, 5, 5, 6, 4, 5}));
    }
    @Test
    public void test5() {
        Assert.assertEquals(60, sumAll(new int[] {30, 30}));
    }

    @Test
    public void test6() {
        Assert.assertEquals(25, sumAll(new int[] {5, 5, 5, 5, 3, 2}));
    }

    @Test
    public void test7() {
        Assert.assertEquals(10, sumAll(new int[] {2, 2, 2, 4}));
    }

    @Test
    public void test8() {
        Assert.assertEquals(100, sumAll(new int[] {10, 10, 10, 10, 5, 5, 25, 25}));
    }

    @Test
    public void test9() {
        Assert.assertEquals(34, sumAll(new int[] {10, 2 * 5, 5, 5, 4}));
    }

    @Test
    public void test10() {
        Assert.assertEquals(5, sumAll(new int[] {1, 1, 1 + 2}));
    }



    public static int sumAll(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i ++)
        sum = sum + ints[i];
        return sum ++;
    }

    // _______________________________________________________________________________________________________________
    @Test
    public void lotsOfTests() {
        Assert.assertEquals("Hello Engineers!", hello());
        // Test PASSED.
        Assert.assertEquals("Hello Friends", hello("Friends"));
        // Test PASSED.
        Assert.assertEquals("Hello Good Men", hello("Good Men"));
        // Test PASSED.
        Assert.assertEquals("Hello to all 14 students!", hello(14));
        // Test PASSED.
        Assert.assertEquals("Hello student!", hello(1));
        // Test PASSED.
        Assert.assertEquals("No one came.", hello(0));
        // Test PASSED.
        Assert.assertEquals("Hello to all 25 persons!", hello(25, "persons"));
        // Test PASSED.
        Assert.assertEquals("Hello to all 99 programmers!", hello(99, "programmers"));
        // Test PASSED.
        Assert.assertEquals("Hello Jean Podmore Oleksiia !", hello(new String[]{"Jean", "Podmore", "Oleksiia"}));
        // Test PASSED.
        Assert.assertEquals("Hello Anonymous Anonymous2 !", hello(new String[]{"Anonymous", "Anonymous2"}));
        // Test PASSED.
        Assert.assertEquals("Hello Slughorn, Norris, Fred and George!", hello(Arrays.asList("Slughorn", "Norris", "Fred", "George")));
        // Test PASSED.
        Assert.assertEquals("Hello Horace, Miss and Weasley's!", hello(Arrays.asList("Horace", "Miss", "Weasley's")));
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(1, 4, 3), Arrays.asList(1, 4, 3));
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(6), stringsLength(Arrays.asList("Jordan")));
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(5, 3, 8), stringsLength(Arrays.asList("Harry", "Ron", "Hermione")));
        // Test PASSED.
        Assert.assertEquals("[5, 5]", stringsLength(Arrays.asList("Jinny", "Lupin")).toString());
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(3, 6, 1, -60), reverseInts(Arrays.asList(-60, 1, 6, 3)));
        // Test PASSED.
    }


    public static String hello() {
        return "Hello Engineers!";
    }

    public static String hello(String who) {
        return "Hello " + who;
    }

    public static String hello(int howMany) {
        if (howMany == 1) {
            return "Hello student!";
        }
        if (howMany <= 0) {
            return "No one came.";
        }
        return "Hello to all " + howMany + " students!";
    }

    public static String hello(int howMany, String whom) {
        return "Hello to all " + howMany + " " + whom + "!";
    }

    public static String hello(String[] who) {
        String res = "Hello ";
        for (String name : who) {
            res += name + " ";
        }
        return res + "!";
    }

    public static String hello(List<String> who) {
        String res = "Hello ";
        for (int i = 0; i < who.size(); i++) {
            if (i == who.size() - 2) {
                res += who.get(i) + " and " + who.get(i + 1) + "!";
                break;
            }
            res += who.get(i) + ", ";
        }
        return res;
    }

    public static List<Integer> stringsLength(List<String> strings) {
        ArrayList<Integer> res = new ArrayList<>();
        for (String s : strings) {
            res.add(s.length());
        }
        return res;
    }

    public static List<Integer> reverseInts(List<Integer> ints) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = ints.size() - 1; i >= 0; i--) {
            res.add(ints.get(i));
        }
        return res;
    }

    public static List<String> reverse(List<String> strings) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = strings.size() - 1; i >= 0; i--) {
            res.add(strings.get(i));
        }
        return res;
    }

    public static void prettyPrint(List<String> strings, boolean normal) {
        int spaces = 0;
        if (!normal) {
            spaces = strings.size() - 1;
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(multi(" ", spaces) + strings.get(i));
            if (normal) {
                spaces++;
            } else {
                spaces--;
            }
        }
    }

    public static String multi(String s, int times) {
        String res = "";
        for (int i = 0; i < times; i++) {
            res += s;
        }
        return res;
    }
}
