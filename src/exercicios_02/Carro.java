package exercicios_02;

import exercicios_01.Validacao;

public class Carro {


	/* ATRIBUTOS DA CLASSE
	 * modificadores de Acesso será " private " deve ser colocado antes do tipo da variavel
	 */
	
		
		private String modelo;
		private Integer velocidade;
		
				
	/*Metodo construtor - Gerar as intancias (objetos) da Classe
	 *  Generete constructor fields
	 */
		
		public Carro(String modelo, Integer velocidade) {
			
			//Validacao ANTES de pedir o atributo	
			Validacao.validarModelo(modelo);
		    Validacao.validarVelocidade(velocidade);
		    
		    
			
			this.modelo = modelo;	
			this.velocidade = velocidade;
			  
		}

		/* SouRce - Generate getts and setters - select all 
		 * 
		 */

		/* metodo Get, consegue visualizar 
		 * metodo Set Modificar os dados
		 */

	
		
		//23-06 polimorfismo - sobreescrita de um novo meotodo
		
		

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public Integer getVelocidade() {
			return velocidade;
		}

		public void setVelocidade(Integer velocidade) {
			this.velocidade = velocidade;
		}

		
		
		
public void visualizar() {
			
			
		
		
				System.out.println("\n****************************************************");
				System.out.println("*****************************************************");
				System.out.println("**		DADOS DO CARRO		  **");
				System.out.println("*****************************************************");
				System.out.printf("**	Nome do Carro: %s \n", this.modelo);
				System.out.printf("**	Indice de Velocidade: %f \n", this.velocidade);
				;
		
		}
}
