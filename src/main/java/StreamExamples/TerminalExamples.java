package StreamExamples;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class MarkSheet{

    int studentID;
    float marks;
    List<MarkSheet> list;

    MarkSheet(List<MarkSheet> list){
        this.list = list;
    }

    float getMarks(){
        return this.marks;
    }

    MarkSheet(int studenID,float marks){
        this.studentID =studenID;
        this.marks= marks;
    }

     boolean allMatchResult(Predicate<MarkSheet> predicate,List<MarkSheet> list){
      return list.stream().allMatch(predicate);
    }

    boolean anyMatchResult(Predicate<MarkSheet> predicate,List<MarkSheet> list){
        return list.stream().anyMatch(predicate);
    }

    boolean noneMatchResult(Predicate<MarkSheet> predicate,List<MarkSheet> list){
        return list.stream().noneMatch(predicate);
    }

    float findAnyResult(List<MarkSheet> list){
        return list.stream().filter(e->e.marks>40).findAny().get().marks;
    }

    float findFirstResult(List<MarkSheet> list){
        return list.stream().findFirst().get().marks;
    }

    float findMin(List<MarkSheet> list){
        return list.stream().min(Comparator.comparing(MarkSheet::getMarks)).get().marks;
    }

    float findMax(List<MarkSheet> list){
        return list.stream().max(Comparator.comparing(MarkSheet::getMarks)).get().marks;
    }

    long computeCount(List<MarkSheet> list){
        return list.stream().count();
    }

    float computeCollect(List<MarkSheet> list){
        return list.stream().collect(Collectors.summingDouble(e->e.marks)).floatValue();
    }

    float reduceExample( List<MarkSheet> list){
        return list.stream().map(e->e.marks).reduce((n1,n2)->(n1+n2)).get();
    }

}

