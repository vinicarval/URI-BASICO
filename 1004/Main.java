import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int a;
        int b;
        int PROD;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        
        PROD = a*b;
        
        System.out.println("PROD = "+PROD);    
    }
}
