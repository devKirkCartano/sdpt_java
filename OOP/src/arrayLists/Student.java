package arrayLists;

public class Student {

    String name, course;

    Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    void introduceSelf() {
        System.out.println("Hi, I'm " + name + " and I'm taking " + course);
    }
}
