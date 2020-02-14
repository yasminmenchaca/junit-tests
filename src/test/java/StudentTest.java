package test.java;

import java.util.ArrayList;

public class StudentTest {

    private String name;
    private long id;
    private ArrayList<Integer> grades;

    // returns the student's id
    public long getId() {
        return this.id;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
