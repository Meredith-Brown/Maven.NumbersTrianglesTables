package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String subOutput = "";
        StringBuilder outputBuilder = new StringBuilder();
        for(int i = 1; i <= numberOfRows; i++) {
            subOutput += "*";
            outputBuilder.append(subOutput);
            outputBuilder.append("\n");
        }
        String finalOutput = outputBuilder.toString();
        return finalOutput;
    }

    public static String getRow(int numberOfStars) {
        String output = "";
        for (int i = 1; i <= numberOfStars; i++) {
            output += "*";
        }
        return output;
    }

    public static String getSmallTriangle() {
        String subOutput = "";
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 1; i <= 4; i++) {
            subOutput += "*";
            outputBuilder.append(subOutput);
            outputBuilder.append("\n");
        }
        String finalOutput = outputBuilder.toString();
        return finalOutput;
    }

    public static String getLargeTriangle() {
        String subOutput = "";
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            subOutput += "*";
            outputBuilder.append(subOutput);
            outputBuilder.append("\n");
        }
        String finalOutput = outputBuilder.toString();
        return finalOutput;
    }
}
