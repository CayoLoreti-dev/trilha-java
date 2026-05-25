public class Casa {
    public static void main(String[] args) {
        //Criando um objeto casa
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variáveis)
        casa.numeroBanheiros = 2;
        casa.quantidadeQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor  = "Cinza";

        //Chamada da função
        casa.construir();

        casa.pintar();
    }
}
