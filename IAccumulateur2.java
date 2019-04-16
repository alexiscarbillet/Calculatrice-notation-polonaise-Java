import java.util.ArrayList;

// on liste les méthodes nécessaires à l'accumulateur
public interface IAccumulateur2 { // Il n'y a pas d'autre IAccumulateur
	/**
	 * permet d'obtenir les 5 derniers éléments de la pile
	 * @return
	 */
	public ArrayList<String> obtenir5derniers();
	/**
	 * méthode addition des deux derniers nombres de la pile
	 */
	public void add();
	/**
	 * méthode soustraction des deux derniers nombres de la pile
	 */
	public void sub();
	/**
	 * méthode multiplication des deux derniers nombres de la pile
	 */
	public void mult();
	/**
	 * méthode division des deux derniers nombres de la pile
	 */
	public void div();
	/**
	 * échange les deux derniers nombres de la pile
	 */
	public void swap();
	/**
	 * supprime le dernier nombre de la pile
	 */
	public void drop();
	/**
	 * change le signe du dernier élément de la pile
	 */
	public void neg();
	/**
	 * supprime les éléments de la pile et la valeur actuelle
	 */
	public void reset();
	/**
	 * supprime le dernier chiffre de la valeur actuelle
	 */
	public void backspace();
	/**
	 * ajoute la valeur actuelle à la pile
	 */
	public void push();
	/**
	 * ajoute un caractère à l'élément actuel
	 * @param c
	 */
	public void accumuler(char c);
	/**
	 * inverse le dernier élément de la pile
	 */
	public void inverse();
	/**
	 * racine dernier-élément-de-la-pile-ième de l'avant dernier élément de la pile
	 */
	public void racineN();
	/**
	 * racine carré du dernier élément de la pile
	 */
	public void racine();
	/**
	 * factorielle du dernier élément de la pile
	 */
	public void fact();
	/**
	 * ajoute la valeur de pi à la pile
	 */
	public void pi();
	/**
	 * met 10 à la puissance dernier-élément-de-la-pile
	 */
	public void puissance10();
	/**
	 * avant-dernier-élément-de-la-pile puissance dernier-élément-la-pile
	 */
	public void puissancey();
	/**
	 * met au carré le dernier élément de la pile
	 */
	public void carre();
	/**
	 * logarithme du dernier élément de la pile
	 */
	public void log10();
	/**
	 * logarithme népérien du dernier élément de la pile
	 */
	public void log();
	/**
	 * arctangente du dernier élément de la pile
	 */
	public void atan();
	/**
	 * arcsinus du dernier élément de la pile
	 */
	public void asin();
	/**
	 * arccosinus du dernier élément de la pile
	 */
	public void acos();
	/**
	 * cosinus du dernier élément de la pile
	 */
	public void cos();
	/**
	 * sinus du dernier élément de la pile
	 */
	public void sin();
	/**
	 * tangente du dernier élément de la pile
	 */
	public void tan();
	/**
	 * exponentielle du dernier élément de la pile
	 */
	public void exp();
}