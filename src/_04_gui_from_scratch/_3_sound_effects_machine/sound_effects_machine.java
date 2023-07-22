package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound_effects_machine implements ActionListener{
	int number=0;
	public void showButton() {
		System.out.println("Button clicked");
        JFrame showButton= new JFrame("sound");
        showButton.setVisible(true);
        JButton button1 = new JButton();
        JPanel panel1 = new JPanel();
        showButton.add(panel1);
        panel1.add(button1);
        showButton.pack();
        button1.addActionListener(this);
       
        JButton button2 = new JButton();
        JPanel panel2 = new JPanel();
        showButton.add(panel2);
        panel2.add(button2);
        showButton.pack();
        button2.addActionListener(this);
        
        JButton button3 = new JButton();
        JPanel panel3 = new JPanel();
        showButton.add(panel3);
        panel3.add(button3);
        showButton.pack();
        button3.addActionListener(this);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
}
