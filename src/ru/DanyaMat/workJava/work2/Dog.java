package ru.DanyaMat.workJava.work2;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return age;
    }
    public int toHumanAge(){
        return (this.age * 7);
    }

    @Override
    public String toString() {
        return "Class name: Dog" + "\n" + "Name: " + this.name + "\n" + "Age: " + this.age;
    }
}