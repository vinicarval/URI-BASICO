
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        
        String valores = br.readLine();
        String[] valor = valores.split(" ");
        
        double x = Double.parseDouble(valor[0]);
        double y = Double.parseDouble(valor[1]);
        
        if(x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if(x==0 && y!=0){
            System.out.println("Eixo X");
        }
        else if(x!=0 && y==0){
            System.out.println("Eixo Y");
        }
        else if(x>0 && y>0){
            System.out.println("Q1");
        }
        else if(x<0 && y>0){
            System.out.println("Q2");
        }
        else if(x<0 && y<0){
            System.out.println("Q3");
        }
        else if(x>0 && y<0){
            System.out.println("Q4");
        }
    }
    
}

