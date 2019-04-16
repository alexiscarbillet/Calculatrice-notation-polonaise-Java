import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

/**
 * @author alexis
 *
 */

public class GUI extends JFrame implements IView{
	
	private JTextField ligne1;
	private JTextField ligne2;
	private JTextField ligne3;
	private JTextField ligne4;
	private JTextField ligne5;
	private JTextField valeurActuelle;
	
	Accumulateur accu;
	
	// on met en attributs les panels
	private JPanel ecran = new JPanel();
	private JPanel touches = new JPanel();
	private JPanel bas = new JPanel();
  
	// on met en attributs les boutons
	private JButton bouton0 = new JButton("0");
	private JButton bouton1 = new JButton("1");
	private JButton bouton2 = new JButton("2");
	private JButton bouton3 = new JButton("3");
	private JButton bouton4 = new JButton("4");
	private JButton bouton5 = new JButton("5");
	private JButton bouton6 = new JButton("6");
	private JButton bouton7 = new JButton("7");
	private JButton bouton8 = new JButton("8");
	private JButton bouton9 = new JButton("9");
  
	private JButton boutonplus = new JButton("+");
	private JButton boutonmoins = new JButton("-");
	private JButton boutonmult = new JButton("*");
	private JButton boutondiv = new JButton("/");
	private JButton boutonpoint = new JButton(".");
	private JButton boutonneg = new JButton("+/-");
	private JButton boutonpush = new JButton("push");
	private JButton boutonswap = new JButton("swap");
	private JButton boutonclear = new JButton("C");
	private JButton boutonsupp = new JButton("supp");
	private JButton boutondrop = new JButton("drop");
  
	// boutons bonus
	private JButton boutonexp = new JButton("exp");
	private JButton boutontan = new JButton("tan");
	private JButton boutonatan = new JButton("atan");
	private JButton boutoncos = new JButton("cos");
	private JButton boutonacos = new JButton("acos");
	private JButton boutonsin = new JButton("sin");
	private JButton boutonasin = new JButton("asin");
	private JButton boutonln = new JButton("ln");
  	private JButton boutonlog = new JButton("log");
  	private JButton boutonpi = new JButton("pi");
  	private JButton boutonfact = new JButton("!");
  	private JButton boutonracine = new JButton("racine");
  	private JButton boutonracineN = new JButton("racineN");
  	private JButton boutonpuissance = new JButton("^");
  	private JButton bouton10puissance = new JButton("10^");
  	private JButton boutoncarre = new JButton("²");
  	private JButton boutoninverse = new JButton("1/x");
  	
  	private Controleur c;
	 
  	
	 /**
	  * constructeur du GUI
	 * @param c
	 */
	public GUI(Controleur c){
		this.c=c;
		accu = new Accumulateur();
	 }
	 
	 /**
	 * on créé les liens entre les boutons et le contrôleur
	 */
	private void ajouterAction() {
		bouton0.addActionListener(c);
		bouton1.addActionListener(c);
		bouton2.addActionListener(c);
		bouton3.addActionListener(c);
		bouton4.addActionListener(c);
		bouton5.addActionListener(c);
		bouton6.addActionListener(c);
		bouton7.addActionListener(c);
		bouton8.addActionListener(c);
		bouton9.addActionListener(c);
		boutonplus.addActionListener(c);
		boutonmoins.addActionListener(c);
		boutonmult.addActionListener(c);
		boutondiv.addActionListener(c);
		boutonswap.addActionListener(c);
		boutonsupp.addActionListener(c);
		boutonneg.addActionListener(c);
		boutonclear.addActionListener(c);
		boutonpush.addActionListener(c);
		boutonpoint.addActionListener(c);
		boutondrop.addActionListener(c);
		boutonexp.addActionListener(c);
		boutontan.addActionListener(c);
		boutonatan.addActionListener(c);
		boutoncos.addActionListener(c);
		boutonacos.addActionListener(c);
		boutonsin.addActionListener(c);
		boutonasin.addActionListener(c);
		boutonln.addActionListener(c);
	  	boutonlog.addActionListener(c);
	  	boutonpi.addActionListener(c);
	  	boutonfact.addActionListener(c);
	  	boutonracine.addActionListener(c);
	  	boutonracineN.addActionListener(c);
	  	boutonpuissance.addActionListener(c);
	  	bouton10puissance.addActionListener(c);
	  	boutoncarre.addActionListener(c);
	  	boutoninverse.addActionListener(c);
	}
	 
	public void lancerGUI () {
		 ajouterAction();
		 ligne1= new JTextField(accu.obtenir5derniers().get(4));
		 ligne2= new JTextField(accu.obtenir5derniers().get(3));
		 ligne3= new JTextField(accu.obtenir5derniers().get(2));
		 ligne4= new JTextField(accu.obtenir5derniers().get(1));
		 ligne5= new JTextField(accu.obtenir5derniers().get(0));
		 valeurActuelle = new JTextField(accu.chaine);
		 
		    this.setTitle("Calculatrice");
		    // taille de la fenetre: 500 pixels de large et 500 de hauteur
		    this.setSize(500, 525);
		    // l'objet se positionne au centre
		    this.setLocationRelativeTo(null);
		    //Termine le processus lorsqu'on clique sur la croix rouge
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
		    //On définit les layouts
		    GridLayout GridBagLayout1 = new GridLayout(6,1); // ecran
		    GridLayout GridBagLayout2 = new GridLayout(9,4); // touches
		    GridLayout GridBagLayout3 = new GridLayout(1,2); // bas
		    
		    // on dimensionne les layouts
		    ecran.setLayout(GridBagLayout1);
		    ecran.setPreferredSize(new Dimension(500, 150));
		    touches.setLayout(GridBagLayout2);
		    touches.setPreferredSize(new Dimension(500, 350));
		    bas.setLayout(GridBagLayout3);
		    bas.setPreferredSize(new Dimension(500, 25));
		    
		    // partie ecran
		    ecran.add(ligne1);
		    ecran.add(ligne2);
		    ecran.add(ligne3);
		    ecran.add(ligne4);
		    ecran.add(ligne5);
		    ecran.add(valeurActuelle);
		    
		    //couleur des touches correspondant aux chiffres
		    bouton0.setBackground(new Color(20,110,230));
		    bouton1.setBackground(new Color(20,110,230));
		    bouton2.setBackground(new Color(20,110,230));
		    bouton3.setBackground(new Color(20,110,230));
		    bouton4.setBackground(new Color(20,110,230));
		    bouton5.setBackground(new Color(20,110,230));
		    bouton6.setBackground(new Color(20,110,230));
		    bouton7.setBackground(new Color(20,110,230));
		    bouton8.setBackground(new Color(20,110,230));
		    bouton9.setBackground(new Color(20,110,230));
		    
		    // partie touche
		    // première ligne
		    touches.add(boutoncarre);
		    touches.add(boutonpuissance);
		    touches.add(bouton10puissance);
		    touches.add(boutoninverse);
		    //deuxième ligne
		    touches.add(boutonracine);
		    touches.add(boutonracineN);
		    touches.add(boutonfact);
		    touches.add(boutonlog);
		    //troisième ligne
		    touches.add(boutontan);
		    touches.add(boutonatan);
		    touches.add(boutonexp);
		    touches.add(boutonln);
		    //quatrième ligne
		    touches.add(boutonsin);
		    touches.add(boutonasin);
		    touches.add(boutoncos);
		    touches.add(boutonacos);
		    //cinquième ligne
		    touches.add(boutonpi);
		    touches.add(boutonswap);
		    touches.add(boutondrop);
		    touches.add(boutonsupp);
		    //sixième ligne
		    touches.add(bouton7);
		    touches.add(bouton8);
		    touches.add(bouton9);
		    touches.add(boutondiv);
		    //septième ligne
		    touches.add(bouton4);
		    touches.add(bouton5);
		    touches.add(bouton6);
		    touches.add(boutonmult);
		    //huitième ligne
		    touches.add(bouton1);
		    touches.add(bouton2);
		    touches.add(bouton3);
		    touches.add(boutonmoins);
		    //neuvième ligne
		    touches.add(boutonneg);
		    touches.add(bouton0);
		    touches.add(boutonpoint);
		    touches.add(boutonplus);
		    
		    //partie bas
		    bas.add(boutonclear);
		    bas.add(boutonpush);
		    
		    // on position les panels dans la fenetre
		    this.add(ecran, BorderLayout.NORTH);
		    this.add(touches,BorderLayout.CENTER);
		    this.add(bas,BorderLayout.SOUTH);
		    
			//Cette ligne ajoute le controleur comme listener du clavier
			this.addKeyListener(c);
			this.setFocusable(true);
			
		    // rendre visible la fenetre
		    this.setVisible(true);
			// On interdit d'écrire dans les zones de textes 
			ligne1.setEditable(false);
			ligne2.setEditable(false);
			ligne3.setEditable(false);
			ligne4.setEditable(false);
			ligne5.setEditable(false);
			
			// on positionne le texte à droite dans les cases
			ligne1.setHorizontalAlignment(JTextField.RIGHT);
			ligne2.setHorizontalAlignment(JTextField.RIGHT);
			ligne3.setHorizontalAlignment(JTextField.RIGHT);
			ligne4.setHorizontalAlignment(JTextField.RIGHT);
			ligne5.setHorizontalAlignment(JTextField.RIGHT);
			valeurActuelle.setHorizontalAlignment(JTextField.RIGHT);	    
	 }
		    
	public void refocus() {
		this.requestFocus();
	}


	public void update_valeurActuelle(String chaine) {
		// TODO Auto-generated method stub
		valeurActuelle.setText(chaine);
	}

	public void update(String nb1,String nb2,String nb3,String nb4,String nb5) {
		ligne1.setText(nb1);
		ligne2.setText(nb2);
		ligne3.setText(nb3);
		ligne4.setText(nb4);
		ligne5.setText(nb5);
	}
	}

