import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String valores = br.readLine();
        
        String[] arrayValores = valores.split(" ");
        Double a = Double.parseDouble(arrayValores[0]);
        Double b = Double.parseDouble(arrayValores[1]);
        Double c = Double.parseDouble(arrayValores[2]);
        Double pi = 3.14159;
         
        System.out.printf("TRIANGULO: %.3f\n", ((a*c)/2));
        System.out.printf("CIRCULO: %.3f\n", pi*(c*c));
        System.out.printf("TRAPEZIO: %.3f\n", ((a+b)*c)/2);
        System.out.printf("QUADRADO: %.3f\n", b*b);
        System.out.printf("RETANGULO: %.3f\n", a*b);
    }
}
