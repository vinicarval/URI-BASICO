import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int km = Integer.parseInt(br.readLine());
        Double litro = Double.parseDouble(br.readLine());
         
        
        System.out.printf("%.3f km/l\n",km/litro);

    }
}

