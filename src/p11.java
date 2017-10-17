import java.io.*;
import java.util.*;

public class p11{
    public static void main(String args[])throws Exception{
        Scanner scin = new Scanner(System.in);
        int i = scin.nextInt(),j=0,n=0,d=0;
        do{
            n = scin.nextInt();
            for (d=1;d<=n;d=d+2){
                System.out.print(d + " ");
            }
            System.out.println();
            for (d=2;d<=n;d=d+2){
                System.out.print(d + " ");
            }
            System.out.println('\n');
            j=j+1;
        }while(j<i);
    }
}
