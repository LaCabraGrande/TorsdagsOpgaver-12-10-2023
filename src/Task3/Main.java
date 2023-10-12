package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<Person>();
        ArrayList<String> course1 = new ArrayList<String>();
        ArrayList<String> course2 = new ArrayList<String>();
        ArrayList<String> canteach = new ArrayList<String>();
        ArrayList<String> canteach2 = new ArrayList<String>();
        canteach.add("Java 1.0");
        canteach2.add("Java 2.0");
        canteach2.add("HTML 1.0");
        course1.add("HTML 1.0");
        course2.add("Java 1.0");
        course2.add("Java 2.0");

        person.add(new Student("Ole", course1));
        person.add(new Student("Kjeld", course2));
        person.add(new Teacher("Signe", canteach));
        person.add(new Teacher("Jesper", canteach2));

        //Person stud1 = new Student("Ole", course);
        //Person stud2 = new Student("Kjeld", course);
        //Person teach1 = new Teacher("Signe", canteach);
        //Person teach2 = new Teacher("Jesper", canteach);

        System.out.println(person.size());
        for(Person p: person) {

            if(p.addCourse("Java 1.0")) {
                if(p instanceof Student) {
                    System.out.println(p.getName() + " har allerede bestået dette kursus");
                } else {
                    System.out.println(p.getName() + " kan allerede undervise i dette kursus");
                }
            } else {
                if(p instanceof Student) {
                    System.out.println(p.getName() + " tilmeldes kurset");
                } else {
                    System.out.println(p.getName() + " kan ikke undervise i dette kursus og tilmeldes det");
                }
            }
        }

    }
}
