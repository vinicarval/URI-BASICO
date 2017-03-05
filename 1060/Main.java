import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        Double[] entradas = new Double[6];
        int qtd=0;
        for (int i=0;i<6;i++){
            entradas[i] = Double.parseDouble(br.readLine());
            
            if(entradas[i]>0){
                qtd++;
            }
        }
        
        System.out.println(qtd+" valores positivos");
    }
    
}
