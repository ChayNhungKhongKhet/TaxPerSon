package Exercise.OOP.Tuan10;

import java.util.List;

public class Parent extends Person{

    private List<Child> children ;

    public Parent(String name, int yearOld, boolean gender, List<Child> children) {
        super(name, yearOld, gender);
        this.children = children;
    }

    public double getDeduct() {
        int count = 0;
        for (Child child : children
             ) {
            if (child.getIncome() >= 4000000)
                count++;
        }
        if ((isGender() && getAge() >= 60) || (!isGender() && getAge() >=55))
            return (double) 1600000/count;
        return 0;
    }


    @Override
    public String toString() {
        return "Parent{" +
                "children=" + children +
                '}';
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
