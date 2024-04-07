package main;

import java.util.ArrayList;
import java.util.List;

public class GameResultsImpl implements GameResults{
    public enum Result {
        //indicates how player should adjust guesses to get closer to answer
        HIGHER,
        LOWER,
        CORRECT;
        public String toString() {
            String output = "<Result>";
            if (this == HIGHER) {
                output += "HIGHER";
            }
            else if (this == LOWER) {
                output += "LOWER";
            }
            else {
                output += "CORRECT";
            }
            output += "</Result>";
            return output;
        }
    }
    protected boolean wonGame = false;
    protected int numMovesUsed = -1;
    protected List<GameMoves> moves = null;
    public GameResultsImpl() {
        moves = new ArrayList<GameMoves>();
    }
    public String toString() {  return toString(0);  }
    @Override
    public String toString(int numSpacesIndented) {
        String prefix = "";
        if (numSpacesIndented > 0) {
            prefix = String.format("%" + numSpacesIndented + "s", prefix);
        }
        String output = "";
        output += prefix + "<GameResults>\n  " + prefix;
        output += "<wonGame>" + wonGame + "</wonGame>\n  " + prefix;
        output += "<numMovesUsed>" + numMovesUsed + "</numMovesUsed>";
        for (int i = 0; i < moves.size(); i += 1) {
            output += "\n" + moves.get(i).toString(numSpacesIndented + 2);
        }
        output += "\n" + prefix + "</GameResults>";
        return output;
    }
}
