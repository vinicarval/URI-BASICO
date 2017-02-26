import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int numero;
        int horas;
        Double valor;
        Double salario;
        numero = Integer.parseInt(br.readLine());
        horas = Integer.parseInt(br.readLine());
        valor = Double.parseDouble(br.readLine());

        salario = horas*valor;
        
        System.out.println("NUMBER = " + numero); 
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
