package ru.mirea.uybin.pr1;

public class DemoCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(4.5,"red");
        System.out.println(c1);
        c1.setColor("blue");
        c1.setRadius(78.9);
        System.out.println(c1);
    }
}
