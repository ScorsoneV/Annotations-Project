package mypackage;

public class Parent {
	
	private String name;

	public Parent() {
		this.name = this.getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/* Questa annotazione indica che l'elemento a cui � applicata � stato deprecato 
	 * e non dovrebbe pi� essere utilizzato. Il compilatore generer� un warning quando
	 * si tenter� di utilizzare questo metodo. In genere viene utilizzata quando si 
	 * apportano dei miglioramenti alla classe. 
	 * */
	@Deprecated
	public void showType() {
		String type=name;
		System.out.println("I'm "+type);
	}
	

	public void show() {
		System.out.println("I'm "+name);
	}
}
