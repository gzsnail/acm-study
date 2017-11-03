import java.io.*;
import java.util.*;
import java.math.*;

public class p69 {
    public static void main(String args[]) throws Exception{
        Scanner scin = new Scanner(System.in);
        int i = scin.nextInt(), j = 0, t=0;
        double PI=Math.PI;
        double e=Math.E;
        do{
            t = scin.nextInt();
            int x = (int) Math.floor(Math.log10(Math.sqrt(2*PI*t))+t*Math.log10(t/e));
            System.out.println(x+1);
            j = j+1;
        }while(j<i);
    }
}