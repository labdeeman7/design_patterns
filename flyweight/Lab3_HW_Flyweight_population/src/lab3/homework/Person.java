package lab3.homework;

import java.util.ArrayList;
import java.util.Random;

class returnObject {
    Boolean dead; // To store dead variables
    int daysInHospital; // To store division
    String status; // To store status Information
    returnObject(Boolean dead, int daysInHospital, String status)
    {
        this.dead = dead;
        this.daysInHospital = daysInHospital;
        this.status = status;
    }
}

public class Person {
    public enum Sex {Male, Female};
    public static ArrayList<Integer> ageGroups;

    private static ArrayList<Double> probabilityHospital;
    private static ArrayList<Double> probabilityHospitalDeath;
    private static ArrayList<Double> probabilitySuddenDeath;
    public static Sex sex;

    //    Integer age;
//    Integer daysInHospital;
//    Boolean dead;
//    Integer index;


    public Person(ArrayList<Double> probsHospital, ArrayList<Double> probsHospitalDeath,
                  ArrayList<Double> probsSuddenDeath, Sex sex) {
        this.probabilityHospital = probsHospital;
        this.probabilitySuddenDeath = probsSuddenDeath;
        this.probabilityHospitalDeath = probsHospitalDeath;
        this.sex = sex;

        //        this.age = age;
//        this.daysInHospital = -1;
//        this.dead = false;
//        this.index = index;
    }

    /**
     * A method computing what happens to a person that day
     * @return a String describing what happened (if anything)
     */

    public returnObject newDay(Integer age, Integer daysInHospital, Boolean dead, Integer index) {
        //If dead, do nothing
        if (dead) return new returnObject (true, daysInHospital, "");

        //Calculate what age group this person belongs to
        int myGroup = 0;
        while (age > ageGroups.get(myGroup)) {
            myGroup++;
        }

        // create random object
        Random randomno = new Random();

        if (daysInHospital>0) { //If still in hospital, reduce days left in hospital
            daysInHospital = daysInHospital - 1;
        } else if (daysInHospital == 0) { //If at the end of hospital stay, see if dies or lives
            daysInHospital = daysInHospital - 1;
            if (randomno.nextDouble() < probabilityHospitalDeath.get(myGroup)) {
                dead = true;
                return new returnObject (true, daysInHospital,"Agent "+index+" ("+sex+", age: "+age+") died in hospital");
            }
        } else { //Person not in hospital
            //Chance of sudden death
            if (randomno.nextDouble() < probabilitySuddenDeath.get(myGroup)) {
                dead = true;
                return new returnObject (true, daysInHospital, "Agent "+index+" ("+sex+", age: "+age+") died a sudden death") ;
            } else {
                //Chance of hospitalization
                if (randomno.nextDouble() < probabilityHospital.get(myGroup)) {
                    daysInHospital = 6;
                    return  new returnObject (false, daysInHospital, "Agent "+index+" ("+sex+", age: "+age+") hospitalized") ;
                }
            }
        }
        return new returnObject (false, daysInHospital, "");
    }
}
