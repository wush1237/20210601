package com.Car;

import javax.swing.*;

public class CarDemo {
    private JPanel mainPanel;
    private JPanel northPanel;
    private JButton button1;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }
}

