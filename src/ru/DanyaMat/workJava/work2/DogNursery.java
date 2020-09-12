package ru.DanyaMat.workJava.work2;

public class DogNursery{
    private Dog[] dogs = new Dog[1000];
    private int SIZE = 0;

    public void addDog(Dog ... newDogs){
        for(int i = 0; i < newDogs.length; i++){
            dogs[(SIZE+i)%1000] = newDogs[i];
            SIZE++;
        }
    }
}
