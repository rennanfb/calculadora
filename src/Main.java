import br.com.alura.calculadora.modelos.Calculo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resposta;

        Calculo calculadora = new Calculo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tipo de operação a ser realizada?");
        System.out.println("Digite o numero:");
        System.out.println("1 para Soma / 2 para Subtração / 3 para Multiplicação / 4 para Divisão");

        resposta = scanner.nextInt();

        if (resposta == 1) {
            System.out.println("Qual valor será somado ao proximo?");
            calculadora.valorA = scanner.nextDouble();
            System.out.println(calculadora.valorA + " deve ser somado com qual numero?");
            calculadora.valorB = scanner.nextDouble();
            calculadora.soma(calculadora.valorA, calculadora.valorB);

        } else if (resposta == 2) {
            System.out.println("Qual valor será subtraido pelo proximo?");
            calculadora.valorA = scanner.nextDouble();
            System.out.println(calculadora.valorA + " deve ser subtraido por qual numero?");
            calculadora.valorB = scanner.nextDouble();
            calculadora.subtrai(calculadora.valorA, calculadora.valorB);

        } else if (resposta == 3) {
            System.out.println("Qual valor será multiplicado pelo proximo?");
            calculadora.valorA = scanner.nextDouble();
            System.out.println(calculadora.valorA + " deve ser multiplicado por qual numero?");
            calculadora.valorB = scanner.nextDouble();
            calculadora.multiplica(calculadora.valorA, calculadora.valorB);

        } else if (resposta == 4) {
            System.out.println("Qual valor será dividido pelo proximo?");
            calculadora.valorA = scanner.nextDouble();
            System.out.println(calculadora.valorA + " deve ser divido por qual numero?");
            calculadora.valorB = scanner.nextDouble();
            calculadora.divide(calculadora.valorA, calculadora.valorB);

        } else {
            System.out.println("Operação não identificada");

        }

        resposta = 0;

        while (resposta != 5) {
            System.out.println("Resultado:" + calculadora.resultado);
            System.out.println("Deseja continuar operando esse valor?");
            System.out.println("Digite");
            System.out.println("1 para Soma / 2 para Subtração / 3 para Multiplicação / 4 para Divisão / 5 para Finalizar");

            resposta = scanner.nextInt();

            if (resposta == 1) {
                System.out.println("Qual o valor a ser acrescentado ao total " + calculadora.resultado + " ?");
                calculadora.soma(calculadora.resultado, scanner.nextDouble());

            } else if (resposta == 2) {
                System.out.println("Qual o valor a ser subtraido do total " + calculadora.resultado + " ?");
                calculadora.subtrai(calculadora.resultado, scanner.nextDouble());

            } else if (resposta == 3) {
                System.out.println("Qual o valor a ser multiplicado pelo total " + calculadora.resultado + " ?");
                calculadora.multiplica(calculadora.resultado, scanner.nextDouble());

            } else if (resposta == 4) {
                System.out.println("Dividir o total " + calculadora.resultado + " por qual valor ?");
                calculadora.divide(calculadora.resultado, scanner.nextDouble());

            } else if (resposta == 5){
                System.out.println("Operação finalizada");
            }
        }

        System.out.println("Resultado final das operações: " + calculadora.resultado);

    }
}