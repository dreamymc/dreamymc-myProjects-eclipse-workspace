package com.finalProject;
import java.io.*;
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;


public class qweqwe {

	public static void main(String[] args) throws InterruptedException {
		
		Date date = new Date();
		SimpleDateFormat h = new SimpleDateFormat("HH");
		SimpleDateFormat m = new SimpleDateFormat("mm");
		SimpleDateFormat s = new SimpleDateFormat("ss");
		String hourS = h.format(date);
		String minuteS = m.format(date);
		int minute = Integer.parseInt(minuteS);
		int hour = Integer.parseInt(hourS);
		if (hour >= 13)
			System.out.printf("Current Time is: %02d:%02d PM", (hour - 12), minute);
		else
			System.out.printf("Current Time is: %02d:%02d AM", hour, minute, s.format(date));
		
		if ((hour >=13) && (minute >=30)) {
			JOptionPane.showMessageDialog(null, "Can you get out!");
		}
		while(true) {
			Thread.sleep(1000);
			if ((hour >=13) && (minute ==23)) {
				JOptionPane.showMessageDialog(null, "Can you get out!");
			}
		}

	}

}
