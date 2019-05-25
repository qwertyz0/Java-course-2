package ua.edu.chmnu.fks.oop.Lab07;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Lab07 {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        SimpleDateFormat df = new SimpleDateFormat("mm-dd-yyyy");
        ArrayList<Person> people = new ArrayList<Person>();
        try {
            people.add(new Person("Bill", 1337, df.parse("6-7-2020")));
            people.add(new Person("Anna", 4106, df.parse("1-12-2007")));
            people.add(new Person("Rem", 2215, df.parse("25-2-2011")));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Collections.sort(people, new Person.CompId());
        System.out.println("BY ID");
        for (Person p : people) {
            System.out.println(p.toString());
        }

        Collections.sort(people, new Person.CompDate(false));
        System.out.println("BY Date asc");
        for (Person p : people) {
            System.out.println(p.toString());
        }
        Collections.sort(people, new Person.CompDate(true));
        System.out.println("BY Date desc");
        for (Person p : people) {
            System.out.println(p.toString());
        }

    }
}

