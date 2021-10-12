package com.ilfidev;

import com.ilfidev.Classes.OpenFile;
import com.ilfidev.Classes.Window;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        OpenFile of = new OpenFile("Test.bmp");
        new Window();
        of.readFile();
    }
}
