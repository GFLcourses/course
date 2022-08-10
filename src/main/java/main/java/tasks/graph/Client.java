package main.java.tasks.graph;

import main.java.tasks.graph.bfs.BFSFinder;
import main.java.tasks.graph.dfs.DFSSFinder;
import main.java.tasks.graph.utils.BackgroundMaker;
import main.java.tasks.graph.utils.ImageReader;

import java.awt.*;

import static main.java.tasks.graph.utils.Constants.DEFAULT_PATH;

//VM Options=-Xss64M (because of recursion)

public class Client {
    public static void main(String[] args) {
        System.out.println("Finding silhouettes in image: " + DEFAULT_PATH);

        Color[][] colours = new ImageReader(DEFAULT_PATH).loadImage();

        BackgroundMaker backgroundMaker = new BackgroundMaker(colours);
        Color backCol = backgroundMaker.getBackgroundColor();

        int totalSizeOfFigures = backgroundMaker.getTotalSizeOfFigure();

        BFSFinder bfsFinder = new BFSFinder(backCol);
        DFSSFinder dfsFinder = new DFSSFinder(backCol);

        System.out.println("Amount of silhouettes finding by BFS algorithm is: " + bfsFinder.countSilhouettes(colours, totalSizeOfFigures));
        System.out.println("Amount of silhouettes finding by DFS algorithm is: " + dfsFinder.countSilhouettes(colours, totalSizeOfFigures));
    }


}
