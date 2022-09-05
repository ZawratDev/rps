package com.example.rpsgame;

import java.util.Scanner;

public class RpsGame {
    public static void main(String[] args) {
        final String ROCK = "Rock";

        final String PAPER = "Paper";

        final String SCISSORS = "Scissors";

        byte playerResult = 0;

        byte cpuResult = 0;

        int cpuChoice;

        String playerChoice;

        Scanner scanner = new Scanner(System.in);

//        System.out.println(cpuChoice);

        for (byte i = 1; i <= 5; i++) {

            System.out.print("Choose your weapon (rock, paper or scissors): ");

            playerChoice = scanner.next();

            playerChoice = playerChoice.toLowerCase();

            if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {

                if (playerChoice.equals("rock"))

                    System.out.println("You have chosen a rock!");

                else if (playerChoice.equals("paper"))

                    System.out.println("You have chosen a paper!");

                else if (playerChoice.equals("scissors"))

                    System.out.println("You have chosen a scissors!");

                else System.out.println("We don't know what did you choose.");
            else System.out.println("nothing");
            }
        }
            cpuChoice = (int)(Math.random() * 3) + 1;



//


    }
}
