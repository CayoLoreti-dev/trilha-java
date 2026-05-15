public class Array {
    public static void main(String[] args) {
        //Declaração de Array
        int[] numeros = { 10,30,30,40,50,1};
        String[] frutas;

        frutas = new String[]{"Maçã", "Banana", "Laranja"};

        double[] salarios = new double [5];
        salarios[2] = 500.00;
        salarios[1] = 600.00;
        salarios[3] = 800.00;
        salarios[0] = 150.00;
        for(int posicao = 3; posicao <salarios.length; posicao++){
            System.out.println(salarios[posicao]);
        }
    }
}
