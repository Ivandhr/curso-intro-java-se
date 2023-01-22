import java.sql.SQLOutput;

public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 200;
        int pension = 50;
        int overtimehr = 30;

        // $200 bonus
        salary = salary + bonus;
        System.out.println(salary);

        // Pension discount = $50
        salary = salary - pension;
        System.out.println(salary);

        // Overtime = 2 hrs ($30/hr)
        // Food coupon = $45
        salary = salary + 2 * overtimehr - 45;
        System.out.println(salary);

        // Updating strings
        String employeeName = "Ivan Hernandez";
        System.out.println(employeeName);
        employeeName = employeeName + " " +"Rodriguez";
        System.out.println(employeeName);
        System.out.println("Tu nombre es: " + employeeName);


    }
}
