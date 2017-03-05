import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int idadeDias = Integer.parseInt(br.readLine());
        boolean flag = true;
        int ano=0;
        int mes=0;
        int dia=0;
        
        while (flag == true){
            if(idadeDias == 0){
                flag = false;
                continue;
            }
            
            if(idadeDias>=365){
                ano+=1;
                idadeDias -=365;
                continue;
            }
            if(idadeDias>=30){
                mes+=1;
                idadeDias -=30;
                continue;
            }
            if(idadeDias<30){
                dia+=1;
                idadeDias -=1;
            }
        }
        
        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dia+" dia(s)");
    }
    
}
