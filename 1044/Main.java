
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        
        String valores = br.readLine();
        String[] valor = valores.split(" ");
        int a = Integer.parseInt(valor[0]);
        int b = Integer.parseInt(valor[1]);
        
        if(a >= b && a%b==0){
            System.out.println("Sao Multiplos");
        }
        else if(b>=a && b%a==0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
        
    }
    
}
