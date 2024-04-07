package main;

public class DumbNN extends NeuralNetwork{
    private int numOuts;
    public DumbNN(int outs) {  super(1,1);  numOuts = outs;  }
    public double[] compute() {
        return compute(null, 0, 1);
    }
    public double[] compute(double inputs[], double minOut, double maxOut) {
        double[] results = new double[numOuts];
        for (int i = 0; i < results.length; i += 1) {
            results[i] = ((Math.random() * (maxOut - minOut)) + minOut);
            System.out.println(results[i]);
        }
        return results;
    }
    public String toString() {  return toString(0);  }
    public String toString(int numSpacesIndented) {
        String prefix = "";
        if (numSpacesIndented > 0) {
            prefix = String.format("%" + numSpacesIndented + "s", prefix);
        }
        String output = "";

        output += prefix + "<DumbNN>\n  " + prefix;
        output += "<numOuts>" + numOuts + "</numOuts>\n  " + prefix;
        output += "<numInputNodes>" + numInputNodes + "</numInputNodes>\n  " + prefix;
        output += "<numLayers>" + numLayers + "</numLayers>\n  " + prefix;
        output += "<innerLayers>";
        for (InnerLayer layer : innerLayers) {
            output += "\n" + layer.toString(numSpacesIndented + 4);
        }
        output += "\n  " + prefix + "</innerLayers>\n" + prefix + "</DumbNN>";
        return output;
    }
}
