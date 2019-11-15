package interfacciaGrafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Proxy;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pattern.*;

public class Pannello extends JPanel{
	
	Accesso ac;
	
	boolean datiInviati;
	
	public Pannello() {
		super();
		
		datiInviati = false;
		
		ac = new AccessoProxy();
		
		this.setLayout(null);
		
		this.setBackground(Color.lightGray);
		
		JLabel lblNome = new JLabel("Nome :");
        lblNome.setBounds(120, 35, 200, 14);
        this.add(lblNome);
        
		JTextField nomeText = new JTextField();
		nomeText.setBounds(250, 31, 150, 20);
		nomeText.setColumns(10);
        this.add(nomeText);
        
        JLabel lblCognome = new JLabel("Cognome :");
        lblCognome.setBounds(120, 85, 200, 14);
        this.add(lblCognome);
        
		JTextField cognomeText = new JTextField();
		cognomeText.setBounds(250, 81, 150, 20);
		cognomeText.setColumns(10);
        this.add(cognomeText);
        
        JLabel lblPass = new JLabel("Password :");
        lblPass.setBounds(120, 135, 200, 14);
        this.add(lblPass);
        
		JTextField passText = new JTextField();
		passText.setBounds(250, 131, 150, 20);
		passText.setColumns(10);
        this.add(passText);
        
        JButton invia = new JButton("Invia");
        invia.setBounds(250, 200, 90, 50);
        invia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ac.setNome(nomeText.getText());
				ac.setCognome(cognomeText.getText());
				ac.setPassword(passText.getText());
				ac.verificaAdmin();
				datiInviati = true;
		        repaint();
			}
		});
        this.add(invia);
        
		revalidate();
	}

	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		Graphics2D grafica2d = (Graphics2D) g;
		
		if (ac.getAdmin())
			grafica2d.drawImage(ac.getAdminImg(),500,200,this);
		else if (datiInviati)
			grafica2d.drawImage(ac.getUserImg(), 500, 200, this);
			
	}
}
