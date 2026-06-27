package exercicios_01;

public abstract class Administrador extends Usuario{

	
		
		public Administrador(String nome, String email) {
			super(nome, email);
		
	}
		private	String nivelDeAcesso;
			
	 public Administrador(String nome, String email, String nivelDeAcesso) {
			super(nome, email);
				this.nivelDeAcesso = nivelDeAcesso;
		}

	 public String getNivelDeAcesso() {
		 return nivelDeAcesso;
	 }

	 public void setNivelDeAcesso(String nivelDeAcesso) {
		 this.nivelDeAcesso = nivelDeAcesso;
	 }

	
	 public void visualizar() {
	
			System.out.println("*****************************************************");
			System.out.println("**		DADOS DE USUARIOS			   **");
			System.out.println("*****************************************************");
			
			System.out.printf("**		Nivel de Acesso: %s %s", this.nivelDeAcesso);
			
			System.out.println("*****************************************************");

	 }

}
