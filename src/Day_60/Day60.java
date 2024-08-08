package Day_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day60 {
    public static void main(String[] args) {
        Day60 day60 = new Day60();
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        int[][] result = day60.spiralMatrixIII(rows, cols, rStart, cStart);
        for (int[] res : result) {
            System.out.print("[" + res[0] + ", " + res[1] + "] ");
        }
    }
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] result = new int[rows * cols][2];
        int steps = 0, d = 0, len = 0;
        result[0] = new int[]{rStart, cStart};
        int count = 1;
        while (count < rows * cols) {
            if (d == 0 || d == 2) steps++;
            for (int i = 0; i < steps; i++) {
                rStart += directions[d][0];
                cStart += directions[d][1];
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    result[count++] = new int[]{rStart, cStart};
                }
                if (count == rows * cols) return result;
            }
            d = (d + 1) % 4;
        }
        return result;
    }
}
