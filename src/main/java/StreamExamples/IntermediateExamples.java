package StreamExamples;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class IntermediateExamples{

    int studentID;
    float marks;
    List<IntermediateExamples> list;

    IntermediateExamples(List<IntermediateExamples> list){
        this.list = list;
    }

    float getMarks(){
        return this.marks;
    }

    IntermediateExamples(int studenID,float marks){
        this.studentID =studenID;
        this.marks= marks;
    }

    long filterExample( List<IntermediateExamples> list){
        return list.stream().filter(e->e.marks>40).count();
    }

    long distinctExample(List<IntermediateExamples> list){
        return list.stream().map(n->n.marks).distinct().count();
    }

    float skipLimitExample(List<IntermediateExamples> list){

        return list.stream().map(n->n.marks).skip(2).limit(1).findFirst().get();
    }

    float sortedExamples(List<IntermediateExamples> list){
        return list.stream().map(n->n.marks).sorted().findFirst().get();
    }

}

