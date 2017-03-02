import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int n;
        int in=0;
        int out=0;
        
        n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        
        for(int i = 0; i<n; i++){
            array[i] = Integer.parseInt(br.readLine());
            
            if(array[i]>=10 && array[i]<=20){
                in +=1;
            }
            else{
                out +=1;
            }
        }
        
        
        
        System.out.println(in +" in");
        System.out.println(out +" out");
    }
}