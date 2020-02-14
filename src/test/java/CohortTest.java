import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort cohortOne;
    Cohort cohortTwo;
    Cohort cohortThree;

    @Before
    public void setup() {
        cohortOne = new Cohort();
        cohortTwo = new Cohort();
        cohortThree = new Cohort();

        Student yasmin = new Student(1, "Yasmin");
        yasmin.addGrade(93);
        yasmin.addGrade(68);
        yasmin.addGrade(85);

        Student lynn = new Student(2, "Lynn");
        lynn.addGrade(80);
        lynn.addGrade(79);
        lynn.addGrade(76);

        Student adam = new Student(3, "Adam");
        adam.addGrade(83);
        adam.addGrade(97);
        adam.addGrade(100);

        cohortOne.addStudent(yasmin);
        cohortOne.addStudent(lynn);
        cohortOne.addStudent(adam);

        cohortTwo.addStudent(adam);
        cohortTwo.addStudent(lynn);

        cohortThree.addStudent(yasmin);
        cohortThree.addStudent(lynn);
    }

    @Test
    public void cohortSize() {
        assertEquals(3, cohortOne.getStudents().size());
        assertEquals(2, cohortTwo.getStudents().size());
        assertEquals(2, cohortTwo.getStudents().size());
    }

    @Test
    public void cohortAverage() {
        assertEquals(84.55555555555554, cohortOne.getCohortAverage(), 0);
        assertEquals(85.83333333333333, cohortTwo.getCohortAverage(),0);
        assertEquals(80.16666666666666, cohortThree.getCohortAverage(),0);
    }
}
