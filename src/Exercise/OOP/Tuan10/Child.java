package Exercise.OOP.Tuan10;


import java.util.List;

public class Child extends Person{
    private boolean stillLearn;
    private List<Income> incomeList;

    public Child(String name, int yearOld, boolean gender, boolean stillLearn, List<Income> incomeList) {
        super(name, yearOld, gender);
        this.stillLearn = stillLearn;
        this.incomeList = incomeList;
    }

    public Child() {
    }

    @Override
    public double getDeduct() {
        if (getAge() <=18) return 500000;
        else if(stillLearn && getAge() <= 22)
            return 1000000;
        else
            return 0;
    }

    public double getIncome() {
        if (getAge() <=18 || isStillLearn())
            return 0;
        else {
            double income = 0;
            for (Income in : incomeList
            ) {
                income += in.getSalary();
            }
            return income;
        }
    }


    @Override
    public String toString() {
        return "Child{" +
                "stillLearn=" + stillLearn +
                '}';
    }

    public boolean isStillLearn() {
        return stillLearn;
    }

    public void setStillLearn(boolean stillLearn) {
        this.stillLearn = stillLearn;
    }

}
