public class DataTypes {
    public static void main(String[] args) {
        //Integers
        byte nB = 127;
        short bS = 32767;
        int n = 2147483647;
        long nL = 9223372036854775807L;

        //Punto Flotante
        double nD = 123.456;
        float nF = 123.456F;

        //Tipo var infiere el tipo de dato
        var salary = 1000; //Int
        //pension 3%
        var pension = salary*0.03; //Double
        var totalSalary = salary - pension; //Double
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Ivan Hernandez";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: "+ totalSalary);


    }
}
