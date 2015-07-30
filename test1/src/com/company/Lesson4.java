package com.company;

import java.lang.ref.SoftReference;

/**
 * Created by md212 on 22.07.15.
 */
public class Lesson4 {
    public static void main(String[] args) {
        int[] operand1 = {76, 90, 4, 87, 70, 57, 48, 70, 31, 69, 18, 40, 76};
        int[] operand2 = {76, 50, 36, 77, 87, 28, 98, 20, 20, 52, 86, 34, 34};
        int[] expectedResults1 = {152, 140, 40, 164, 157, 85, 146, 90, 51, 120, 104, 74, 110};

        // Tests PASSED

        String s = null;


        for (int x1 = 0; x1 < operand1.length; x1++) {
            int h1 = operand1[x1];
            int h2 = operand2[x1];
            int sum = h1 + h2;

            if (expectedResults1[x1] == sum) {
                s = "Test Passed";
            } else {
                System.out.println("Expected:" + " " + expectedResults1[x1] + ", " + "Actual:" + " " + sum);
                s = "Test Failed";
            }
        }
        System.out.println(s);


        int[] operand3 = {76, 91, 4, 87, 70, 57, 45, 30, 30, 121, 18, 40, 76};
        int[] operand4 = {76, 49, 36, 77, 87, 28, 101, 60, 20, 0, 86, 34, 34};
        int[] expectedResults3 = {152, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};

// Expected: 51; Actual: 50
// Tests FAILED
        String s2 = null;

        for (int x2 = 0; x2 < operand3.length; x2++) {
            int h3 = operand3[x2];
            int h4 = operand4[x2];
            int sum2 = h3 + h4;

            if (expectedResults3[x2] == sum2) {
                s2 = "Test Passed";
            } else {
                System.out.println("Expected:" + " " + expectedResults3[x2] + ", " + "Actual:" + " " + sum2);
                s2 = "Test Failed";

            }
        }
        System.out.println(s2);


        int[] operand5 = {96, 35, 71, 54, 87, 76, 85, 30, 94, 8, 88, 82, 20};
        int[] operand6 = {2, 63, 33, 91, 98, 20, 95, 95, 5, 83, 38, 66, 87};
        int[] expectedResults4 = {98, 98, 100, 137, 185, 96, 180, 125, 99, 91, 126, 148, 90};
// Expected: 100; Actual: 104
// Expected: 137; Actual: 145
// Expected: 90; Actual: 107
// Tests FAILED

        String s3 = null;

        for (int x3 = 0; x3 < operand5.length; x3++) {
            int h5 = operand5[x3];
            int h6 = operand6[x3];
            int sum3 = h5 + h6;

            if (expectedResults4[x3] == sum3) {
                s3 = "Test Passed";
            } else {
                System.out.println("Expected:" + " " + expectedResults4[x3] + ", " + "Actual:" + " " + sum3);
                s3 = "Test Failed";
            }
        }
        System.out.println(s3);


        int[] operand7 = {41, 39, 64, 56, 48, 52, 57, 82, 12, 53, 80, 24, 75};
        int[] operand8 = {81, 42, 83, 4, 68, 11, 4, 67, 29, 1, 51, 3, 98};
        int[] expectedResults5 = {122, 81, 147, 60, 116, 63, 61, 149, 41, 54, 131, 27, 173};
// Tests PASSED
        String s5 = null;

        for (int x5 = 0; x5 < operand7.length; x5++) {
            int h7 = operand7[x5];
            int h8 = operand8[x5];
            int sum5 = h7 + h8;

            if (expectedResults5[x5] == sum5) {
                s5 = "Test Passed";
            } else {
                System.out.println("Expected:" + " " + expectedResults5[x5] + ", " + "Actual:" + " " + sum5);
                s5 = "Test Failed";
            }
        }
        System.out.println(s5);

    }
}
