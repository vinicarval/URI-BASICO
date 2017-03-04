import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String valores = br.readLine();
        
        String[] arrayValores = valores.split(" ");
        int a = Integer.parseInt(arrayValores[0]);
        int b = Integer.parseInt(arrayValores[1]);
        int c = Integer.parseInt(arrayValores[2]);
        Double pi = 3.14159;
         
        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorBC = (b+c+Math.abs(b-c))/2;
        
        System.out.println(((maiorAB+maiorBC+Math.abs(maiorAB-maiorBC))/2) + " eh o maior");

    }
}

