import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        Double a;
        Double b;
        Double MEDIA;
        a = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());
        
        MEDIA = (a*3.5/11) + (b*7.5/11);
        
        System.out.printf("MEDIA = %.5f\n", MEDIA);    
    }
}
