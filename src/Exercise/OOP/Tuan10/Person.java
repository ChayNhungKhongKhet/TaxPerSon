package Exercise.OOP.Tuan10;

import java.util.Calendar;


public class Person {
    private String name;
    private int yearOld;
    private boolean gender;// true is male ,false is female


    public Person(String name, int yearOld, boolean gender) {
        this.name = name;
        this.yearOld = yearOld;
        this.gender = gender;
    }

    public Person() {
    }


    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOld;
    }


    public double getDeduct() {
        return 4000000;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOld=" + yearOld +
                ", gender=" + gender +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
