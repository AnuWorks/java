/*Let's play! You have to return which player won! In case of a draw return Draw!.

Examples(Input1, Input2 --> Output):

        "scissors", "paper" --> "Player 1 won!"
        "scissors", "rock" --> "Player 2 won!"
        "paper", "paper" --> "Draw!"*/

public static void main(String[] args) {
    System.out.println(rps("scissors", "rock"));
    System.out.println(rockPaperScissors("rock", "scissors"));
}

public static String rps(String p1, String p2) {
    if (p1.equals(p2)) {
        return "Draw!";
    }
    if ((p1.equals("scissors") && p2.equals("paper")) ||
            (p1.equals("rock") && p2.equals("scissors")) ||
            (p1.equals("paper") && p2.equals("rock"))) {
        return "Player 1 won!";
    }
    return "Player 2 won!";
}

public static String rockPaperScissors(String p1, String p2){
    Map<String, String> rps = new HashMap<>();
    rps.put("scissors", "paper");
    rps.put("rock", "scissors");
    rps.put("paper", "rock");

    if (p1.equals(p2)) {
        return "Draw!";
    }

    return rps.get(p1).equals(p2) ? "Player 1 won!" :  "Player 2 won!";
}

