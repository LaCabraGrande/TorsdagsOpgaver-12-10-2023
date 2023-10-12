package Task3;

import java.util.ArrayList;

public class Teacher extends Person {

    private ArrayList<String> canTeach = new ArrayList<>();
    private ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        for(String c: canTeach) {
            if(c.equals(course)) {
                currentCourses.add(course);
                return true;
            }
        }
        return false;
    }
}
