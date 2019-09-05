package com.javarush.task.OlimpicGames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.image.BufferedImage;

public class Task3_1 extends WindowAdapter  {//implements ActionListener
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocation(100, 100);
        frame.setSize(new Dimension(480, 480));
        frame.setVisible(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int maxX = screenSize.width - 50;
        int maxY = screenSize.height - 50;
    }
}