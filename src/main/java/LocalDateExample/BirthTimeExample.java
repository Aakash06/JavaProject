package LocalDateExample;

import java.time.LocalDate;
import java.time.Period;

class BirthTimeExample {


    String ageCalculator(int day,int month,int year){

        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year,month,day);
        Period age = Period.between(birthDate,currentDate);
        return "Your age is "+ age.getYears()+" years "+ age.getMonths()+" months";

    }
}
