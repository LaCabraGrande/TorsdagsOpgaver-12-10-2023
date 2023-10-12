package Task3;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> passedCourses = new ArrayList<>();
    private ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }
    @Override
    public boolean addCourse(String course) {
        for(String c: passedCourses) {
            if(c.equals(course)) {
                currentCourses.add(course);
                return true;
            }
        }
        return false;
    }
}
