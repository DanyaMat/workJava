package ru.DanyaMat.workJava.work2;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", 4);
        Dog dog2 = new Dog("Rex", 2);
        Dog dog3 = new Dog("Skooby", 3);
        Dog dog4 = new Dog("Nock", 4);
        DogNursery nursery = new DogNursery();
        nursery.addDog(dog1, dog2, dog3, dog4);
    }
}
