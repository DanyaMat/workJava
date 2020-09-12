package ru.DanyaMat.workJava.work1.ex7;

public class Main {
    public static int Fact(int n){
        if(n<=0) {
            System.out.println("Введено некорректное значение");
            return -1;
        } else{
            int f = 1;
            while(n!=0){
                f = f*n;
                n--;
            }
            return f;
        }
    }

    public static void main(String[] args) {
        System.out.println(Fact(0));
    }
}
