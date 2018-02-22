package mypackage;

public class Son extends Parent {

	public Son() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* Viene utilizzata quando si va l'override di un metodo nella classe figlia. 
	 * Il suo utilizzo comporta due vantaggi: 
	 * - Se c'è un errore nella signature del metodo il compilatore genera un warning. 
	 * Senza il suo utilizzo viene creato un nuovo metodo al posto di fare l'override dell'altro.
	 * - Favorisce la leggibilità del codice. Così se si cambia la signature nel metodo della 
	 * classe padre verrà generato un warning in tutte le classi figlie che fanno l'override
	 * del metodo
	 * */
	@Override
	public void show() {
		System.out.println("I'm sub-class "+this.getName());
	}
	
}
