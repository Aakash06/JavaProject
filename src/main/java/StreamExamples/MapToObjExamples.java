package StreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StudentData{

   int studentID;
   int age;

    StudentData(int studentID,int age){
        this.studentID =studentID;
        this.age= age;
    }

}

public class MapToObjExamples {

    public static void main(String[] args) {

        StudentData student1 = new StudentData(1, 19);
        StudentData student2 = new StudentData(2, 20);
        StudentData student3 = new StudentData(3, 18);
        StudentData student4 = new StudentData(4, 21);

        List<StudentData> list = Arrays.asList(student1, student2, student3, student4);

        Stream<StudentData> stream = list.stream();

        long CountOfAge = stream.filter(s->s.age>18).mapToInt(w->w.age).count();
        System.out.println(CountOfAge);
    }

}