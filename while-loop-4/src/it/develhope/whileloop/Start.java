package it.develhope.whileloop;

import java.util.Scanner;

public class Start{
    public static int attempts = 1;//aggiunta mia

    public static void main(String[] args){

        System.out.println("Welcome!");
        int     number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 10");

        while(true){
            number = (int) Math.ceil(Math.random() * 10);
            int whatGuess = scanner.nextInt();
            if(number != whatGuess && whatGuess <= 10){
                System.out.println("Wrong/s attempt/s is/are: "+attempts++);//aggiunta mia
            } else if(whatGuess > 10){
                System.out.println("The number is out of bounds (1-10)");
            } else {
                System.out.println("Congratulations!");
                break;
            }
        }
    }
}





