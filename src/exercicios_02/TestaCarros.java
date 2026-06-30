package exercicios_02;

import java.util.Scanner;

public class TestaCarros {

    public static void main(String[] args) {

    	Scanner leia = new Scanner(System.in);
        // TESTE INVALIDO E-MAIL
        try {
            Carros carro = new Carro("Opala", "100");
            carro.visualizar();
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro Usuario 1: " + e.getMessage());
            
        
     
        }
    
        leia.close();
    }
    
}