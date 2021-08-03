package comboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ComboBox extends JFrame implements ActionListener{
	JComboBox<String> cb = new JComboBox<String>();
	JOptionPane p = new JOptionPane();	
	JButton b = new JButton("Done");
	
	public ComboBox() {
		//Layout
		setLayout(new FlowLayout());
		
		//Combo Box
		add(cb);
		cb.addItem("Select your country");
		cb.addItem("Brasil");
		cb.addItem("Argentina");
		cb.addItem("Paraguai");
		cb.addItem("Uruguai");
		
		//Button
		add(b);
		b.addActionListener(this);
		
		//Window
		setTitle("Combo Box");
		setSize(400,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		//Set Visible
		setVisible(true);
		
		System.out.println(cb.getSelectedIndex());
	}
	
	public static void main(String[] args) {
		new ComboBox();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(cb.getSelectedIndex()==0 && e.getSource()==b) {
			p.showMessageDialog(null, "Select a Contry!");
		}else {
			p.showMessageDialog(null, "ok");
		}
		
	}
}
