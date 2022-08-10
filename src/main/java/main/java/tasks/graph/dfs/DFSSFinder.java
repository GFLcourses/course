package main.java.tasks.graph.dfs;

import java.awt.*;

import static main.java.tasks.graph.utils.Constants.BACK_DIFF;
import static main.java.tasks.graph.utils.Constants.GARB_SIZE;

public class DFSSFinder {
    private static int sizeOfOne;
    private final Color backCol;

    public DFSSFinder(Color backCol) {
        sizeOfOne = 0;
        this.backCol = backCol;
    }

    public int countSilhouettes(Color[][] colours, int totalSizeOfFigure) {
        //amount of silhouettes
        int silhouetteCounter = 0;
        //boolean array with checked pixels
        boolean[][] isChecked = new boolean[colours.length][colours[0].length];
        for (int i = 0; i < colours.length; i++) {
            for (int j = 0; j < colours[0].length; j++) {
                if (isSilhouette(colours[i][j]) && !isChecked[i][j]) {
                    findDFS(i, j, isChecked, colours);
                }
                //check if silhouette is not a garbage
                if (sizeOfOne * 100.0 / totalSizeOfFigure > GARB_SIZE) {
                    silhouetteCounter++;
                    sizeOfOne = 0;
                }
            }
        }
        return silhouetteCounter;
    }

    private void findDFS(int i, int j, boolean[][] isChecked, Color[][] colours) {
        sizeOfOne++;
        isChecked[i][j] = true;
        // check left pixel
        if (j - 1 > 0 && isSilhouette(colours[i][j - 1]) && !isChecked[i][j - 1]) {
            findDFS((i), (j - 1), isChecked, colours);
        }
        // check down pixel
        if (i + 1 < colours.length && isSilhouette(colours[i + 1][j]) && !isChecked[i + 1][j]) {
            findDFS((i + 1), (j), isChecked, colours);
        }
        // checking right pixel
        if (j + 1 < colours[i].length && isSilhouette(colours[i][j + 1]) && !isChecked[i][j + 1]) {
            findDFS((i), (j + 1), isChecked, colours);
        }
        // checking up pixel
        if (i - 1 > 0 && isSilhouette(colours[i - 1][j]) && !isChecked[i - 1][j]) {
            findDFS((i - 1), (j), isChecked, colours);
        }
    }

    private boolean isSilhouette(Color color) {
        return !(color.getRed() > backCol.getRed() - BACK_DIFF) || !(color.getRed() < backCol.getRed() + BACK_DIFF) ||
                !(color.getGreen() > backCol.getGreen() - BACK_DIFF) || !(color.getGreen() < backCol.getGreen() + BACK_DIFF) ||
                !(color.getBlue() > backCol.getBlue() - BACK_DIFF) || !(color.getBlue() < backCol.getBlue() + BACK_DIFF);
    }
}
