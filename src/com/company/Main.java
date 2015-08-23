package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame("Block Breaker");
        BlockBreakerPanel panel = new BlockBreakerPanel();
        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(490,600);
        frame.setResizable(false);

    }
}
