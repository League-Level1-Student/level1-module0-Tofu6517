package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

	public class FortuneCookie implements ActionListener {
        public void showButton() {
            System.out.println("Button clicked");
            JFrame showButton= new JFrame();
            showButton.setVisible(true);
            JButton button = new JButton();
            showButton.add(button);
            showButton.pack();
            button.addActionListener(this);

            
       }
     public void actionPerformed() {
    	 int rand = new Random().nextInt(5);
    	 if(rand==1) {
    		 
    	 }
    	 else if(rand==2) {
    		 
    	 }
    	 else if(rand==3) {
    
    	 }
    	 else if(rand==4) {
	 
    	 }

    	 
     }
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		
	}
    }







