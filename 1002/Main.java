package br.edu.principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de Raio ao quadrado e multiplicando por π.

Entrada

A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída

Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. 
* Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, 
* caso contrário, você receberá "Presentation Error".
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        double pi = 3.14159;
        double raio;
        raio = Double.parseDouble(br.readLine());
        
        double area = pi*(raio*raio);
        
        System.out.printf("A=%.4f\n", area);
        
        
    }
 
}
