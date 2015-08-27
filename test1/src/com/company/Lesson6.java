package com.company;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by md212 on 04.08.15.
 */
public class Lesson6 {
    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<Integer>(); // creation of empty list/array
        System.out.println(a.size()); //0  - result 0 because the list is empty. Shows quantity of elements in the list
        a.add(10); // adding element to the list
        System.out.println(a.size()); //1 - result 1 because we already have one element in the list
        a.add(1);
        a.add(5);
        System.out.println(a.get(1));//1 - getting of element from the the list with index 1
        System.out.println(a.get(2));//5
        a.remove(0);                  // removing of the first (0,1,2,3...) value in the list by means of pointing index
        System.out.println(a.size()); //2 - as one element has been removed, the rest is 2 elements.

        Integer[] a1 = {1, 2, 10, 20};
        a.addAll(Arrays.asList(a1)); // - adding array to the list
        System.out.println(a);


        //// _____________________________________________ HOMEWORK _____________________________________________ ////
        // 1.
        ArrayList<String> s = new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        Print(s);


        // 2.
        ArrayList<String> f = new ArrayList<>();
        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");// result - true
        f.add("d");// result - false
        s.add("b");// result - false
        System.out.println(isListsEqual(s, f));

        // 3.
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("I");
        s1.add("am");
        s1.add("learning");
        s1.add("Java");
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("I");
        s2.add("am");
        s2.add("learning");
        s2.add("Java");
        System.out.println(isListsEqual(s1, s2)); // result - true

        // 4.
        String[] b = {"a", "b", "c"};
        System.out.println("Excercise 4: " + print(b)); // result - abcdb

        // 5.
        System.out.println(isEqual(b, s)); // result - true

        // 6.
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("good");
        l1.add("good");
        l1.add("good");
        l1.add("weather");
        print(l1);


        // 7.

        String[] a11 = {"big", "red", "cat"};
        print2(a11);

        // 8.
        sayHello(); // Hello Class!

        // 9.
        System.out.println(hello()); // Hello Engineers!

        // 10.
        System.out.println(hello("Friends")); // Hello Friends

        // 11. ??
        System.out.println(hello("Friends").equals(hello("Friends"))); // true

        // 12.??
        System.out.println(hello("Friends") == hello("Friends")); // false

        // 13.
        test("Hello Enginers!", hello());
        // Test PASSED.

    }

    // 13.
    private static void test(String s, String method) {
        if (s.equals(method)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.out.println("Expected: " + method);
            System.out.println("Actual: " + s);
        }
    }


    // 10.
    private static String hello(String friends) {
        return "Hello " + friends;
    }

    // 9.
    private static String hello() {
        return "Hello Engineers!";
    }

    // 8.
    private static void sayHello() {
        System.out.println("Hello Class");
    }

    // 7.
    public static void print2(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1)
                System.out.print(" ");
            // Тут дописать тело функции.
        }
        System.out.println("");
        // Тут дописать недостающие функции.
    }

    // 6.
    public static void print(ArrayList<String> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
            if (i < l.size() - 1)
                System.out.print(" ");
        }
        System.out.println("!");
        // Тут дописать тело функции.
    }


    // 5.
    private static boolean isEqual(String[] a1, ArrayList<String> s1) {
        if (a1.length != s1.size())
            return false;
        for (int i = 0; i < a1.length; i++) {
            String g = a1[i];
            String g2 = s1.get(i);
            if (!g.equals(g2))
                return false;
        }
        return true;
    }

    // 4.

    public static String print(String[] b1) {
        String k = "";
        for (String i : b1) {
            k = k + i;
        }
        return k;
    }

    // 2 - 3.
    public static boolean isListsEqual(ArrayList<String> R1, ArrayList<String> R2) {
        return R1.equals(R2);

    }

    // 1.
    public static String Print(ArrayList<String> R) {
//        String g = R.get(0) + "\n" + R.get(1) + "\n" + R.get(2) + "\n" + R.get(3);
        String g = "";
        for (int i = 0; i < R.size(); i++)
            g += R.get(i);
        System.out.println(g);
        return g;
    }


}
