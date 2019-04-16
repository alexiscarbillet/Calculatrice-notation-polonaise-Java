import java.util.Stack;
public class Pile extends Stack<String>{
	// hérite directement des méthodes get, pop et push
	public Pile() {
		super();
	}
	/**
	 * enlève le dernier nombre de la pile
	 */
	public void drop() { // comme le pop mais n'affiche pas la valeur
		if(!this.isEmpty()) {
			 this.pop();
		}
	}
}