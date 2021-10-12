package com.ilfidev.Classes;
import com.ilfidev.Classes.*;
import javax.swing.*;
import java.io.IOException;

public class Window extends JFrame {
    private OpenFile file = new OpenFile("Test.bmp");

    public Window() throws IOException {

        super("window");
        setSize(file.getWidth(),file.getHeight());
        setVisible(true);

    }
}
