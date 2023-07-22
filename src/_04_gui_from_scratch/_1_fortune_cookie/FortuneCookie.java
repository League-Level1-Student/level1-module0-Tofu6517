package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
        

	@Override
	public void actionPerformed(ActionEvent arg0) {
		 JOptionPane.showMessageDialog(null,"woohoo");
    	 int rand = new Random().nextInt(5);
    	
    	 if(rand==0) {
    		 JOptionPane.showMessageDialog(null,"L");
    	 }
    	 else if(rand==1) {
    		 JOptionPane.showMessageDialog(null,"LL");
    	 }
    	 else if(rand==2) {
    		 JOptionPane.showMessageDialog(null,"LLL");
    	 }
    	 else if(rand==3) {
    		 JOptionPane.showMessageDialog(null,"LLLL");
    	 }
    	 else if(rand==4) {
    		 JOptionPane.showMessageDialog(null,"LLLLL");
		
	}
	}
	}







