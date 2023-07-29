package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv implements ActionListener{
		int number = 0;
		JButton button1 = new JButton();
		JPanel panel1 = new JPanel();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JFrame showButton = new JFrame("cuteTV");

		public void showButton() {
			System.out.println("Button clicked");

			showButton.setVisible(true);

			showButton.add(panel1);
			panel1.add(button1);
			showButton.pack();
			button1.addActionListener(this);

			panel1.add(button2);
			showButton.pack();
			button2.addActionListener(this);

			panel1.add(button3);
			showButton.pack();
			button3.addActionListener(this);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton pressed1 = (JButton) e.getSource();
			if (pressed1 == button1) {
				showDucks();
			}
			JButton pressed2 = (JButton) e.getSource();
			if (pressed2 == button2) {
				showFrog();
			}
			JButton pressed3 = (JButton) e.getSource();
			if (pressed3 == button3) {
				showFluffyUnicorns();
			}

		}
		void showDucks() {
		     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}

		void showFrog() {
		     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}

		void showFluffyUnicorns() {
		     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}

		void playVideo(String videoID) {
		     
		     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
		     //work on some Linux implementations 
		     try {
		     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
		     if (Runtime.getRuntime().exec(new String[] { 
		      "which", "xdg- open" }).getInputStream().read() != -1) {
		     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
		     }
		     } else {
		          URI uri = new URI(videoID);
		          java.awt.Desktop.getDesktop().browse(uri);
		     }      } catch (Exception e) {
		          e.printStackTrace();
		     }
		}

		
		
		
		
		
		
		
	}


