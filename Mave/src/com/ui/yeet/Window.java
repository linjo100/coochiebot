package com.ui.yeet;
import javax.swing.*;
import java.awt.*;

public class Window
{
	public static void gui()
	{
		JFrame frame = new JFrame("COOCHIE BOT");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(800, 800);
		
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args)
	{
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                gui();
            }
        });
	}
}
