import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);      
        
        int valor = Integer.parseInt(br.readLine());
        int valorIni = valor;
        boolean flag = true;
        int notaCem=0;
        int notaCinq=0;
        int notaVin=0;
        int notaDez=0;
        int notaCinc=0;
        int notaDois=0;
        int notaUm=0;
        
        
        while (flag == true){
            if(valor == 0){
                flag = false;
                continue;
            }
            
            if( valor>=100 ){
                notaCem += 1;
                valor -=100;
                continue;
            }
            if( valor>=50 ){
                notaCinq += 1;
                valor -=50;
                continue;
            }
            if( valor>=20 ){
                notaVin += 1;
                valor -=20;
                continue;
            }
            if( valor>=10 ){
                notaDez += 1;
                valor -=10;
                continue;
            }
            if( valor>=5 ){
                notaCinc += 1;
                valor -=5;
                continue;
            }
            if( valor>=2 ){
                notaDois += 1;
                valor -=2;
                continue;
            }
            if( valor>=1 ){
                notaUm += 1;
                valor -=1;               
            }      
        }
        System.out.println(valorIni);
        System.out.println(notaCem + " nota(s) de R$ 100,00");
        System.out.println(notaCinq+ " nota(s) de R$ 50,00");
        System.out.println(notaVin+ " nota(s) de R$ 20,00");
        System.out.println(notaDez+ " nota(s) de R$ 10,00");
        System.out.println(notaCinc+ " nota(s) de R$ 5,00");
        System.out.println(notaDois+ " nota(s) de R$ 2,00");
        System.out.println(notaUm+ " nota(s) de R$ 1,00");
    }
}
