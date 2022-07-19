package com.company;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Str = scanner.nextLine();
        char[] arr = Str.toCharArray();
        String rev = "";
        for(int i = Str.length() - 1; i >= 0; i--)
        {
            rev = rev + Str.charAt(i);
        }
        int a = 0;
        char[] str1 = Str.toCharArray();
        char [] str2 = rev.toCharArray();
        for(int i = Str.length() - 1; i>=0; i--)
        {
            if(str1[i]==str2[i])
                a+=1;
        }
        System.out.println(a);
    }
}
