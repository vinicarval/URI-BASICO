import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String primeira = br.readLine();
        String segunda = br.readLine();
       
        String[] primeiraPeca = primeira.split(" ");
        String[] segundaPeca = segunda.split(" ");
        
        int cod1 = Integer.parseInt(primeiraPeca[0]);
        int qtd1 = Integer.parseInt(primeiraPeca[1]);
        Double valor1 = Double.parseDouble(primeiraPeca[2]);
        
        int cod2 = Integer.parseInt(segundaPeca[0]);
        int qtd2 = Integer.parseInt(segundaPeca[1]);
        Double valor2 = Double.parseDouble(segundaPeca[2]);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (qtd1*valor1 + qtd2*valor2));
        
        
        
    }
}