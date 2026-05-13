public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "João";
        String sobrenome = " Da Silva";
        String nomeCompleto = nome.concat(sobrenome);
        int TamanhoDaString = nome.length();



        System.out.println("Olá " + nome + " seu nome tem " + TamanhoDaString + " caracteres.");
        System.out.println("Seu nome completo é " + nomeCompleto);
    }
}