package bootcamp;
/*Desafio
Leia 1 valor inteiro N, que representa o n�mero de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a m�dia ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada cont�m um valor inteiro N na primeira linha. Cada N linha a seguir cont�m um caso de teste com tr�s valores com uma casa decimal cada valor.

Sa�da
Para cada caso de teste, imprima a m�dia ponderada dos 3 valores, conforme exemplo abaixo.

 
Exemplo de Entrada	Exemplo de Sa�da
3
6.5 4.3 6.2
5.1 4.2 8.1
8.0 9.0 10.0

5.7
6.3
9.3*/
import java.util.Scanner;
 
public class SpringExperience
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
        int casos = sc.nextInt();
        int cont = 0;
        while (cont < casos){
 
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
	        double media = ((a*2)+(b*3)+(c*5))/10;
	        System.out.println(String.format("%.1f", media));
            cont++;
            
            }
        sc.close();
    }
    }