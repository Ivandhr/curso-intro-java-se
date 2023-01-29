public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        System.out.println(lives);
        lives = lives - 1;
        System.out.println(lives);

        //Postfija
        lives--;
        System.out.println(lives);

        lives++;
        System.out.println(lives); //4

        //Prefija
        //Gana un regalo o gana una vida
        int gift = 100 + lives++; //Postfija
        System.out.println(gift); //104
        System.out.println(lives); //5

        gift = 100 + ++lives; //Prefija
        System.out.println(gift); //106
        System.out.println(lives); //6



    }
}
