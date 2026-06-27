package exercicios_01;

public class Administrador extends Usuario{

	
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

	
	
		 @Override
		 public void visualizar() {

		     super.visualizar();

		     System.out.printf("**      Nivel de Acesso: %s%n", this.getNivelDeAcesso());

		     System.out.println("*****************************************************");
	 
	

	 }

}
