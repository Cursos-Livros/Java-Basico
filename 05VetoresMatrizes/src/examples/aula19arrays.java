package examples;

public class aula19arrays {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];

        // acessar posicoes
        temperaturas[0] = 30.0;

        // printar a posicao
        System.out.println(temperaturas[0]);

        // tamanho do array
        System.out.println(temperaturas.length);
    }
}
