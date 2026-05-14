public class EstruturaIfElse {
    public static void main(String[] args) {
//        int idade = 15;
//
//        if(idade >= 18) {
//            System.out.println("Você é maior de idade. ");
//        }
//        else {
//            System.out.println("Você é menor de idade. ");
//        }

//        boolean estaChovendo = false;
//
//        if(!estaChovendo) {
//            System.out.println("Vamos sair para rua. ");
//        }
//
//        else {
//            System.out.println("Vamos ficar em casa . ");
//        }
        boolean temDinheiro = false;
        boolean temCartao = false;

        if(temDinheiro && temCartao) {
            System.out.println("Pede um ifood e 99");

        }
        else if (temDinheiro || temCartao) {
            System.out.println("Pede um ifood");

        }
        else {
            System.out.println("engole cuspe");
        }
        String mensagem = (temDinheiro) ? "Pede ifood" : "come reboco de parede";
        System.out.println(mensagem);
    }

}
