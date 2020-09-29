package ru.sapteh;

public class Program {
    public static void main (String[] args){
        Person person = new Person("Ivan",174,27);
        Person person1 = new Person("Artem",19,4);
        Person person2 = new Person("Matvyi",800,78);
        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
