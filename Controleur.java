import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controleur implements ActionListener, PropertyChangeListener,KeyListener {
Accumulateur accu;
GUI gui;
KeyEvent e;


@Override
public void propertyChange(PropertyChangeEvent evt) {
Object source = evt.getSource();
}

/**
 * constructeur du controleur
 */
public Controleur() {
	gui = new GUI(this);
	accu = new Accumulateur();
	
}


@Override
public void actionPerformed(ActionEvent e) { 
if(e.getActionCommand()=="0") { // partie interface graphique
	accu.accumuler('0'); // on met 0 à la fin du nombre actuel
}
else if(e.getActionCommand()=="1") {
	accu.accumuler('1'); // on met 1 à la fin du nombre actuel
}
else if(e.getActionCommand()=="2") {
	accu.accumuler('2'); // on met 2 à la fin du nombre actuel
}
else if(e.getActionCommand()=="3") {
	accu.accumuler('3'); // on met 3 à la fin du nombre actuel
}
else if(e.getActionCommand()=="4") {
	accu.accumuler('4'); // on met 4 à la fin du nombre actuel
}
else if(e.getActionCommand()=="5") {
	accu.accumuler('5'); // on met 5 à la fin du nombre actuel
}
else if(e.getActionCommand()=="6") {
	accu.accumuler('6'); // on met 6 à la fin du nombre actuel
}
else if(e.getActionCommand()=="7") {
	accu.accumuler('7'); // on met 7 à la fin du nombre actuel
}
else if(e.getActionCommand()=="8") {
	accu.accumuler('8'); // on met 8 à la fin du nombre actuel
}
else if(e.getActionCommand()=="9") {
	accu.accumuler('9'); // on met 9 à la fin du nombre actuel
}
else if(e.getActionCommand()=="C") {
	accu.reset(); // supprime les nombres de la pile et le nombre actuel
}
else if(e.getActionCommand()=="supp") {
	int s = accu.chaine.length();
	if (s!=0) {
		accu.backspace(); // supprime le dernier chiffre du nombre actuel
	}
}
else if(e.getActionCommand()=="swap") {
	JFrame frame = new JFrame();
	if(accu.pile.size()>1) {
		accu.swap(); // échange les deux derniers nombres de la pile
	}
	else {
		JOptionPane.showMessageDialog(frame, "Il faut au moins deux nombres dans la pile pour faire un swap",
				"Erreur swap", JOptionPane.ERROR_MESSAGE);
	}
}
else if(e.getActionCommand()=="+") { 
	JFrame frame = new JFrame();
	if(accu.pile.size()==1) {
		if(accu.chaine!="") {
			accu.push();
			accu.chaine="";
		}
	}
	if(accu.pile.size()<=1) {
		JOptionPane.showMessageDialog(frame, "Il faut au moins deux nombres dans la pile pour faire une addition",
				"Erreur addition", JOptionPane.ERROR_MESSAGE);
	}
	else {
		accu.add(); // additionne les deux derniers nombres de la pile
	}
}
else if(e.getActionCommand()=="-") {
	JFrame frame = new JFrame();
	if(accu.pile.size()==1) {
		if(accu.chaine!="") {
			accu.push();
			accu.chaine="";
		}
	}
	if(accu.pile.size()<=1) {
		JOptionPane.showMessageDialog(frame, 
				"Il faut au moins deux nombres dans la pile pour faire une soustraction",
				"Erreur soustraction", JOptionPane.ERROR_MESSAGE);
	}
	else {
		accu.sub(); // soustrait les deux derniers nombres de la pile
	}
}
else if(e.getActionCommand()=="*") {
	JFrame frame = new JFrame();
	if(accu.pile.size()==1) {
		if(accu.chaine!="") {
			accu.push();
			accu.chaine="";
		}
	}
	if(accu.pile.size()<=1) {
		JOptionPane.showMessageDialog(frame, 
				"Il faut au moins deux nombres dans la pile pour faire une multiplication",
				"Erreur multiplication", JOptionPane.ERROR_MESSAGE);
	}
	else {
		accu.mult(); // multiplie les deux derniers nombres de la pile
	}
	
}
else if(e.getActionCommand()=="/") {
	JFrame frame = new JFrame();
	if(accu.pile.size()==1) {
		if(accu.chaine!="") {
			accu.push();
			accu.chaine="";
		}
	}
	if(accu.pile.size()<=1) {
		JOptionPane.showMessageDialog(frame, "Il faut au moins deux nombres dans la pile pour faire une division",
				"Erreur division", JOptionPane.ERROR_MESSAGE);
	}
	else {
		accu.div(); // divise les deux derniers nombres de la pile
	}
}
else if(e.getActionCommand()==".") {
	int j=0; // permet de savoir si le nombre est entier
	JFrame frame = new JFrame();
	int s = accu.chaine.length();
	for(int i=0;i<s;i++) {
		if(accu.chaine.charAt(i)=='.') { //permet de savoir s'il y a une virgule
			j+=1;
		}
	}
	if(j==0) {
		accu.accumuler('.'); // permet de créer des nombres décimaux
	}
	else {
		JOptionPane.showMessageDialog(frame, "On ne peut pas mettre deux points dans un nombre","Erreur point",
			    JOptionPane.ERROR_MESSAGE);
	}
	
}
else if(e.getActionCommand()=="+/-") {
	accu.neg(); // permet de créer des nombres négatifs
}
else if(e.getActionCommand()=="push") {
	JFrame frame = new JFrame();
	if(accu.chaine=="") {
		JOptionPane.showMessageDialog(frame, "Veuillez saisir un nombre avant de push","Erreur push",
			    JOptionPane.ERROR_MESSAGE);
	}
	else {
		accu.push(); // ajoute le nombre actuel à la pile
		accu.chaine="";
	}

}
else if(e.getActionCommand()=="drop") {
	accu.drop(); // enlève le dernier nombre de la pile
}
else if(e.getActionCommand()=="exp") {
	accu.exp(); // on fait l'exponentielle du dernier nombre de la pile
}
else if(e.getActionCommand()=="ln") { // on fait le logarithme népérien du dernier nombre de la pile
	JFrame frame = new JFrame();
	if(accu.obtenir5derniers().get(0).charAt(0)=='-'){
		JOptionPane.showMessageDialog(frame, "On ne peut pas faire le logarithme d'un nombre négatif",
				"Erreur logarithme",JOptionPane.ERROR_MESSAGE);
	}
	else{
		accu.log();
	}
}
else if(e.getActionCommand()=="log") { // on fait le logarithme du dernier nombre de la pile
	JFrame frame = new JFrame();
	if(accu.obtenir5derniers().get(0).charAt(0)=='-'){
		JOptionPane.showMessageDialog(frame, "On ne peut pas faire le logarithme d'un nombre négatif",
				"Erreur logarithme",JOptionPane.ERROR_MESSAGE);
	}
	else{
		accu.log10();
	}
}
else if(e.getActionCommand()=="²") { // on fait le carré du dernier nombre de la pile
	accu.carre();
}
else if(e.getActionCommand()=="sin") { // on fait le sinus du dernier nombre de la pile
	accu.sin(); 
}
else if(e.getActionCommand()=="asin") { // on fait l'arcsinus du dernier nombre de la pile
	accu.asin(); 
}
else if(e.getActionCommand()=="cos") { // on fait le cosinus du dernier nombre de la pile
	accu.cos(); 
}
else if(e.getActionCommand()=="acos") { // on fait l'arcosinus du dernier nombre de la pile
	accu.acos(); 
}
else if(e.getActionCommand()=="tan") { // on fait la tangente du dernier nombre de la pile
	accu.tan();
}
else if(e.getActionCommand()=="atan") { // on fait l'arctangente du dernier nombre de la pile
	accu.atan(); 
}
else if(e.getActionCommand()=="^") { // on fait la puissance du dernier nombre de la pile par celui d'avant
	JFrame frame = new JFrame();
	if(accu.pile.size()<=1) {
		JOptionPane.showMessageDialog(frame, "Il faut au moins deux nombres dans la pile pour faire une puissance",
				"Erreur puissance", JOptionPane.ERROR_MESSAGE);
	}
	else {
		accu.puissancey();
	}
}
else if(e.getActionCommand()=="10^") { // on fait la puissance de 10 par le dernier nombre de la pile
	accu.puissance10();
}
else if(e.getActionCommand()=="!") { // on fait le factoriel du dernier nombre de la pile
	int j=0; // permet de savoir si le nombre est entier
	JFrame frame = new JFrame();
	int s = accu.obtenir5derniers().get(0).length();
	for(int i=0;i<s;i++) {
		if(accu.obtenir5derniers().get(0).charAt(i)=='.') { //permet de savoir s'il y a une virgule
			j+=1;
		}
	}
	if(j==0) {
		accu.fact();
	}
	else {
		JOptionPane.showMessageDialog(frame, "On ne peut pas faire le factoriel d'un nombre décimal",
				"Erreur factorielle", JOptionPane.ERROR_MESSAGE);
	}
}

else if(e.getActionCommand()=="1/x") { // on fait l'inverse du dernier nombre de la pile
	accu.inverse();
}
else if(e.getActionCommand()=="pi") { // on ajoute pi à la pile
	accu.pi(); 
}
else if(e.getActionCommand()=="racine") { // racine carré du dernier nombre de la pile
	JFrame frame = new JFrame();
	if(accu.obtenir5derniers().get(0).charAt(0)=='-'){
		JOptionPane.showMessageDialog(frame, "On ne peut pas faire la racine d'un nombre négatif","Erreur racine",
			    JOptionPane.ERROR_MESSAGE);
	}
	else {
		accu.racine();
	}
	
}
else if(e.getActionCommand()=="racineN") { // racine dernier nombre-de-la-pile-ième du nombre d'avant
	JFrame frame = new JFrame();
	if(accu.obtenir5derniers().get(0).charAt(0)=='-'){
		JOptionPane.showMessageDialog(frame, "On ne peut pas faire la racine d'un nombre négatif",
				"Erreur racine n-ième", JOptionPane.ERROR_MESSAGE);
	}
	if(accu.pile.size()<=1) {
		JOptionPane.showMessageDialog(frame, 
				"Il faut au moins deux nombres dans la pile pour faire une racine n-ième",
				"Erreur racine n-ième", JOptionPane.ERROR_MESSAGE);
	}
	else {
		accu.racineN();
	}
}
gui.update_valeurActuelle(accu.chaine);
gui.update(accu.obtenir5derniers().get(4), accu.obtenir5derniers().get(3), accu.obtenir5derniers().get(2), 
		accu.obtenir5derniers().get(1), accu.obtenir5derniers().get(0)); 
gui.refocus(); //On refait le focus sur la fenetre pour autoriser l'écoute du clavier
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
}


@Override
/**
 * Permet l'usage des touches du clavier
 */
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	char key = e.getKeyChar();	//On utilise getKeyChar pour prendre la valeur du char retournée par le clavier
	 
	if (key == '0'){
		accu.accumuler('0'); // on met 0 à la fin du nombre actuel
	}
	else if (key == '1'){
		accu.accumuler('1'); // on met 1 à la fin du nombre actuel
	}
	else if (key == '2'){
		accu.accumuler('2'); // on met 2 à la fin du nombre actuel
	}
	else if (key == '3'){
		accu.accumuler('3'); // on met 3 à la fin du nombre actuel
	}
	else if (key == '4'){
		accu.accumuler('4'); // on met 4 à la fin du nombre actuel
	}
	else if (key == '5'){
		accu.accumuler('5'); // on met 5 à la fin du nombre actuel
	}
	else if (key == '6'){
		accu.accumuler('6'); // on met 6 à la fin du nombre actuel
	}			
	else if (key == '7'){
		accu.accumuler('7'); // on met 7 à la fin du nombre actuel
	}
	else if (key == '8'){
		accu.accumuler('8'); // on met 8 à la fin du nombre actuel
	}
	else if (key == '9'){
		accu.accumuler('9'); // on met 9 à la fin du nombre actuel

	}
	else if (key==','  || key =='.'){
		int j=0; // permet de savoir si le nombre est entier
		JFrame frame = new JFrame();
		int s = accu.chaine.length();
		for(int i=0;i<s;i++) {
			if(accu.chaine.charAt(i)=='.') { //permet de savoir s'il y a une virgule
				j+=1;
			}
		}
		if(j==0) {
			accu.accumuler('.'); // permet de créer des nombres décimaux
		}
		else {
			JOptionPane.showMessageDialog(frame, "On ne peut pas mettre deux points dans un nombre","Erreur point",
				    JOptionPane.ERROR_MESSAGE);
		}
	}
	else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		int s = accu.chaine.length();
    	if (s!=0) {
    		accu.backspace(); // supprime le dernier chiffre du nombre actuel
    	}
    }
	else if (e.getKeyCode() == KeyEvent.VK_ENTER){
		JFrame frame = new JFrame();
		if(accu.chaine=="") {
			JOptionPane.showMessageDialog(frame, "Veuillez saisir un nombre avant de push","Erreur push",
				    JOptionPane.ERROR_MESSAGE);
		}
		else {
			accu.push(); // ajoute le nombre actuel à la pile
			accu.chaine="";
		}
	}
	else if (key =='+')  {
		JFrame frame = new JFrame();
		if(accu.pile.size()==1) {
			if(accu.chaine!="") {
				accu.push();
				accu.chaine="";
			}
		}
		if(accu.pile.size()<=1) {
			JOptionPane.showMessageDialog(frame, 
					"Il faut au moins deux nombres dans la pile pour faire une addition",
					"Erreur addition", JOptionPane.ERROR_MESSAGE);
		}
		else {
			accu.add(); // additionne les deux derniers nombres de la pile
		}
	}

	else if (key =='-') {
		JFrame frame = new JFrame();
		if(accu.pile.size()==1) {
			if(accu.chaine!="") {
				accu.push();
				accu.chaine="";
			}
		}
		if(accu.pile.size()<=1) {
			JOptionPane.showMessageDialog(frame, 
					"Il faut au moins deux nombres dans la pile pour faire une soustraction",
					"Erreur soustraction", JOptionPane.ERROR_MESSAGE);
		}
		else {
			accu.sub(); // soustrait les deux derniers nombres de la pile
		}
	}
	

	else if (key == '*') {
		JFrame frame = new JFrame();
		if(accu.pile.size()==1) {
			if(accu.chaine!="") {
				accu.push();
				accu.chaine="";
			}
		}
		if(accu.pile.size()<=1) {
			JOptionPane.showMessageDialog(frame, 
					"Il faut au moins deux nombres dans la pile pour faire une multiplication",
					"Erreur multiplication", JOptionPane.ERROR_MESSAGE);
		}
		else {
			accu.mult(); // multiplie les deux derniers nombres de la pile
		}
	}
	
	else if (key=='/') {
		JFrame frame = new JFrame();
		if(accu.pile.size()==1) {
			if(accu.chaine!="") {
				accu.push();
				accu.chaine="";
			}
		}
		if(accu.pile.size()<=1) {
			JOptionPane.showMessageDialog(frame, 
					"Il faut au moins deux nombres dans la pile pour faire une division",
					"Erreur division", JOptionPane.ERROR_MESSAGE);
		}
		else {
			accu.div(); // divise les deux derniers nombres de la pile
		}
	}

	else if (key =='<' || key =='>') {
		JFrame frame = new JFrame();
		if(accu.pile.size()>1) {
			accu.swap(); // échange les deux derniers nombres de la pile
		}
		else {
			JOptionPane.showMessageDialog(frame, "Il faut au moins deux nombres dans la pile pour faire un swap",
					"Erreur swap", JOptionPane.ERROR_MESSAGE);
		}
	}

	else if (e.getKeyCode() == KeyEvent.VK_C){
		accu.reset(); // supprime les nombres de la pile et le nombre actuel
	}
	gui.update_valeurActuelle(accu.chaine);
	gui.update(accu.obtenir5derniers().get(4), accu.obtenir5derniers().get(3), accu.obtenir5derniers().get(2),
			accu.obtenir5derniers().get(1), accu.obtenir5derniers().get(0)); 
}


/**
 * permet de lancer l'affichage du GUI
 */
public void lancerGUI() {
	// TODO Auto-generated method stub
	gui.lancerGUI();
}

/**
 * renvoie les cinq derniers éléments de la pile
 * @return
 */
public ArrayList<String> getPile() {
	return accu.obtenir5derniers();
}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

}