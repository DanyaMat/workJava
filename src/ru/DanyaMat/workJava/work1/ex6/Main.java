package ru.DanyaMat.workJava.work1.ex6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Random rand  = new Random();
        for(int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i < array2.length; i++){
            array2[i] = rand.nextInt(100);
        }
        System.out.print("Array1: ");
        for(int i =0; i < array1.length; i++){
            System.out.print(array1[i]+"  ");
        }
        System.out.print("\nArray2: ");
        for(int i =0; i < array2.length; i++){
            System.out.print(array2[i]+"  ");
        }
        for (int i = 0; i < array1.length-1; i++){
            for (int j = i+1; j < array1.length; j++){
                if (array1[i] < array1[j]) {
                    int t = array1[i];
                    array1[i] = array1[j];
                    array1[j] = t;
                }
            }
        }
        for (int i = 0; i < array2.length-1; i++){
            for (int j = i+1; j < array2.length; j++){
                if (array2[i] < array2[j]) {
                    int t = array2[i];
                    array2[i] = array2[j];
                    array2[j] = t;
                }
            }
        }
        System.out.print("\nArray1 sorted: ");
        for(int i =0; i < array1.length; i++){
            System.out.print(array1[i]+"  ");
        }
        System.out.print("\nArray2 sorted: ");
        for(int i =0; i < array2.length; i++){
            System.out.print(array2[i]+"  ");
        }

    }
}
