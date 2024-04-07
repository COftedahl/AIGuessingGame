package main;

public abstract class ScoringAlgorithm {
    protected double maxScore;
    protected double minScore;

    public double getMaxScore() {
        return maxScore;
    }
    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }
    public double getMinScore() {
        return minScore;
    }
    public void setMinScore(double minScore) {
        this.minScore = minScore;
    }
    public ScoringAlgorithm(int min, int max) {
        minScore = min;
        maxScore = max;
    }

    public abstract double scoreGame(GameResultsImpl results);
    public String toString() {  return toString(0);  }
    public abstract String toString(int numSpacesIndented);
}
