package espace_etudiant;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import guiElements.Button;
import login.Login;

public class Etudiant_GUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	static Button logout;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Etudiant_GUI frame = new Etudiant_GUI();
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
	public Etudiant_GUI() {
		setTitle("Espace Etudiant");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 535);
		getContentPane().setLayout(null);
		
		//bouton home :
		Button home = new Button();
        home.setBounds(28, 77, 24, 24);
        getContentPane().add(home);
        home.addActionListener(this);
        
        
        //bouton logout : 
        logout = new Button();
        logout.setBounds(28, 130, 24, 24);
        getContentPane().add(logout);
        logout.addActionListener(this);
        
        
		//bouton pour voir notes :
        Button voir_notes = new Button();
        voir_notes.setBounds(272, 173, 66, 76);
        getContentPane().add(voir_notes);
        voir_notes.addActionListener(this);
        
        //bouton pour demander reclamation :
        Button demande_reclamation = new Button();
        demande_reclamation.setBounds(495, 173, 66, 76);
        getContentPane().add(demande_reclamation);
        demande_reclamation.addActionListener(this);
        
        //bouton pour "Demande de l'aide"
        Button aide = new Button();
        aide.setBounds(	28, 468, 23, 20);
        getContentPane().add(aide);
        aide.addActionListener(this); 
        
        //bouton pour acceder aux paramètres de comptes :
        
        Button paramCompte = new Button();
        paramCompte.setBounds(	709, 9, 54, 32);
        getContentPane().add(paramCompte);
        paramCompte.addActionListener(this);
		//Code pour le background:
		JLabel BackgroundLabel = new JLabel();
        BackgroundLabel.setBounds(0, 0, 800, 500);
        ImageIcon img = new ImageIcon(this.getClass().getResource("/espace_etudiant_frame.png"));
        BackgroundLabel.setIcon(img);
        getContentPane().add(BackgroundLabel);
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == logout) {
			new Login();
            dispose();
		}
		
	}
}
