package ru.mirea.uybin.pr1;

public class DemoDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rex",3);
        System.out.println(d1);
        d1. setName("Dozor");
        d1. setAge(5);
        System.out.println(d1);
    }
}
