package exercicios_01;

public class TestaUsuarios {

    public static void main(String[] args) {

    	
    	try {
    		Usuario usuario = new Usuario("Rosenildo", "Ro.zenildo@email@.com");
            usuario.visualizar();
    	} catch (IllegalArgumentException e) {
    	    System.out.println("Erro: " + e.getMessage());
    	    
    	 try {
    		 Usuario usuario1 = new Usuario("Lilian", "@email.com");
    		 	usuario1.visualizar();
    	 			} catch (IllegalArgumentException e) {
    	 				System.out.println("Erro: " + e.getMessage());
    	    
    	 try { 
    		 Usuario usuario2 = new Usuario("Edson", "edshow.10@email.com");
    		 	usuario2.visualizar();
    	 			} catch (IllegalArgumentException e) {
    	 				System.out.println("Erro: " + e.getMessage());
    	    
    	 try {  
    		 Usuario usuario3 = new Usuario("Yoga", " execução.aurora@titanic.com");
    		 	usuario3.visualizar();
    	 			} catch (IllegalArgumentException e) {
    	 				System.out.println("Erro: " + e.getMessage());
            
    	 try {  
    		 Administrador admin = new Administrador ("Naruto", " proximo.hokage@viladafolha.org", "ADMIN");
    		 	admin.visualizar();
    	 			} catch (IllegalArgumentException e) {
    	 				System.out.println("Erro: " + e.getMessage());
            
    	 try {  
    		 Administrador admin2 = new Administrador("Seiya", "meteoro.de.pegasus@deusa.Atena.ong", "ADMIN");
            	admin2.visualizar();
    	 			} catch (IllegalArgumentException e) {
    	 				System.out.println("Erro: " + e.getMessage());
    	    
    	    
    	 try {  
    		 Administrador admin3 = new Administrador(".", "anonimo@stealth.off", "ADMIN");
    		 	admin3.visualizar();        
    	 			} catch (IllegalArgumentException e) {
    	 				System.out.println("Erro: " + e.getMessage());
    	}
    }
}
    	
    	
      

    
