package main;

import java.io.*;

public class AIGameRunner {
    private static NNAI ai = new NNAI(25,100,.3,.2,.7,.09,new ComputerGuessingGameScorer(0,100),2,5,5,5,1);
    private static Game game = new TestIntelligentComputerPlay();
    public static void main(String[] args) {
        final int NUM_GENS_TO_TRY = 50;
        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        }));
        for (int i = 0; i < NUM_GENS_TO_TRY; i += 1) {
            runGeneration();
        }
        System.setOut(System.out);
    }
    public static void runGeneration() {
        ai.testGeneration(game);
        String outputFilePath = "C:\\Users\\coley\\OneDrive\\Desktop\\ExampleAIXMLs\\gen" + ai.getCurrGen() + ".xml";
        File outputFile = new File(outputFilePath);
        try {
            PrintWriter writer = new PrintWriter(outputFile);
            writer.write(ai.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failed to open file to write to");
        }
        ai.evolveGeneration();
    }
}
