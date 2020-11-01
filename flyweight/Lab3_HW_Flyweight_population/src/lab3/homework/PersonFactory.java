package lab3.homework;

import java.util.HashMap;
import java.util.ArrayList;

public class PersonFactory{
    static HashMap<Person.Sex, Person> flyWeightMap = new HashMap<Person.Sex, Person>();

    public static Person getPerson(ArrayList<Double> probsHospital, ArrayList<Double> probsHospitalDeath,
                                   ArrayList<Double> probsSuddenDeath, Person.Sex sex) {
        Person human;
        if( flyWeightMap.containsKey(sex)){
//            System.out.println("print a");
            human = flyWeightMap.get(sex);
//            throw new ArithmeticException("1");
        }
        else{
            human = new Person( probsHospital,probsHospitalDeath,probsSuddenDeath,sex);
            flyWeightMap.put(sex, human);
//            System.out.println("print b");
//            throw new ArithmeticException("2");
        }
        return human;
    }
}
