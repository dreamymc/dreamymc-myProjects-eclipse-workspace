import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;

public class AnalogClock extends JPanel {
	int hour;
	int minute;
	int second;

	public AnalogClock() {
		setCurrentTime();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Draw clock face
		g.setColor(Color.black);
		g.drawOval(40, 40, 120, 120);
		g.drawString("12", 110, 60);
		g.drawString("9", 70, 110);
		g.drawString("3", 150, 110);
		g.drawString("6", 110, 140);

		// Draw hour hand
		int hourX = (int) (100 * Math.cos(hour * (2 * Math.PI / 12) - (Math.PI / 2)));
		int hourY = (int) (100 * Math.sin(hour * (2 * Math.PI / 12) - (Math.PI / 2)));
		g.drawLine(110, 110, 110 + hourX, 110 - hourY);

		// Draw minute hand
		int minuteX = (int) (90 * Math.cos(minute * (2 * Math.PI / 60) - (Math.PI / 2)));
		int minuteY = (int) (90 * Math.sin(minute * (2 * Math.PI / 60) - (Math.PI / 2)));
		g.drawLine(110, 110, 110 + minuteX, 110 - minuteY);

		// Draw second hand
		int secondX = (int) (80 * Math.cos(second * (2 * Math.PI / 60) - (Math.PI / 2)));
		int secondY = (int) (80 * Math.sin(second * (2 * Math.PI / 60) - (Math.PI / 2)));
		g.drawLine(110, 110, 110 + secondX, 110 - secondY);
	}

	public void setCurrentTime() {
		Calendar calendar = new GregorianCalendar();
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Analog Clock");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		AnalogClock clock = new AnalogClock();
		frame.add(clock);

		frame.setVisible(true);

		while (true) {
			clock.setCurrentTime();
			clock.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
