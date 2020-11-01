package lab3.homework;

import java.util.ArrayList;

public class Household {
    ArrayList<Person> inhabitants;
    Integer index;
    ArrayList<Integer> inhabitantAges;
    ArrayList<Integer> inhabitantIndices;
    ArrayList<Boolean> inhabitantDeathStatuses;
    ArrayList<Integer> inhabitantDaysInHospital;

    public Household(ArrayList<Person> people, Integer index,  ArrayList<Integer> inhabitantAges,
                     ArrayList<Integer> inhabitantIndices, ArrayList<Boolean> inhabitantDeathStatuses,
                     ArrayList<Integer> inhabitantDaysInHospital) {
        this.inhabitants = people;
        this.index = index;
        this.inhabitantAges = inhabitantAges;
        this.inhabitantIndices = inhabitantIndices;
        this.inhabitantDeathStatuses = inhabitantDeathStatuses;
        this.inhabitantDaysInHospital = inhabitantDaysInHospital;
    }
    public void newDay() {
        Boolean printed = false;
        int i = 0;
        for (Person e : inhabitants) {
            returnObject state = e.newDay(inhabitantAges.get(i), inhabitantDaysInHospital.get(i),
                    inhabitantDeathStatuses.get(i), inhabitantIndices.get(i));
            if (state.status.length()>0) {
                if (!printed) {
                    System.out.println("Household "+ index);
                    printed = true;
                }
                System.out.println(state.status);
            }
            inhabitantDaysInHospital.set(i, state.daysInHospital);
            inhabitantDeathStatuses.set(i, state.dead);
            i = i+1;
        }
    }
}
