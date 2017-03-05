import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        Double[] a = new Double[100];

        for (int i=0;i<100;i++){
            a[i] = Double.parseDouble(br.readLine());
        }
        
        for (int i=0;i<100;i++){
            if(a[i]<=10){
                System.out.println("A["+i+"] = "+a[i]);
            }
        }
    }
    
}
