package main.java.tasks.graph.utils;

import java.awt.*;

import static main.java.tasks.graph.utils.Constants.BACK_DIFF;

public class BackgroundMaker {
    Color[][] colours;
    Color averageBackgroundColor;
    int totalSizeOfFigures;

    public BackgroundMaker(Color[][] colours) {
        this.colours = colours;
        this.averageBackgroundColor = getBackgroundColor();
        this.totalSizeOfFigures = 0;
    }

    public int getTotalSizeOfFigure() {
        return totalSizeOfFigures;
    }

    public Color getBackgroundColor() {
        int blackCounter = 0;
        int whiteCounter = 0;

        // horizontal border
        for (Color[] colour : colours) {
            if (colour[0].getRed() < BACK_DIFF && colour[0].getGreen() < BACK_DIFF
                    && colour[0].getBlue() < BACK_DIFF) {
                blackCounter++;
            } else {
                whiteCounter++;
            }

            if (colour[colours[0].length - 1].getRed() < BACK_DIFF
                    && colour[colours[0].length - 1].getGreen() < BACK_DIFF
                    && colour[colours[0].length - 1].getBlue() < BACK_DIFF) {
                blackCounter++;
            } else {
                whiteCounter++;
            }
        }

        // vertical border
        for (int i = 0; i < colours[0].length; i++) {
            if (colours[0][i].getRed() < BACK_DIFF && colours[0][i].getGreen() < BACK_DIFF
                    && colours[0][i].getBlue() < BACK_DIFF) {
                blackCounter++;
            } else {
                whiteCounter++;
            }

            if (colours[colours.length - 1][i].getRed() < BACK_DIFF
                    && colours[colours.length - 1][i].getGreen() < BACK_DIFF
                    && colours[colours.length - 1][i].getBlue() < BACK_DIFF) {
                blackCounter++;
            } else {
                whiteCounter++;
            }
        }
        //return background color colour
        return whiteCounter > blackCounter ? new Color(255, 255, 255) : new Color(0, 0, 0);
    }
}
