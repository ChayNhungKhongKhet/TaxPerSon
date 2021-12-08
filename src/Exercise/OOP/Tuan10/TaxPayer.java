package Exercise.OOP.Tuan10;

import java.util.List;

public class TaxPayer extends Person{

    List<Child> children;
    List<Parent> parentList;
    List<Income> incomeList;

    public TaxPayer(String name, int yearOld, boolean gender, List<Child> children, List<Parent> parentList,List<Income> incomeList) {
        super(name, yearOld, gender);
        this.children = children;
        this.parentList = parentList;
        this.incomeList = incomeList;
    }

    public double getIncome() {
        double income = 0;
        for (Income in : incomeList
        ) {
            income += in.getSalary();
        }
        return income;
    }

    public double getSumTax() {
        double income = getIncome();
        if (income <=4000000)
            return 0;
        else if (income <= 6000000)
            return income * 0.05;
        else if (income <= 10000000)
            return income * 0.1;
        else
            return income * 0.2;
    }

    public double getSumDeduct() {
        double sumDeduct;
        double deductOfChild;
        double deductOfParent = 0;
        if (getIncome() > 4000000)
            for (Parent x : parentList)
                deductOfParent += x.getDeduct();
        double maxDdOfChild ,second;
        if (children.get(0).getDeduct() > children.get(1).getDeduct()){
            maxDdOfChild = children.get(0).getDeduct();
            second = children.get(1).getDeduct();
        }
        else{
            maxDdOfChild = children.get(1).getDeduct();
            second = children.get(0).getDeduct();
        }

        for (int i = 2; i < children.size(); i++) {
            if (maxDdOfChild <= children.get(i).getDeduct()) {
                second = maxDdOfChild;
                maxDdOfChild = children.get(i).getDeduct();
            }
            else if(second <=  children.get(i).getDeduct())
                second =  children.get(i).getDeduct();
        }

        deductOfChild = maxDdOfChild +second;
        sumDeduct = deductOfParent + deductOfChild + super.getDeduct();
        return sumDeduct;
    }

    public double getCompulsoryTax() {
        return getSumTax() - getSumDeduct() > 0 ? getSumTax() - getSumDeduct() : 0;
    }

    @Override
    public String toString() {
        return "TaxPayer{" +
                "children=" + children +
                ", parentList=" + parentList +
                ", incomeList=" + incomeList +
                '}';
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public List<Parent> getParentList() {
        return parentList;
    }

    public void setParentList(List<Parent> parentList) {
        this.parentList = parentList;
    }

    public List<Income> getIncomeList() {
        return incomeList;
    }

    public void setIncomeList(List<Income> incomeList) {
        this.incomeList = incomeList;
    }
}
