public class TiposVariaveis {
    
    public static void main(String[] args) throws Exception { //acessivel a qualquer classe. 
        //(String[] args) main aceita um argumento de strings chamado args -> programa recebe informações de linha de comando quando executado -> armazenados no args.
        // throws exception indica uma execuçãoio do tipo exception -> anormal ou um rtto que ocorre durante a execução do programa
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;

        System.err.println(VALOR_DE_PI);

    }
    }