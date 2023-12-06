import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Clock extends JFrame implements Runnable {

	private JPanel contentPane;
	JLabel Time_0 = new JLabel("New label");
	JLabel Time_1 = new JLabel("New label");
	JLabel Time_2 = new JLabel("New label");
	JLabel Time_3 = new JLabel("New label");
	JLabel Time_4 = new JLabel("New label");
	JLabel Time_5 = new JLabel("New label");
	JLabel Time_6 = new JLabel("New label");
	JLabel Time_7 = new JLabel("New label");
	JLabel Time_8 = new JLabel("New label");
	JLabel Time_9 = new JLabel("New label");
	int hour, second, minute;
	JLabel Time_10 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clock frame = new Clock();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Clock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Time_0.setBounds(10, 11, 414, 30);
		contentPane.add(Time_0);
		
		
		Time_1.setBounds(10, 52, 414, 30);
		contentPane.add(Time_1);
		
		
		Time_2.setBounds(10, 91, 414, 30);
		contentPane.add(Time_2);
		
		
		Time_3.setBounds(10, 132, 414, 30);
		contentPane.add(Time_3);
		
		
		Time_4.setBounds(10, 173, 414, 30);
		contentPane.add(Time_4);
		
		
		Time_5.setBounds(10, 214, 414, 30);
		contentPane.add(Time_5);
		
		
		Time_6.setBounds(10, 255, 414, 30);
		contentPane.add(Time_6);
		
		
		Time_7.setBounds(10, 296, 414, 30);
		contentPane.add(Time_7);
		
		
		Time_8.setBounds(10, 337, 414, 30);
		contentPane.add(Time_8);
		
		
		Time_9.setBounds(10, 378, 414, 30);
		contentPane.add(Time_9);
		
		Time_10.setBounds(10, 419, 414, 30);
		contentPane.add(Time_10);
		
        Thread thread = new Thread(this);
        thread.start();
	}
	
	public void run() {
        while (true) {
            Calendar calendar = Calendar.getInstance();
            hour = calendar.get(Calendar.HOUR_OF_DAY);
            minute = calendar.get(Calendar.MINUTE);
            second = calendar.get(Calendar.SECOND);

            Date date = calendar.getTime();
            SimpleDateFormat TF_0 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
            String time0 = TF_0.format(date);
            Time_0.setText(time0);
            
            SimpleDateFormat TF_1 = new SimpleDateFormat("EEE, MMM d, yyyy");
            String time1 = TF_1.format(date);
            Time_1.setText(time1);
            
            SimpleDateFormat TF_2 = new SimpleDateFormat("h:mm a");
            String time2 = TF_2.format(date);
            Time_2.setText(time2);
            
            SimpleDateFormat TF_3 = new SimpleDateFormat("hh 'o''clock' a, zzzz");
            String time3 = TF_3.format(date);
            Time_3.setText(time3);
            
            SimpleDateFormat TF_4 = new SimpleDateFormat("K:mm a, z");
            String time4 = TF_4.format(date);
            Time_4.setText(time4);
            
            SimpleDateFormat TF_5 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
            String time5 = TF_5.format(date);
            Time_5.setText(time5);
            
            SimpleDateFormat TF_6 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
            String time6 = TF_6.format(date);
            Time_6.setText(time6);
            
            SimpleDateFormat TF_7 = new SimpleDateFormat("yyMMddHHmmssZ");
            String time7 = TF_7.format(date);
            Time_7.setText(time7);
            
            SimpleDateFormat TF_8 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            String time8 = TF_8.format(date);
            Time_8.setText(time8);
            
            SimpleDateFormat TF_9 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            String time9 = TF_9.format(date);
            Time_9.setText(time9);
            
            SimpleDateFormat TF_10 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            String time10 = TF_10.format(date);
            Time_10.setText(time10);
            
        }
    }
}
