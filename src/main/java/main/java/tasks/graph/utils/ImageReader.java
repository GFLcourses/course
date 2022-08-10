package main.java.tasks.graph.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader {

    String filepath;

    public ImageReader(String filepath) {
        this.filepath = filepath;
    }

    public Color[][] loadImage() {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(this.filepath));
        } catch (NullPointerException | IOException e) {
            System.err.println("There is mistake in file path");
        }
        return makeColourArray(image);
    }

    private Color[][] makeColourArray(BufferedImage image) {
        int height = image.getHeight();
        int width = image.getWidth();
        Color[][] colours = new Color[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int alpha = (image.getRGB(i, j) >> 24) & 0xff;
                int red   = (image.getRGB(i, j) >> 16) & 0xff;
                int green = (image.getRGB(i, j) >>  8) & 0xff;
                int blue  = (image.getRGB(i, j)      ) & 0xff;
                colours[i][j] = new Color(red, green, blue, alpha);
            }
        }
        return colours;
    }
}
