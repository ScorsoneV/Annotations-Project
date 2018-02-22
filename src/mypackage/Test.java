package mypackage;

public class Test {
	
	/* Questa annotazione viene semplicemente utilizzata per non far segnalare al compilatore
	 * un determinato warning. In questo esempio viene utilizzata per non segnalare il fatto
	 * che alla riga 15 viene utilizzato il metodo showType() che è stato deprecato nella 
	 * classe Parent*/
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent firstInstance= new Parent();
		Parent secondInstance= new Son();
		
		firstInstance.showType();
		firstInstance.show();
		secondInstance.show();
		
	}

}
