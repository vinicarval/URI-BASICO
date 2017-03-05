import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String entrada = br.readLine();
        String[] valores = entrada.split(" ");
        
        int a,b,c,d;
        a=Integer.parseInt(valores[0]);
        b=Integer.parseInt(valores[1]);
        c=Integer.parseInt(valores[2]);
        d=Integer.parseInt(valores[3]);
        if(b>c && d>a && c+d>a+b && c>=0 && d>=0 && a%2==0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("");
        }
        

    }
    
}
