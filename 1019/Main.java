
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(str);
        
        int valor = Integer.parseInt(br.readLine());
        boolean flag = true;
        int hora=0;
        int minuto=0;
        int segundo=0;
        
        while (flag == true){
            if(valor == 0){
                flag = false;
                continue;
            }
            
            if(valor>=3600){
                hora+=1;
                valor -=3600;
            }
            if(valor>=60){
                minuto+=1;
                valor -=60;
            }
            if(valor<60){
                segundo+=1;
                valor -=1;
            }
        }
        
        System.out.println(hora+":"+minuto+":"+segundo);
        
    }
    
}
