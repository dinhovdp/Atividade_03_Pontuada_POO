package exercicios_02;

public class Validacao {

    // Valida nome: aceita letras (com acentos), números e espaços.
    public static void validarNome(String modelo) {
        if (modelo == null || modelo.trim().isEmpty() || !modelo.matches("[A-Za-z0-9À-ÿ\\s]{2,}")) {
            throw new IllegalArgumentException("\u001B[31m\nNome do Modelo inválido! Use apenas letras, números e espaços."
                    + "\n**************************************************\u001B[0m");
        }
    }

    // Valida velocidade: aceita apenas números positivos
    public static void validarVelocidade(String velocidade) {
        if (velocidade == null || velocidade.trim().isEmpty() || !velocidade.matches("\\d+")) {
            throw new IllegalArgumentException("\u001B[31m\nDigite uma velocidade válida! Use apenas números."
                    + "\n*******************************\u001B[0m");
        }
    }
}