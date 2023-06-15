package arrayLists;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Kirk");

        // write add() method
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("David", "BSIT"));
        students.add(new Student("Alenere", "BSIT"));
        students.add(new Student("Jaymar", "BSIT"));

        // read get() method
        students.get(0).introduceSelf();

        // update set() method
        students.set(0, new Student("Kirk", "BSCS"));
        students.get(0).introduceSelf();

        // delete remove() method
        students.remove(0);
        students.get(0).introduceSelf();

        // size() method
        System.out.println(students.size());

        for (int i = 0; i < students.size(); i++) {
            students.get(i).introduceSelf();
        }

        for (Student s:students) {
            s.introduceSelf();
        }
    }
}
