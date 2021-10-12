package com.ilfidev.Classes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class OpenFile {

    private String path;
    private int width;
    private int height;
    private BufferedImage image;
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public OpenFile(String path) throws IOException {
        image = ImageIO.read(new File(path));
        this.path = path;
        this.width = image.getWidth();
        this.height = image.getHeight();
    }
    public void readFile() throws IOException {

        int[][] array2D = new int[width][height];
        for (int xPixel = 0; xPixel < width; xPixel++) {
            for (int yPixel = 0; yPixel < height; yPixel++) {
                int color = image.getRGB(xPixel, yPixel);
                if (color == Color.BLACK.getRGB()) {
                    array2D[xPixel][yPixel] = 1;
                } else {
                    array2D[xPixel][yPixel] = 0; // ?
                }
            }
        }
        for (int xPixel = 0; xPixel < width; xPixel++) {
            for (int yPixel = 0; yPixel < height; yPixel++) {
                System.out.print (array2D[xPixel][yPixel]);
            }
            System.out.println("");
        }
    }

}
