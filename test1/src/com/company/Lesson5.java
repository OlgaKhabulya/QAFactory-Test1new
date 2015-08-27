package com.company;

/**
 * Created by md212 on 31.07.15.
 */
public class Lesson5 {

    public static int f() {
        return 1000;
    }

    // 1.
    public static int MultipliedDigit(int Digit) {

        return Digit * Digit;
    }

    // 2.
    public static String LineAndDigit(int r, String l) {
        String l2 = "";
        for (int i = 0; i < r; i++) {
            l2 = l2 + l + "\n";
        }
        return l2;
    }

    public static String LineAndDigit2(int r, String l) {
        String l2 = "";
        while (r-- > 0) {
            l2 += l + "\n";
        }
        return l2;
    }

    public static String LineAndDigit3(int r, String l) {
        StringBuilder l2 = new StringBuilder();
        while (r-- > 0) {
            l2.append(l).append("\n");
        }
        return l2.toString();
    }

    // 3.
    public static boolean MatchingInArrays(int[] Ar1, int[] Ar2) {
        for (int w = 0; w < Ar1.length; w++) {
            if (Ar1[w] != Ar2[w]) {
                return false;
            }
        }
        return true;
    }

    //    4.
    public static boolean EqualityOfArrays(int[] Ar3, int[] Ar4) {
        if (Ar3 == Ar4) {
            return true; // checking length of arrays
        }

        for (int w = 0; w < Ar3.length; w++) {
            if (Ar3[w] != Ar4[w]) {
                return false;
            }
        }
        return true; // checking equality of arrays. If Array3 matches Array4

    }


    public static void main(String[] args) {
// 1. Функци принимает число, в результате вьідает єто число умноженное на себя.
        int d1 = 7;
        int ResultOfMultiplication = MultipliedDigit(d1);
        System.out.println(ResultOfMultiplication);

// 2. Функция принимает число и строку, в результате вьідает эту строку повторенную число раз.
        int digit = 5;
        String line = "Hello World";
        String Result = LineAndDigit3(digit, line);
        System.out.println(Result);

// 3. Принимает 2 массива, в результате вьдает совпадают ли у них все значения (true/false).
        int[] Array1 = {1, 2, 3, 5, 4, 7, 6, 9, 8};
        int[] Array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean ResultOfMatching = MatchingInArrays(Array1, Array2);
        System.out.println(ResultOfMatching);

        int[] Array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] Array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean ResultOfMatching2 = MatchingInArrays(Array3, Array4);
        System.out.println(ResultOfMatching2);


// 4.  функция принимает 2 массива любой длинньі, и вьідает в результате одинаковьіе ли все их значения.

        int[] Array5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] Array6 = {1, 20, 30, 4, 50, 60, 7, 80, 90};
        boolean ResultOfEquality = EqualityOfArrays(Array5, Array6);
        System.out.println(ResultOfEquality);


        int i = 1000;
        System.out.println(i);

        int x = f();
        System.out.println(x);


        int[] notstrings = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int target1 = 1;
        int y = TargetsInArray(notstrings, target1);
        System.out.println(y);

        int[] notstrings2 = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int target2 = 6;
        y = TargetsInArray(notstrings2, target2);
        System.out.println(y);

        int[] notstrings3 = {1, 7, 1, 4, 1, 7, 9, 6, 13, 1, 7};
        int target3 = 7;
        y = TargetsInArray(notstrings3, target3);
        System.out.println(y);

        // diff21
        int n1 = 19;
        int y9 = diff21(n1);
        System.out.println(y9);

        //talking parrot
        boolean parrot = false;
        int hours = 8;
        boolean y8 = parrotTrouble(parrot, hours);
        System.out.println(y8);

    }
// talking parrot

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 7 && talking == true || hour > 20 && talking == true)

        {
            return true;
        }
        return false;
    }


    // diff 21
    public static int diff21(int n) {
        int nDiff = Math.abs(n - 21);

        if (n > 21) {
            nDiff = nDiff * 2;
        } else if (n < 21) {
            return nDiff;
        }

        return nDiff;
    }

    public static int TargetsInArray(int[] ns, int t) {
        int count = 0;
        for (int i1 = 0; i1 < ns.length; i1++) {
            if (ns[i1] == t)
                count++;
        }

        return count;
    }
}


