import java.util.ArrayList;

// on liste les m�thodes n�cessaires � l'accumulateur
public interface IAccumulateur2 { // Il n'y a pas d'autre IAccumulateur
	/**
	 * permet d'obtenir les 5 derniers �l�ments de la pile
	 * @return
	 */
	public ArrayList<String> obtenir5derniers();
	/**
	 * m�thode addition des deux derniers nombres de la pile
	 */
	public void add();
	/**
	 * m�thode soustraction des deux derniers nombres de la pile
	 */
	public void sub();
	/**
	 * m�thode multiplication des deux derniers nombres de la pile
	 */
	public void mult();
	/**
	 * m�thode division des deux derniers nombres de la pile
	 */
	public void div();
	/**
	 * �change les deux derniers nombres de la pile
	 */
	public void swap();
	/**
	 * supprime le dernier nombre de la pile
	 */
	public void drop();
	/**
	 * change le signe du dernier �l�ment de la pile
	 */
	public void neg();
	/**
	 * supprime les �l�ments de la pile et la valeur actuelle
	 */
	public void reset();
	/**
	 * supprime le dernier chiffre de la valeur actuelle
	 */
	public void backspace();
	/**
	 * ajoute la valeur actuelle � la pile
	 */
	public void push();
	/**
	 * ajoute un caract�re � l'�l�ment actuel
	 * @param c
	 */
	public void accumuler(char c);
	/**
	 * inverse le dernier �l�ment de la pile
	 */
	public void inverse();
	/**
	 * racine dernier-�l�ment-de-la-pile-i�me de l'avant dernier �l�ment de la pile
	 */
	public void racineN();
	/**
	 * racine carr� du dernier �l�ment de la pile
	 */
	public void racine();
	/**
	 * factorielle du dernier �l�ment de la pile
	 */
	public void fact();
	/**
	 * ajoute la valeur de pi � la pile
	 */
	public void pi();
	/**
	 * met 10 � la puissance dernier-�l�ment-de-la-pile
	 */
	public void puissance10();
	/**
	 * avant-dernier-�l�ment-de-la-pile puissance dernier-�l�ment-la-pile
	 */
	public void puissancey();
	/**
	 * met au carr� le dernier �l�ment de la pile
	 */
	public void carre();
	/**
	 * logarithme du dernier �l�ment de la pile
	 */
	public void log10();
	/**
	 * logarithme n�p�rien du dernier �l�ment de la pile
	 */
	public void log();
	/**
	 * arctangente du dernier �l�ment de la pile
	 */
	public void atan();
	/**
	 * arcsinus du dernier �l�ment de la pile
	 */
	public void asin();
	/**
	 * arccosinus du dernier �l�ment de la pile
	 */
	public void acos();
	/**
	 * cosinus du dernier �l�ment de la pile
	 */
	public void cos();
	/**
	 * sinus du dernier �l�ment de la pile
	 */
	public void sin();
	/**
	 * tangente du dernier �l�ment de la pile
	 */
	public void tan();
	/**
	 * exponentielle du dernier �l�ment de la pile
	 */
	public void exp();
}