package org.example;

public class Tester {
    String name;
    String surname;
    int experienceInYears;
    String englishLevel;
    double salary;

    public Tester(String name, String surname, double salary) {
        this(name, surname, 0, salary);
    }

    public Tester(String name, String surname, int experienceInYears, double salary) {
        this(name, surname, experienceInYears, "B2", salary);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void print() {
        System.out.println("Тестер: " + name + " " + surname);
    }

    public void print(boolean sSalary) {
        System.out.println("Тестер: " + name + " " + surname);
        if (sSalary) {
            System.out.println("ЗП: " + salary);
        }
    }

    public void print(boolean sSalary, boolean sEnglishLevel) {
        System.out.println("Тестер: " + name + " " + surname);
        if (sSalary) {
            System.out.println("ЗП: " + salary);
        }
        if (sEnglishLevel) {
            System.out.println("Уровень английского: " + englishLevel);
        }
    }

    public static void compareExp(Tester t1, Tester t2) {
        if (t1.experienceInYears > t2.experienceInYears) {
            System.out.println(t1.name + " " + t1.surname + " имеет больший опыт работы (" + t1.experienceInYears + " лет) чем " + t2.name + " " + t2.surname + " (" + t2.experienceInYears + " лет).");
        } else if (t1.experienceInYears < t2.experienceInYears) {
            System.out.println(t2.name + " " + t2.surname + " имеет больший опыт работы (" + t2.experienceInYears + " лет) чем " + t1.name + " " + t1.surname + " (" + t1.experienceInYears + " лет).");
        } else {
            System.out.println(t1.name + " " + t1.surname + " и " + t2.name + " " + t2.surname + " имеют одинаковый опыт работы (" + t1.experienceInYears + " лет).");
        }
    }
}
