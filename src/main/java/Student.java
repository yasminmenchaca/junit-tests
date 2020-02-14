import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;
    private long id;

    public Student(long id, String name) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId() {
        return this.id;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades list
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
