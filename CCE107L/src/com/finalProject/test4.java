package com.finalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test4 {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JComboBox cbYears, cbMonth, cbDays, cbGender;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test4 window = new test4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setName("MIKEL B");
		frame.setResizable(false);
		frame.setBounds(100, 100, 520, 313);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tf1 = new JTextField();
		tf1.setBounds(10, 46, 236, 37);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);

		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(10, 114, 236, 37);
		frame.getContentPane().add(tf2);

		String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" };
		cbMonth = new JComboBox(month);
		cbMonth.setBounds(10, 181, 46, 21);
		frame.getContentPane().add(cbMonth);

		Integer[] years = { 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994,
				1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011,
				2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023 };
		cbYears = new JComboBox(years);
		cbYears.setBounds(121, 181, 56, 21);
		frame.getContentPane().add(cbYears);

		JLabel lblFirst = new JLabel("First Name");
		lblFirst.setBounds(10, 23, 61, 13);
		frame.getContentPane().add(lblFirst);

		JLabel LblLast = new JLabel("Last Name");
		LblLast.setBounds(10, 93, 61, 13);
		frame.getContentPane().add(LblLast);

		Integer[] age = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31 };
		cbDays = new JComboBox(age);
		cbDays.setBounds(65, 181, 46, 21);
		frame.getContentPane().add(cbDays);

		JLabel lblNewLabel = new JLabel("Month");
		lblNewLabel.setBounds(10, 168, 45, 13);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(66, 168, 45, 13);
		frame.getContentPane().add(lblDay);

		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(121, 168, 56, 13);
		frame.getContentPane().add(lblYear);

		JTable table = new JTable();
		table.setFillsViewportHeight(true);
		table.setToolTipText("");
		table.setBounds(257, 10, 226, 256);
		frame.getContentPane().add(table);

		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("Name");
		dtm.addColumn("Birthdate");
		dtm.addColumn("Gender");
		table.setModel(dtm);
		dtm.addRow(new Object[] { "Name", "Birthdate", "Gender"});

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = tf1.getText();
				String lastName = tf2.getText();
				String month = (String) cbMonth.getSelectedItem();
				int day = (int) cbDays.getSelectedItem();
				int year = (int) cbYears.getSelectedItem();
				String gender = (String) cbGender.getSelectedItem();

				String name = firstName + " " + lastName;
				String birthdate = month + "/" + day + "/" + year;
				dtm.addRow(new Object[] { name, birthdate, gender });
			}
		});

		btnSubmit.setBounds(71, 236, 85, 21);
		frame.getContentPane().add(btnSubmit);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(190, 168, 56, 13);
		frame.getContentPane().add(lblGender);

		String[] gender = { "Male", "Female", "Other" };
		cbGender = new JComboBox(gender);
		cbGender.setBounds(187, 181, 59, 21);
		frame.getContentPane().add(cbGender);
	}

}
