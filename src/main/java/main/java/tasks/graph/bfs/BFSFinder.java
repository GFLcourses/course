package main.java.tasks.graph.bfs;

import main.java.tasks.graph.utils.Point;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

import static main.java.tasks.graph.utils.Constants.BACK_DIFF;
import static main.java.tasks.graph.utils.Constants.GARB_SIZE;

public class BFSFinder {
    private static int sizeOfOne;
    private final Color backCol;

    public BFSFinder(Color backCol) {
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
                    findBFS(i, j, isChecked, colours);
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

    private void findBFS(int i, int j, boolean[][] isChecked, Color[][] colours) {
        //create a queue for BFS algorithm */
        Queue<main.java.tasks.graph.utils.Point> queue = new LinkedList<>();
        //Point with coordinates
        queue.add(new main.java.tasks.graph.utils.Point(i, j));
        while (!queue.isEmpty()) {
            main.java.tasks.graph.utils.Point newPoint = queue.poll();
            sizeOfOne++;
            for (int k = newPoint.getRow() - 1; k < newPoint.getRow() + 2; k++) {
                for (int l = newPoint.getCol() - 1; l < newPoint.getCol() + 2; l++) {
                    if (k >= 0 && k <= colours.length - 1 && l >= 0 && l <= colours[0].length - 1) {
                        if (isSilhouette(colours[k][l]) && !isChecked[k][l]) {
                            isChecked[k][l] = true;
                            queue.add(new Point(k, l));
                        } else {
                            isChecked[k][l] = true;
                        }
                    }
                }
            }
        }
    }

    private boolean isSilhouette(Color color) {
        return !(color.getRed() > backCol.getRed() - BACK_DIFF) || !(color.getRed() < backCol.getRed() + BACK_DIFF) ||
                !(color.getGreen() > backCol.getGreen() - BACK_DIFF) || !(color.getGreen() < backCol.getGreen() + BACK_DIFF) ||
                !(color.getBlue() > backCol.getBlue() - BACK_DIFF) || !(color.getBlue() < backCol.getBlue() + BACK_DIFF);
    }
}
