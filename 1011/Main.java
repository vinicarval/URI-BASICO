import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        Double raio = Double.parseDouble(br.readLine());
        Double pi = 3.14159;
       
              
        System.out.printf("VOLUME= %.3f\n", ((4.0/3) * pi * (raio*raio*raio)));  
    }
}