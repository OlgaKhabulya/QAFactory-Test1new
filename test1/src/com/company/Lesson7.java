package com.company;

public class Lesson7 {
    public static void main(String[] args) throws Exception{
       String s = System.console().readLine("Please input string: ");
        String res = s.length() > 10 ? "long string" : "short one";
        System.out.println("you entered " + res);


//        int x = System.in
//                ();


//        System.out.println(x);
//
//    }
//
//
//
//    public static int fun(boolean b, int x, int y){
//        if(b)
//            return x;
//        else
//            return y;
//    }
//    public static int fun2(boolean b, int x, int y){
//        return !b && x > y
//                ? x * 100 + 29
//                : y / 4 / fun(y==1, 1, 2);
    }
}
