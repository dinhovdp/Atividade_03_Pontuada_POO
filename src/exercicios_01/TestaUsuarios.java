package exercicios_01;

import java.util.Scanner;

public class TestaUsuarios {

    public static void main(String[] args) {

    	Scanner leia = new Scanner(System.in);
        // TESTE INVALIDO E-MAIL
        try {
            Usuario usuario = new Usuario("Rosenildo", "Ro.zenildo@email@.com");
            usuario.visualizar();
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro Usuario 1: " + e.getMessage());
            
        }

        // TESTE INVALIDO E-MAIL
        try {
            Usuario usuario1 = new Usuario("Lilian", "@email.com");
            usuario1.visualizar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro Usuario 2: " + e.getMessage());
        }

        // TESTE OK
        try {
            Usuario usuario2 = new Usuario("Edson", "edshow.10@email.com");
            usuario2.visualizar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro Usuario 3: " + e.getMessage());
        }

        // TESTE OK
        try {
            Usuario usuario3 = new Usuario("Yoga", "execucao.aurora@titanic.com");
            usuario3.visualizar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro Usuario 4: " + e.getMessage());
        }

        // TESTE OK
        try {
            Administrador admin = new Administrador("Naruto", "proximo.hokage@viladafolha.org", "ADMIN");
            admin.visualizar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro Admin 1: " + e.getMessage());
        }

        // TESTE OK
        try {
            Administrador admin2 = new Administrador("Seiya", "meteoro.de.pegasus@deusa.Atena.ong", "ADMIN");
            admin2.visualizar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro Admin 2: " + e.getMessage());
        }

        // TESTE ERRO DE NOME
        try {
            Administrador admin3 = new Administrador(".", "anonimo@stealth.off", "ADMIN");
            admin3.visualizar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro Admin 3: " + e.getMessage());
        }
    
        leia.close();
    }
    
}