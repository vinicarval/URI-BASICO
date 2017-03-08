
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        
        String valores = br.readLine();
        String[] valor = valores.split(" ");
        
        int id = Integer.parseInt(valor[0]);
        int qtd = Integer.parseInt(valor[1]);
        Double total = 0.00;
        switch(id){
            case 1:
                total = qtd*4.00;
                break;
            case 2:
                total = qtd*4.50;
                break;
            case 3:
                total = qtd*5.00;
                break;
            case 4:
                total = qtd*2.00;
                break;
            case 5:
                total = qtd*1.50;
                break;            
        }
        
        System.out.printf("Total: R$ %.2f\n", total);
        
    }
    
}
