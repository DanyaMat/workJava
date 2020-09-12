package ru.DanyaMat.workJava.work1.ex5;

public class Main {

    public static void main(String[] args) {
        double num = 0;
        for(int i = 0; i < 10; i++){
            num = 1.0/(i+1);
            String str = String.format("%.4f", num);
            System.out.println(str);
        }
    }
}
