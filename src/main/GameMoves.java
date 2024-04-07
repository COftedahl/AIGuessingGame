package main;

public class GameMoves {
    private int guess;
    private GameResultsImpl.Result result;
    public GameMoves(int g, GameResultsImpl.Result r) {
        guess = g;
        result = r;
    }
    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public GameResultsImpl.Result getResult() {
        return result;
    }

    public void setResult(GameResultsImpl.Result result) {
        this.result = result;
    }
    public String toString() {  return toString(0);  }
    public String toString(int numSpacesIndented) {
        String prefix = "";
        if (numSpacesIndented > 0) {
            prefix = String.format("%" + numSpacesIndented + "s", prefix);
        }
        String output = "";
        output += prefix + "<GameMoves>\n  " + prefix;
        output += "<Guess>" + guess + "</Guess>\n  " + prefix;
        output += result.toString();
        output += "\n" + prefix + "</GameMoves>";

        return output;
    }
}
