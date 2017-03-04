import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String valores1 = br.readLine();      
        String[] arrayValores1 = valores1.split(" ");
        Double x1 = Double.parseDouble(arrayValores1[0]);
        Double y1 = Double.parseDouble(arrayValores1[1]);

        String valores2 = br.readLine();      
        String[] arrayValores2 = valores2.split(" ");
        Double x2 = Double.parseDouble(arrayValores2[0]);
        Double y2 = Double.parseDouble(arrayValores2[1]);
        
       
        
        System.out.printf("%.4f\n", Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1))));

    }
}

