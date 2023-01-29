public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Constantes
        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        //Devuelve un entero redondeado hacia arriba
        System.out.println(Math.ceil(x));

        //Devuelve un entero redondeado hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));

        //Devulve el número mayor
        System.out.println(Math.max(x,y));

        //Devulve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un círculo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de una esfera
        //4+pi*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));

    }
}
