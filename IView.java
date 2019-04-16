// on liste les méthodes nécessaires pour le GUI
public interface IView {
	/**
	 * permet de lancer l'interface graphique
	 */
	public void lancerGUI();
	/**
	 * Permet de refaire un focus sur la fenetre
	 */
	public void refocus();
	/**
	 * Permet de mettre à jour les éléments affichés dans l'interface graphique
	 * @param nb1 - Nombre du haut
	 * @param nb2 - Nombre entre le milieu et le haut
	 * @param nb3 - Nombre du milieu
	 * @param nb4 - Nombre entre le milieu et le bas
	 * @param nb5 - Nombre du bas
	 */
	public void update(String nb1,String nb2,String nb3,String nb4,String nb5);
	/**
	 * permet de mettre à jour la valeur actuelle
	 * @param chaine
	 */
	public void update_valeurActuelle(String chaine);
}