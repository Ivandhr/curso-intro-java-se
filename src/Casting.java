public class Casting {
    public static void main(String[] args) {

        //En un año ubicar 30 perros
        //Cuántos perros ubique al mes?

        double PERROS = 30;
        double monthlyDogs = PERROS/12;
        System.out.println(monthlyDogs);

        //ESTIMACIÓN
        //Casting double into integer
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //EXACTITUD
        int a = 30;
        int b = 12;
        System.out.println(a/b);
        //Casting int into double
        System.out.println((double) a/b);

        //Casteo entre tipos de datos
        double c = (double) a/b;
        System.out.println("Casteo entre tipos de datos");
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI); //49 equivale a 1 en ASCII.

        short nS = (short) nI;
        System.out.println(nS);



    }
}
