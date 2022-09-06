package com.example.rpsgame;

import java.util.Scanner;

public class RpsGame {


    public static void main(String[] args) {

        byte playerResult = 0;

        byte cpuResult = 0;

        int cpuChoice;

        String playerChoice;

        Scanner scanner = new Scanner(System.in);


        for (byte i = 1; i <= 5; i++) {

            System.out.print("Choose your weapon (\"rock\", \"paper\" or \"scissors\") or type \"exit\": ");

            playerChoice = scanner.nextLine();

            playerChoice = playerChoice.trim();

            playerChoice = playerChoice.toLowerCase();

            if (playerChoice.equals("exit")) {

                System.out.println("Thank you for the game, see you later!");

                System.exit(0);
            }

            String cpuChoiceString;


            cpuChoice = (int)(Math.random() * 3) + 1;

            if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {

                cpuChoiceString = cpuGamePlay(cpuChoice);
                System.out.println("Computer choice: " + cpuChoiceString);

                if (playerChoice.equals(cpuChoiceString)) {
                    System.out.println(playerChoice + " vs " + cpuChoiceString + " - There is no winner!");
                    i--;
                }

                else if (playerChoice.equals("rock") && cpuChoiceString.equals("scissors")) {
                    System.out.println((playerChoice + " vs " + cpuChoiceString + " - You win!"));
                    playerResult++;
                }

                else if (playerChoice.equals("rock") && cpuChoiceString.equals("paper")) {
                    System.out.println((playerChoice + " vs " + cpuChoiceString + " - You loose!"));
                    cpuResult++;
                }

                else if (playerChoice.equals("paper") && cpuChoiceString.equals("rock")) {
                    System.out.println((playerChoice + " vs " + cpuChoiceString + " - You win!"));
                    playerResult++;
                }

                else if (playerChoice.equals("paper") && cpuChoiceString.equals("scissors")) {
                    System.out.println((playerChoice + " vs " + cpuChoiceString + " - You loose!"));
                    cpuResult++;
                }

                else if (playerChoice.equals("scissors") && cpuChoiceString.equals("paper")) {
                    System.out.println((playerChoice + " vs " + cpuChoiceString + " - You win!"));
                    playerResult++;
                }

                else if (playerChoice.equals("scissors") && cpuChoiceString.equals("rock")) {
                    System.out.println((playerChoice + " vs " + cpuChoiceString + " - You loose!"));
                    cpuResult++;
                }
            }
            else {
                System.out.println("What do you mean? Please choose between rock, paper or scissors!");
                i--;
            }
        }

        if (playerResult == cpuResult)
            System.out.println("It's a draw!\n" + "You: " + playerResult + " vs Computer: " + cpuResult);
        else if (playerResult > cpuResult)
            System.out.println("You won the game!\n" + "You: " + playerResult + " vs Computer: " + cpuResult);
        else
            System.out.println("You lost the game!\n" + "You: " + playerResult + " vs Computer: " + cpuResult);
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
                cpuChoiceString = "Error - unacceptable computer's choice";
                return cpuChoiceString;
            }
        }
        private static String showResult; {
            System.out.println("You: " + playerResult + " vs Computer: " + cpuResult);
        }
    }
}

