package StreamExamples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StudentData{

  private int studentID;
  private float marks;
  private int age;
  private List<StudentData> list;

   int getStudentID() {
        return studentID;
    }

    StudentData(int studentID, int age, float marks){
        this.studentID =studentID;
        this.marks= age;
        this.marks= marks;
    }

    StudentData(List<StudentData> list){
        this.list= list;
    }


    double averageOfMarks(List<StudentData> list,int id){
        return list.stream().filter(n->n.studentID==id).mapToDouble(m->m.marks).average().orElse(0);
    }

    Map groupByExample(List<StudentData> list){
        return list.stream().collect(Collectors.groupingBy(StudentData::getStudentID));
    }

    Map partitionByExample(List<StudentData> list){
        return list.stream().collect(Collectors.partitioningBy(n->n.marks>40));
    }

}