package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    public static void main(String[] args) {
        int blueCount = 0;

        do{
            String ballColor = getBall();
            System.out.println("La bola es de color: " + ballColor);

            if("azul".equals(ballColor)){
                blueCount++;
            }
        }while (blueCount < 2);
    }

    public static String getBall() {
        int randomNum = randomWithRange(1,4);
        switch (randomNum) {
            case 1:
                return "rojo";
            case 2:
                return "azul";
            case 3:
                return "verde";
            default:
                throw new IllegalStateException("Unexpected value: " + randomNum);
        }
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}

