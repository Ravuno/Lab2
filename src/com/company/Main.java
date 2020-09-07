package com.company;

public class Main {

    public static void main(String[] args) {
        Shape a = new Shape();
        a.length = 5;
        a.width = 10;
        a.toString();


        //last
        Dog b = new Dog();
        b.setAge(10);
        b.setName("Vanya");
        System.out.println(b.to_human());
        dog_nursery c = new dog_nursery();
        c.add(b);

    }
}
