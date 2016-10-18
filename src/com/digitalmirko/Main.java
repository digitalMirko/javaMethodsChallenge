package com.digitalmirko;

/**
 Java - Methods Exercise
 Create a method called displayHighScorePosition
 it should have a players name as a parameter, and a 2nd parameter as a position in the high score table
 You should display the players name along with a message like " managed to get into position " and the
 position they got and a further message " on the high score table".

 Create a 2nd method called calculateHighScorePosition
 it should be sent one argument only, the player score
 it should return an int
 the return data should be
 1 if the score is > 1000
 2 if the score is > 500 and < 1000
 3 if the score is > 100 and < 500
 4 in all the other cases
 call both methods and display the results of the following
 a score of 1500, 900, 400, and 50
 */

public class Main {

    public static void main(String[] args) {

        System.out.println(displayHighScorePosition("Johnny",calculateHighScorePosition(1500)));
        System.out.println(displayHighScorePosition("David",calculateHighScorePosition(900)));
        System.out.println(displayHighScorePosition("Jan",calculateHighScorePosition(400)));
        System.out.println(displayHighScorePosition("Wilma",calculateHighScorePosition(50)));
    }

    public static String displayHighScorePosition(String playersName, int highScore){
        return playersName + " managed to get into position " + highScore + " on the high score table";
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if(playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }

}