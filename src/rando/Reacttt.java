package rando;

import java.util.Scanner;

public class Reacttt {

    public static void main(String[] args) throws InterruptedException {
        long highhScore = 99999999;
        int playAgain = 1;
        while (playAgain == 1) {
            System.out.println("The High Score is " + highhScore + " ms");
           System.out.println("Click to Start");

            Thread.sleep(1900);
            System.out.println("3");
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);

            System.out.println("1");
            Thread.sleep(1000);

            System.out.println("GO!!");
            long starTime = System.currentTimeMillis();

            Scanner s = new Scanner(System.in);
            s.next();
            long stopTime = System.currentTimeMillis();
            long reactionTime = stopTime - starTime;


            System.out.println(reactionTime + "ms");
            Thread.sleep(1000);
            long highScore = reactionTime;
            if(highScore < highhScore){
                highhScore = highScore;
            }
            System.out.println("The High Score is " + highhScore + " ms");



            System.out.println("Play again?");
            System.out.println("1 for Yes, 2 for No, 3 for Challenge Mode");
            Scanner a = new Scanner(System.in);
                String ss = a.next();
          int again = (Integer.valueOf(ss));

            if  (again == 2){
                playAgain = 2;
                Thread.sleep(1000);
                System.out.println("Game Over..");
            }
        }
    }
}
