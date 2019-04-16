import java.util.ArrayList;

public class Accumulateur implements IAccumulateur2{
    Pile pile;
	String chaine="";
	
	
	/**
	 * constructeur de l'accumulateur
	 */
	public Accumulateur() {
		pile = new Pile();
	}
	// permet d'obtenir les 5 derniers éléments de la pile
	public ArrayList<String> obtenir5derniers() {
		ArrayList<String> liste = new ArrayList<String>();
		ArrayList<String> stockage = new ArrayList<String>();
		for (int i=0;i<5;i++) {
			if (!pile.empty()){
				String a=pile.pop();
				liste.add(a);
				stockage.add(a);
			}
			else {					// Si il y a moins de 5 éléments dans la pile, on complète avec des blancs
				String b = "";
				liste.add(b);
			}		
		}
		while(!stockage.isEmpty()) {		//On rempile les éléments dépilés et provisoirement stockés dans stockage
			int S;
			S=stockage.size();
			pile.push(stockage.get(S-1));
			stockage.remove(S-1);
		}
		return liste;
	}
	
	// additionne les deux derniers nombres de la pile 
	public void add() {
		int s=pile.size();
		if(s>1) {
		String a= pile.pop();
		String b= pile.pop();
		double c=Double.parseDouble(a)+Double.parseDouble(b);
		pile.push(""+c+"");
		}
	}
	
	// soustrait les deux derniers nombres de la pile
	public void sub() {
		int s=pile.size();
		if(s>1) {
		String a= pile.pop();
		String b= pile.pop();
		double c=Double.parseDouble(b)-Double.parseDouble(a);
		pile.push(""+c+"");
		}
	}
	
	// multiplie les deux derniers nombres de la pile
	public void mult() {
		int s=pile.size();
		if(s>1) {
		String a= pile.pop();
		String b= pile.pop();
		double c=Double.parseDouble(a)*Double.parseDouble(b);
		pile.push(""+c+"");
		}
	}
	
	// divise les deux derniers nombres de la pile
	public void div() {
		int s=pile.size();
		if(s>1) {
		String a= pile.pop();
		String b= pile.pop();
		double c=Double.parseDouble(b)/Double.parseDouble(a);
		pile.push(""+c+"");
		}
	}
	
	// supprime le dernier nombre de la pile
	public void drop() { 
		pile.drop();
	}
	// methode qui permet d'échanger les deux derniers nombres de la pile
	public void swap() { // faire le cas s'il y a rien ou un seul élément
		int s=pile.size();
		if(s>1) {
			String a= pile.pop();
			String b= pile.pop();
			pile.push(a);
			pile.push(b);
		}
	}
	// nettoie la pile et la liste contenant le nombre qui est en train d'être tapé
	public void reset() { 
		pile.clear();
		chaine="";
	}
	// permet d'avoir des nombres négatifs
	public void neg() { 
		String a= pile.pop();
		double c=(-1)*Double.parseDouble(a);
		pile.push(""+c+"");
		
	}
	// permet de supprimer le dernier chiffre entré dans le nombre actuel
	public void backspace() { // faire le cas s'il y a rien 
		int s= chaine.length();
		chaine= chaine.substring(0, s-1);
	}
	
	// permet de créer des nombres à plusieurs chiffres
	public void accumuler(char c) {
		chaine=chaine+c;
	}
	
	// fonctions BONUS
	// exponentielle du dernier élément de la pile
	public void exp() {
		String a= pile.pop();
		double c=Math.exp(Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// tangente du dernier élément de la pile
	public void tan() {
		String a= pile.pop();
		double c=Math.tan(Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// sinus du dernier élément de la pile
	public void sin() {
		String a= pile.pop();
		double c=Math.sin(Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// cosinus du dernier élément de la pile
	public void cos() {
		String a= pile.pop();
		double c=Math.cos(Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// arccosinus du dernier élément de la pile
	public void acos() {
		String a= pile.pop();
		double c=Math.acos(Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// arcsinus du dernier élément de la pile
	public void asin() { // arcsin(sin(3)) ne renvoie pas 3
		String a= pile.pop();
		double c=Math.asin(Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// arctangente du dernier élément de la pile
	public void atan() {
		String a= pile.pop();
		double c=Math.atan(Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// logarithme népérien du dernier élément de la pile
	public void log() {
		String a= pile.pop();
		double c=Math.log(Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// logarithme du dernier élément de la pile
	public void log10() {
		String a= pile.pop();
		double c=Math.log10(Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// met au carré le dernier élément de la pile
	public void carre() {
		String a= pile.pop();
		double c=Double.parseDouble(a);
		pile.push(""+c*c+"");
	}
	// avant-dernier-élément-de-la-pile puissance dernier-élément-la-pile
	public void puissancey() {
		String a= pile.pop();
		String b= pile.pop();
		double c=Math.pow(Double.parseDouble(b),Double.parseDouble(a));
		pile.push(""+c+"");
	}
	//  met 10 à la puissance dernier-élément-de-la-pile
	public void puissance10() {
		String a= pile.pop();
		double c=Math.pow(10,Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// ajoute la valeur de pi à la pile
	public void pi() {
		pile.push(""+Math.PI+"");
	}
	// factorielle du dernier élément de la pile
	public void fact() {
		String a= pile.pop();
		int b=Integer.parseInt(a);
		int n=2;
		if(b>2) {
			for(int i=3; i<=b; i++) {
				n=n*i;
			}
		}
		else {
			n=b;
		}
		pile.push(""+n+"");
	}
	// racine carré du dernier élément de la pile
	public void racine() {
		String a= pile.pop();
		double b=Math.sqrt(Double.parseDouble(a));
		pile.push(""+b+"");
	}
	// racine dernier-élément-de-la-pile-ième de l'avant dernier élément de la pile
	public void racineN() {
		String a= pile.pop();
		String b= pile.pop();
		double c=Math.pow(Double.parseDouble(b),1/Double.parseDouble(a));
		pile.push(""+c+"");
	}
	// inverse le dernier élément de la pile
	public void inverse() {
		String a= pile.pop();
		double c=1/Double.parseDouble(a);
		pile.push(""+c+"");
	}
	// ajoute un caractère à l'élément actuel
	public void push() { 
		pile.push(chaine);
	}
}

