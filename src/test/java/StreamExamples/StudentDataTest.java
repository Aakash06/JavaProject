package StreamExamples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentDataTest {


    StudentData student1 = new StudentData(1, 17,58);
    StudentData student2 = new StudentData(2, 20,20);
    StudentData student3 = new StudentData(3, 18,45);
    StudentData student4 = new StudentData(4, 21,35);
    StudentData student5 = new StudentData(3, 18,50);
    StudentData student6 = new StudentData(3, 21,85);



    List<StudentData> list = Arrays.asList(student1, student2, student3, student4,student5,student6);

    StudentData studentData = new StudentData(list);
    

    @Test
    public void averageOfMarks() throws Exception{
        assertEquals(studentData.averageOfMarks(list,3),60.0,1);
    }

    @Test
    public void groupByExample() throws Exception{
        assertTrue(studentData.groupByExample(list).containsKey(3));
    }

    @Test
    public void partitionByExample() throws Exception{
        assertTrue((studentData.partitionByExample(list).containsKey(true)));
    }

}