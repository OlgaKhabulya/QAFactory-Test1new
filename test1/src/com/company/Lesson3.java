package com.company;

/**
 * Created by md212 on 22.07.15.
 */
public class Lesson3 {
    public static void main(String[] args) {

//        int a = 10;
//        if (a < 10) {
//            System.out.println("a<10");
//        } else {
//            System.out.println("a>=10");
//        }
//
//        int xy = 0;
//        while (xy < 10) {
//            xy += 5;
//            xy -= 4;
//            System.out.println("xy=" + xy);
//        }
//        System.out.println("finish");
//
//        int yz = 0; // individual work at classroom
//        while (yz < 1000) {
//            yz += 2;
//            System.out.println("yz=" + yz);
//        }
//
//        System.out.println("finish");
//
//
//        int xz = 0;
//        int x1 = 1;
//        int x2 = x1 + xz;
//        int x3 = x2 + x1;
//
//        int[] aa = new int[100];
//        aa[0] = 0;
//        aa[1] = 1;
//        aa[2] = aa[1] + aa[0];
//        aa[3] = aa[2] + aa[1];
//        aa[4] = aa[3] + aa[2];
//
//        int i = 2;
//        while (i < 100) {
//            aa[i] = aa[i - 1] + aa[i - 2];
//            i = i + 1;
//        }
//        System.out.println("aa" + aa);

//
//        for (int h = 0; h < 1000; h += 1) {
//            System.out.println("Hell Class! Hell Class!" );
//
//        }
//
//        for (int v = 0; v <= 1000; v = v+1) {
//            if (v % 4 == 0)
//                continue;
//            System.out.println (v);
//    }


//        HOMEWORK

        String t = "Hello Class";
        String ts = ", and Student!";

        System.out.println(t + ts);

        String[] u = {"zero", "one", "under key one but three", "three", "four", "Under key five"};
        System.out.println(u[5]);
        System.out.println(u[3 - 1]);


        String[] s = {"How", "are", "you?"};
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }

        int[] m = {10, 20, 25, 30};
        int i = 0;
        int b = 25;
        while (i < 4) {
            if (m[i] == b)
                break;
            System.out.println(m[i]);
            i++;
        }

        int r = 1;
        while (r < 5) {
            System.out.println(r++ + " ");
        }

        int[] p = {10, 20, 25, 30};
        int q = 0;
        int w = 10;
        while (q < 4) {
            if (p[q] == w) {
                q++;
                continue;
            }
            System.out.println(p[q]);
            q++;
        }

        for (int s1 = 10; s1 > -11; s1--) {
            System.out.print(s1 + " ");
        }

        for (int x = 8; x < 11; x++) {
            System.out.print(x);
        }

        for (int s2 = 1; s2 <= 33; s2 = s2 + 2) {
            System.out.println(s2 + " ");
        }

        int sum = 0; // Сюда будем накапливать результат
        for (int j = 2; j <= 100; j = j + 2) {
            sum = sum + j;
        }
        System.out.println(sum);


        for (int x4 = 1000; x4 < 10000; x4 = x4 + 3) {
            System.out.println(x4 + " ");
        }

        int a7 = 10;
        int b7 = -8;
        int c = b7 + a7;
        System.out.println(c);

        // _________________________________________


        int g = -2;
        int sec = 18;
        int x = g * sec;
        System.out.println(x);

        int g1 = 0;
        int sec1 = -1000;
        int x1 = g1 * sec1;
        System.out.println(x1);

        int g2 = 113;
        int sec2 = 1;
        int x2 = g2 * sec2;
        System.out.println(x2);


        // _________________________________________

        boolean oper = true;
        int a2 = 10;
        int b2 = -8;

        //int c = oper ? expr1: expr2;
        int c2;
        if (oper) c2 = a2 + b2;
        else c2 = a2 - b2;
        System.out.println(c2); //2

        boolean oper1 = false;
        int a3 = 3;
        int b3 = 2;
        int c3;
        if (oper1) c3 = a2 + b2;
        else c3 = a3 - b3;
        System.out.println(c3); //1

        boolean oper2 = false;
        int a4 = 0;
        int b4 = -200;
        int c4;
        if (oper2) c4 = a4 + b4;
        else c4 = a4 - b4;
        System.out.println(c4); //200

        boolean oper4 = true;
        int a5 = 999;
        int b5 = 1;
        int c5;
        if (oper4) c5 = a5 + b5;
        else c5 = a5 - b5;
        System.out.println(c5); //1000

        // _________________________________________
        //        int xxxx = 8||4; // 01000 | 00100 = 01100 = 12

        boolean anti = true; // false
        anti = !anti;
        System.out.println(anti);


        boolean anti1 = false; // true
        anti = !anti;
        System.out.println(anti);

        // _________________________________________

        String[] strings = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
        int w1 = 1;
        int w2 = 3;
// Hello Class

        System.out.println(strings[w1 - 1] + " " + strings[w2 - 1]);

        String[] strings2 = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
        int w3 = 1;
        int w4 = 6;
// Hello Everyone
        System.out.println(strings2[w3 - 1] + " " + strings[w4 - 1]);


        String[] strings4 = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
        int w7 = 1;
        int w8 = 7;
// Hello Goodbye
        System.out.println(strings4[w7 - 1] + " " + strings[w8 - 1]);

        String[] strings3 = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
        int w5 = 7;
        int w6 = 5;
// Goodbye Girls
        System.out.println(strings3[w5 - 1] + " " + strings[w6 - 1]);

        // _________________________________________


        int[] notstrings1 = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int target1 = 1;
        int count = 0;
// 5
        for (int i1 = 0; i1 < notstrings1.length; i1++) {
            if (target1 == notstrings1[i1])
                count++;
        }
        System.out.println(count);


        int[] notstrings2 = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int target2 = 6;
        int count2 = 0;
// 2
        for (int i2 = 0; i2 < notstrings2.length; i2++) {
            if (target2 == notstrings2[i2])
                count2++;
        }
        System.out.println(count2);


        int[] notstrings3 = {1, 7, 1, 4, 1, 7, 9, 6, 13, 1, 7};
        int target3 = 7;
        int count3 = 0;
// 3
        for (int xx : notstrings3) {
            if (target3 == xx) {
                count3++;
                System.out.println("yes");
            } else {
                System.out.println(xx);
            }
        }
        System.out.println(count3);

        // _________________________________________

        int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int isAllLessThan = 3;
        boolean result = true;

// false
        for (int xx : input)
            if (xx >= isAllLessThan)
                result = false;
        System.out.println(result);

        int[] input2 = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int isAllLessThan2 = 6;
        boolean result2 = true;
// false

        for (int xx2=0; xx2<input2.length; xx2++)
            if (input [xx2] >= isAllLessThan2)
            result2 = false;
        System.out.println(result2);

//        int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
//        int isAllLessThan = 7;
//// true

//        int[] input = {-5, -10, -1, -1, -2, -5, -9, 0, -11, -10, -100};
//        int isAllLessThan = 0;
//// false

    }
}
