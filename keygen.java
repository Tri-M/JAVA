package com.company;

import java.util.Scanner;

public class Main {
    static int[] splitting(int num)
    {
        int temp,n;
        int[] array;
        String s = "";

        n = num;

        while (n>0) {
            temp = n%10;
            s = temp + s;
            n = n / 10;

        }

        array = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            array[i] = Integer.parseInt("" + s.charAt(i));

        }
        return array;
    }
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int[] array3;
       array1=splitting(3521);
       array2=splitting(2452);
       array3=splitting(1352);
      int k1=array3[0] < (array1[0] < array2[0] ? array1[0] : array2[0]) ? array3[0] : ((array1[0] < array2[0]) ? array1[0] : array2[0]);
      int k2=array3[1] > (array1[1] > array2[1] ? array1[1] : array2[1]) ? array3[1] : ((array1[1] > array2[1]) ? array1[1] : array2[1]);
      int k3=array3[2] < (array1[2] < array2[2] ? array1[2] : array2[2]) ? array3[2] : ((array1[2] < array2[2]) ? array1[2] : array2[2]);
      int k4=array3[3] > (array1[3] > array2[3] ? array1[3] : array2[3]) ? array3[3] : ((array1[3] > array2[3]) ? array1[3] : array2[3]);
      System.out.println(k1+""+k2+""+k3+""+k4);
       }

    }
