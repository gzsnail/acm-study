import java.io.*;
import java.util.*;

public class p74 {
    public static void main(String args[])throws Exception{
        Scanner scin = new Scanner(System.in);
        int m = scin.nextInt(), n = scin.nextInt();
        int m1,m2,m3,n1,n2,n3,t,t1,t2;
        do{
            t = 0;
            t1 = 0;
            t2 = 0;
            m1 = m / 100;
            m2 = (m - m1 * 100 ) / 10;
            m3 = m - m1 * 100 - m2 * 10;
            n1 = n / 100;
            n2 = (n - n1 * 100 ) / 10;
            n3 = n - n1 * 100 - n2 * 10;
            if(m3+n3>9)t1=1;
            if(m2+n2+t1>9)t2=1;
            if(m1+n1+t2>9)t=1;
            t = t + t1 + t2;
            System.out.println(t);
            m = scin.nextInt();
            n = scin.nextInt();
        }while(m!=0&&n!=0);
    }
}
