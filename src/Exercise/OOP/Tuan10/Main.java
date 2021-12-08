package Exercise.OOP.Tuan10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TaxPayer taxPayer = inputTaxPayer();
        System.out.printf("Your income is : %.2f\n",taxPayer.getIncome());
        System.out.printf("Your tax is : %.2f\n",taxPayer.getSumTax());
        double deduct  = taxPayer.getSumDeduct();
        System.out.printf("All your deduct is : %.2f\n",deduct);
        System.out.printf("your compulsory tax is : %.2f\n",taxPayer.getCompulsoryTax());
    }


    public static List<Income> inputListIncome() {
        int n;
        List<Income> incomeList = new ArrayList<>();
        System.out.println("Enter number income : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter income " + i);
            System.out.println("Enter work content : ");
            String content = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter salary : ");
            double salary = sc.nextDouble();
            incomeList.add(new Income(content,salary));
        }
        return incomeList;
    }


    public static List<Child> inputChildren() {
        int n;
        System.out.print("Enter number child : ");
        n = sc.nextInt();
        List<Child> childList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter child " +i );
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            System.out.print("Enter year of birth : ");
            int year = sc.nextInt();
            System.out.print("Enter gender ,true is male, false is female : ");
            boolean gender = sc.nextBoolean();
            System.out.print("Still learn : ");
            boolean stillLearn = sc.nextBoolean();
            System.out.println("Enter income list  ");
            List<Income> incomeList = inputListIncome();
            childList.add(new Child(name,year,gender,stillLearn,incomeList));
        }
        System.out.println("--------------------------------------\n");
        return childList;
    }

    public static List<Child> inputChildrenOfPayer() {
        int n;
        System.out.print("Enter number child : ");
        n = sc.nextInt();
        List<Child> childList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter child " +i );
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            System.out.print("Enter year of birth : ");
            int year = sc.nextInt();
            System.out.print("Enter gender ,true is male, false is female : ");
            boolean gender = sc.nextBoolean();
            System.out.print("Still learn : ");
            boolean stillLearn = sc.nextBoolean();
            childList.add(new Child(name,year,gender,stillLearn));
        }
        System.out.println("--------------------------------------\n");
        return childList;
    }

    public static List<Parent> inputListParent() {
        int n;
        List<Parent> parents = new ArrayList<>();
        System.out.print("Enter number parent : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter parent "+ i );
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter year of birth : ");
            int year = sc.nextInt();
            System.out.print("Enter gender ,true is male, false is female : ");
            boolean gender = sc.nextBoolean();
            System.out.println("Enter child list ");
            List<Child> children = inputChildren();
            parents.add(new Parent(name,year,gender,children));
        }
        System.out.println("-------------------------------------------\n");
        return parents;
    }

    public static TaxPayer inputTaxPayer() {
        System.out.println("Enter info taxpayer ");
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter year of birth : ");
        int year = sc.nextInt();
        System.out.print("Enter gender ,true is male, false is female : ");
        boolean gender = sc.nextBoolean();
        System.out.println("Enter child list  ");
        List<Child> children = inputChildrenOfPayer();
        System.out.println("Enter parent list  ");
        List<Parent> parents = inputListParent();
        System.out.println("Enter income list  ");
        List<Income> incomeList = inputListIncome();
        return new TaxPayer(name,year,gender,children,parents,incomeList);
    }
}
