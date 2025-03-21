package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Илья!");

        Tester t1 = new Tester("Андрей", "Камикадзе", 2, 2100);
        Tester t2 = new Tester("Евгений", "Курыгин", 5, 2450);
        Tester t3 = new Tester("Алиса", "Лисовская", 5, 3000);
        
        t1.print();
        t2.print(true);
        t3.print(true, true);

        Tester.compareExp(t1, t2);
        Tester.compareExp(t2, t3);
    }
}
