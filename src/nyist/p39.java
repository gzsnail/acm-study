import java.io.*;
import java.util.*;

public class p39{
    public static void main(String args[]) throws Exception{
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b1,b2,b3;
        while (a!=0){
            b1 = a/100;
            b2 = (a-b1*100)/10;
            b3 = a-b1*100-b2*10;
            if (a==b1*b1*b1+b2*b2*b2+b3*b3*b3)
            {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            a = cin.nextInt();
        }
    }
}
