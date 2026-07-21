package Random_Stuff;

import java.util.Random;

public class random_exercise_2 {
    static void main(String[] args){
        Random r = new Random();

        int num1;
        int num2;
        int num3;

        num1 = r.nextInt(1,7);
        num2 = r.nextInt(7,13);
        num3 = r.nextInt(13,20);

        System.out.println(num1+ "\n" + num2 + "\n" +num3);
        double num4;

        num4 = r.nextDouble(2,3);
        System.out.println(num4);

        boolean isHeads;

        isHeads = r.nextBoolean();
        if(isHeads){
            System.out.println("Heads!");
        }
        else {
            System.out.println("Tails!");
        }



    }
}
