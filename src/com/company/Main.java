package com.company;

public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setName("Балык");
        fish.setAge(3);
        fish.setWeight(5);

        Parrot parrot = new Parrot();
        parrot.setName("Попугай");
        parrot.setAge(4);
        parrot.setWeight(6);
        
        Cat cat = new Cat();
        cat.setName("Мышык");
        cat.setAge(5);
        cat.setWeight(7);

        Dog dog = new Dog();
        dog.setName("Daisy");
        dog.setAge(5);
        dog.setWeight(9);
        System.out.println("Аты-"+fish.getName()+": Жашы-"+fish.getAge()+": Салмагы-"+fish.getWeight());
        System.out.println(" Аты-"+parrot.getName()+": Жашы-"+parrot.getAge()+": Салмагы-"+parrot.getWeight());
        System.out.println(" Аты-"+cat.getName()+": Жашы-"+cat.getAge()+": Салмагы-"+cat.getWeight());
        System.out.println(" Аты-"+dog.getName()+": Жашы-"+dog.getAge()+": Салмагы-"+dog.getWeight());

    }
}
