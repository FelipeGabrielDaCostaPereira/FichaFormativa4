package ps1.o.m17b_fichaformativa1;

import java.util.Random;

public class M17B_FichaFormativa1 {

    public static void main(String[] args) {
        double k, x=0, y=0, z=0.3;
        do{
            k=10+z;
            while(k>0){
                k = k-0.1;
                x = k;
                y = x+k;
            }
            while(y>0){
                y= y-0.1;
                x= x-y;
            }
            k = x+y;
            z = z-0.1;
        }while(z>0);
        
        System.out.println("FIM");
    }
}
