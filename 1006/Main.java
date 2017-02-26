import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        Double a;
        Double b;
        Double c;
        Double MEDIA;
        a = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());
        c = Double.parseDouble(br.readLine());
        
        MEDIA = (a*2/10) + (b*3/10) + (c*5/10);
        
        System.out.printf("MEDIA = %.1f\n", MEDIA);    
    }
}