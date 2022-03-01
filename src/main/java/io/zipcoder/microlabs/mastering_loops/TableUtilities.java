package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int tableSize = 5;
        return getMultiplicationTable(tableSize);
    }

    public static String getLargeMultiplicationTable() {
        int tableSize = 10;
        return getMultiplicationTable(tableSize);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder output = new StringBuilder();
        for(int w = 1; w <= tableSize; w++) {
            for(int h = 1; h <= tableSize; h++) {
                output.append(String.format("%3d", w * h));
                output.append(" |");
    }
            output.append("\n");
}
        String table = output.toString();
        return table;
    }
}
