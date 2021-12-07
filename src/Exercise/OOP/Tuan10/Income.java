package Exercise.OOP.Tuan10;

public class Income {
    private String workContent;
    private double salary;


    public Income(String workContent, double salary) {
        this.workContent = workContent;
        this.salary = salary;
    }

    public Income() {
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
