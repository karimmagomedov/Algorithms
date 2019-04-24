package com.javacore.algorithms.chapter1;

import java.util.Arrays;

public class Exercise1 {

    public static boolean uniqueChars (String s){
        char[] ch =  s.toCharArray();
        int n = ch.length;
        Arrays.sort(ch);
        int sameCh = 0;
        for (int i=0;i<n-1;i++){
            if (ch[i] == ch[i+1]){
                sameCh++;
            }
        }
        if (sameCh>0){
            return false;
        }else{
            return true;
        }
    }

}
