package View;
import java.awt.Font;

import javax.swing.*;

public class Home extends JFrame{
	Home(){
		setVisible(true);
		setSize(800, 500);
		setTitle("Gestao de lojas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		JButton btn = new JButton("click hire");
		btn.setBounds(100, 100, 100, 70);
		btn.setFont(new Font("Arial", Font.ITALIC, 16));
		add(btn);
		
	}
	
	
	
	
}
