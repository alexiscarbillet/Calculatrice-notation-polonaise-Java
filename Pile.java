import java.util.Stack;
public class Pile extends Stack<String>{
	// h�rite directement des m�thodes get, pop et push
	public Pile() {
		super();
	}
	/**
	 * enl�ve le dernier nombre de la pile
	 */
	public void drop() { // comme le pop mais n'affiche pas la valeur
		if(!this.isEmpty()) {
			 this.pop();
		}
	}
}