import java.io.*;
import java.util.*;

public class p84 {
    public static void main(String args[]) throws Exception{
        Scanner scin = new Scanner(System.in);
        int i = scin.nextInt(),j=0;
        int m = 0,n = 5,t=0;
        do{
            m = scin.nextInt();
            do{
                m = m / n;
                t = t + m;
            }while(m>1);
            System.out.println(t);
            j = j + 1;
            n = 5;
            t = 0;
        }while(j<i);
    }
}
