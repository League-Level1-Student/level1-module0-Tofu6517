package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound_effects_machine implements ActionListener{
	int number=0;
	 JButton button1 = new JButton();
     JPanel panel1 = new JPanel();
     JButton button2 = new JButton();
     JPanel panel2 = new JPanel();
	public void showButton() {
		System.out.println("Button clicked");
        JFrame showButton= new JFrame("sound");
        showButton.setVisible(true);
       
        showButton.add(panel1);
        panel1.add(button1);
        showButton.pack();
        button1.addActionListener(this);
      
        showButton.add(panel2);
        panel2.add(button2);
        showButton.pack();
        button2.addActionListener(this);
        
   
  }

	@Override
	public void actionPerformed(ActionEvent e) {
	JButton pressed= (JButton)e.getSource();
		if(pressed==button1){
			playSound("sawing-wood-daniel-simon.wav");
	}
		JButton pressed2= (JButton)e.getSource();
		if(pressed2==button2){
			playSound("");
	}
		
	}
	
	
	
	
	private void playSound(String soundFile) {
		String path = "src/_03_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
    
	
	
	
	
	
}
