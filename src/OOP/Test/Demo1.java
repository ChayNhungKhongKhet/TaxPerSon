package OOP.Test;

import java.util.Scanner;

public class Demo1 {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int age;
        boolean stillLearn;
        System.out.println("Enter age : ");
        age = sc.nextInt();
        System.out.println("Enter status : ");
        stillLearn = sc.nextBoolean();
        System.out.println(getDeduct(age,stillLearn));

    }
    public static double getDeduct(int age,boolean stillLearn) {
        if (age <=18) return 500000;
        else if(stillLearn && age <= 22)
            return 1000000;
        else
            return 0;
    }

}
