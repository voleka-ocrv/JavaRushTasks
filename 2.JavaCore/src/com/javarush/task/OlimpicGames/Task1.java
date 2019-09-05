package com.javarush.task.OlimpicGames;
import javax.swing.JOptionPane;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndNumber1 = rnd.nextInt(50);
        int rndNumber2 = rnd.nextInt(50);
        System.out.print(rnd.ints(1, 50));
        String first_name;
        first_name = JOptionPane.showInputDialog("How much is " + rndNumber1 + " + " + rndNumber2 + "?");
        if ((rndNumber1 + rndNumber2) == Integer.parseInt(first_name)) {
            JOptionPane.showMessageDialog(null, "Correct!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Wrong!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
