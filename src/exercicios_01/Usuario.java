package exercicios_01;

public  class Usuario {


	/* ATRIBUTOS DA CLASSE
	 * modificadores de Acesso será " private " deve ser colocado antes do tipo da variavel
	 */
	
		private String nome = "";
		private String email = "";
		
				
	/*Metodo construtor - Gerar as intancias (objetos) da Classe
	 *  Generete constructor fields
	 */
		
		public Usuario(String nome, String email) {
			this.nome = nome;
			this.email = email;
			
		}

		/* SouRce - Generate getts and setters - select all 
		 * 
		 */

		/* metodo Get, consegue visualizar 
		 * metodo Set Modificar os dados
		 */

		public String getNome() {
			return nome;
			
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEmail() {
			return email;
			
		}


		public void setEmail(String email) {
			this.email = email;
		}
		
		
		//23-06 polimorfismo - sobreescrita de um novo meotodo
		
		public void visualizar() {
			
			//para facilitar a visualização para o usuario vamos usar...
			
		
	
			/* METODO RELACIONADO AO OBJETO
			 * 
			 */
		
		
				
				System.out.println("*****************************************************");
				System.out.println("**		DADOS DE USUARIOS			   **");
				System.out.println("*****************************************************");
				System.out.printf("**		Nome do Usuario: %s %s", this.nome);
				System.out.printf("**		Dados  do e-mail: %s %s", this.email);
				System.out.println("*****************************************************");
		
		}

}
