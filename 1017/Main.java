import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);      
        
        int t = Integer.parseInt(br.readLine());
        int vm = Integer.parseInt(br.readLine());
        Double res = vm*t/12.0;
        System.out.printf("%.3f\n", res);
    }
}