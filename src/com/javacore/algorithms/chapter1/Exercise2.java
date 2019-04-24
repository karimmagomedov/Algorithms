package com.javacore.algorithms.chapter1;

import java.util.Arrays;

public class Exercise2 {

    public static boolean permutationStr (String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int n1 = ch1.length;
        int n2 = ch2.length;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int count = 0;
        if (n1 == n2) {
            for (int i = 0; i < n1; i++) {
                if (ch1[i] != ch2[i]) {
                    count++;
                }
            }
            if (count > 0) {
                return false;
            } else {
                return true;
            }
        }else{
            return false;
        }
    }
}
