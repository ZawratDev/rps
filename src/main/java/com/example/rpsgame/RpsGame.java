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

            playerChoice = scanner.nextLine();

            playerChoice = playerChoice.toLowerCase();
            String cpuChoiceString;
            cpuChoice = (int)(Math.random() * 3) + 1;



            if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {

                cpuChoiceString = cpuGamePlay(cpuChoice);
                System.out.println("Computer choice: " + cpuChoiceString);

                switch (playerChoice) {
                    case "rock" -> {
                        System.out.println("You have chosen a rock!");
                        playerResult++;
                        System.out.println(playerResult);
                    }
                    case "paper" -> {
                        System.out.println("You have chosen a paper!");
                        playerResult++;
                        System.out.println(playerResult);
                    }
                    case "scissors" -> {
                        System.out.println("You have chosen a scissors!");
                        playerResult++;
                        System.out.println(playerResult);
                    }
                    default -> System.out.println("What do you mean? Please choose between rock, paper or scissors!");
                }
            }
            else {
                System.out.println("What do you mean? Please choose between rock, paper or scissors!");
                i--;
            }
        }
            cpuChoice = (int)(Math.random() * 3) + 1;



//


    }

    private static String cpuGamePlay(int cpuChoice) {
        String cpuChoiceString;
        switch (cpuChoice) {
            case 1 -> {
                cpuChoiceString = "rock";
                return cpuChoiceString;
            }
            case 2 -> {
                cpuChoiceString = "paper";
                return cpuChoiceString;
            }
            case 3 -> {
                cpuChoiceString = "scissors";
                return cpuChoiceString;
            }
            default -> {
                cpuChoiceString = "Error - unacceptable computer choice";
                return cpuChoiceString;
            }
        }
    }
}
