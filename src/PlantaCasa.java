public class PlantaCasa {
    //Atributos
    int metragem;
    int quantidadeQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("Metragem: " + metragem);
        System.out.println("QuantidadeQuartos: " + quantidadeQuartos);
        System.out.println("NumeroBanheiros: " + numeroBanheiros);
        System.out.println("Cor: " + cor);
        System.out.println("Material: " + material);


    }
    public void pintar(){
        System.out.println("a casa foi pintada de " + cor);
    }
}
