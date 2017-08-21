package defaultStaticExamples;

interface JavaDeveloper{

   String developer();
    default String profile(){
        String position = "Hello I am Java Developer";
        return position;
    }
    static int salary(){

        return 25000;
    }
}

interface ScalaDeveloper{

     String developer2();

    default String profile1(){

        String position = "Hello I am Scala Developer";
        return position;

    }
    static int salary(){

        return 25000;
    }
}

public class DefaultStatic implements JavaDeveloper,ScalaDeveloper {

     @Override
     public String developer(){
            String greet = "Welcome to all";
            return greet;
    }

    @Override
    public String developer2(){
        String greet = "Welcome to all";
        return greet;
    }
}
