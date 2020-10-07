package ru.mirea.uybin.pr1;

public class DemoBook {
    public static void main(String[] args) {
        Book b1 = new Book("Voyna i mir","Tolstoy");
        System.out.println(b1);
        b1.setBookname("Prestuolenie i nakazanie");
        b1.setAuthor("Dostoevskiy");
        System.out.println(b1);
    }
}
