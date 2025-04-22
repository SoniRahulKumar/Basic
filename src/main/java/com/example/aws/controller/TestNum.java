package com.example.aws.controller;

import java.util.Arrays;

public class TestNum {
    public static void main(String[] args) {
       // int[] arr = new int[]{1, 3, 7, 13, 21, 31, 43, 57, 73, 91};
        int[] arr = new int[10];
        for (int i = 1; i < 10; i++) { //i=0, arr=1 //i=2, arr=3 //i=3, arr=7
            arr[i - 1] = i * i - i + 1;
        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}
