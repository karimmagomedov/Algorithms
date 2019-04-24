package com.javacore.algorithms.chapter1;

import java.util.Arrays;

public class Exercise5 {


    public static boolean oneEdit (String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int n1 = ch1.length;
        int n2 = ch2.length;

        if(n1-n2==1){
            int count = 0;
            int i=0;
            int j=0;
            while (i<n2){
                if(ch1[i]==ch2[j]){
                    j++;
                    i++;
                }else{
                    count++;
                    i++;
                }
            }
            if (count<=1){
                return true;
            }else{
                return false;
            }
        }else if(n2-n1==1) {
            int count = 0;
            int i=0;
            int j=0;
            while (i<n1){
                if(ch2[i]==ch1[j]){
                    j++;
                    i++;
                }else{
                    count++;
                    i++;
                }
            }
            if (count<=1){
                return true;
            }else{
                return false;
            }
        } else if(n1==n2) {
            int diffCharCount = 0;
            for(int i=0;i<n1;i++){
                if(ch1[i] != ch2[i]){
                    diffCharCount++;
                }
            }
            if (diffCharCount<=1){
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }
}
