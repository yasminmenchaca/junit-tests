import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student yasmin;
    Student lynn;

    @Before
    public void setUp() {
        yasmin = new Student(1, "Yasmin");
        yasmin.addGrade(90);
        yasmin.addGrade(60);
        yasmin.addGrade(100);

        lynn = new Student(2, "Lynn");
        lynn.addGrade(81);
        lynn.addGrade(95);
        lynn.addGrade(73);
    }

    @Test
    public void userObjects() {
        assertEquals("Yasmin", yasmin.getName());
        assertEquals(1, yasmin.getId());
        assertEquals("Lynn", lynn.getName());
        assertEquals(2, lynn.getId());
    }

    @Test
    public void testAverage() {
        assertEquals(83.33333333333333, yasmin.getGradeAverage(), 0);
        assertEquals(83.0, lynn.getGradeAverage(), 0);
    }

}
