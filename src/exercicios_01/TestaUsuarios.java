package exercicios_01;

public class TestaUsuarios {

    public static void main(String[] args) {

    	Usuario usuario = new Usuario("Rosenildo", "Ro.zenildo@email@.com");
        usuario.visualizar();
    	
        Usuario usuario1 = new Usuario("Edson", "edshow.10@email.com");
        usuario1.visualizar();

        Administrador admin = new Administrador("Stefanne", "stefy.20@email.com", "ADMIN");
        admin.visualizar();

    }
}