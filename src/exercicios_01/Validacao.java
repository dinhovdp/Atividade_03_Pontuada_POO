package exercicios_01;

public class Validacao  {

		
		  
			public static void validarNome(String nome) {
				if (nome == null  || nome.trim().isEmpty() ||!nome.matches("[A-Za-zÀ-ÿ\\s]{2,}"))
					throw new IllegalArgumentException("\u001B[31m\nNome não pode ser vazio ou com caractere especial!"
							+ "\n******************************\u001B[0m ");
			}
			
			public static void validarEmail(String email) {
				if (email == null || !email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$"))
					throw new IllegalArgumentException("\u001B[31m\nDigite um e-mail válido!\n"
							+ "*******************************\u001B[0m");
		}
		
			
}