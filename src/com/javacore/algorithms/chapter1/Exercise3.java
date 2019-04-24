package com.javacore.algorithms.chapter1;

public class Exercise3 {

    public static void changeSpaces(String s) {
        char[] ch = s.toCharArray();
        int length = ch.length;
        int spaceCount = 0;
        for(int i=0;i<length;i++){
            if (ch[i] == ' '){
                spaceCount+=2;
            }
        }
        int newLength = length + spaceCount;
        char[] ch1 = new char[newLength];
        for (int i=0,j=0;i<length;){
            if(ch[i]==' '){
                ch1[j] = '%';
                ch1[j+1]= '2';
                ch1[j+2]='0';
                i++;
                j+=3;
            }else{
                ch1[j] = ch[i];
                i++;
                j++;
            }
        }
        for(char i:ch1){
            System.out.print(i);
        }
    }
}
