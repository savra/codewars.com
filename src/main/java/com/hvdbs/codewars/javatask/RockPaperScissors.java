package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Rock Paper Scissors!",
        url = "https://www.codewars.com/kata/5672a98bdbdd995fad00000f"
)
public class RockPaperScissors {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static String rps(String p1, String p2) {
        if ("scissors".equals(p1) && "paper".equals(p2)) {
            return "Player 1 won!";
        } else if ("rock".equals(p1) && "scissors".equals(p2)) {
            return "Player 1 won!";
        } else if ("paper".equals(p1) && "rock".equals(p2)) {
            return "Player 1 won!";
        } else if ("scissors".equals(p1) && "scissors".equals(p2)) {
            return "Draw!";
        } else if ("paper".equals(p1) && "paper".equals(p2)) {
            return "Draw!";
        } else if ("rock".equals(p1) && "rock".equals(p2)) {
            return "Draw!";
        } else {
            return "Player 2 won!";
        }
    }
}
