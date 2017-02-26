import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String nome;
        Double salario;
        Double bonus;
        nome = br.readLine();
        salario = Double.parseDouble(br.readLine());
        bonus = Double.parseDouble(br.readLine());

        salario += bonus * 0.15;
        
        System.out.printf("TOTAL = R$ %.2f\n", salario);
    }
}
