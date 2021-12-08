package Exercise.OOP.Tuan10;

import java.util.Calendar;


public class Person {
    private String name;
    private int yearOfBth;
    private boolean gender;// true is male ,false is female


    public Person(String name, int yearOfBth, boolean gender) {
        this.name = name;
        this.yearOfBth = yearOfBth;
        this.gender = gender;
    }

    public Person() {
    }


    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBth;
    }


    public double getDeduct() {
        return 4000000;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOld=" + yearOfBth +
                ", gender=" + gender +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBth() {
        return yearOfBth;
    }

    public void setYearOfBth(int yearOfBth) {
        this.yearOfBth = yearOfBth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
