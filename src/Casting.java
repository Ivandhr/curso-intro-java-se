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

    }
}
