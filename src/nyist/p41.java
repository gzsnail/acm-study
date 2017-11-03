import java.io.*;
import java.util.*;

public class p41 {
    public static void main(String args[]) throws Exception{
        Scanner scin = new Scanner(System.in);
        int a = scin.nextInt(),b = scin.nextInt(), c = scin.nextInt();
        int temp = 0;
        if (a>b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a>c){
            temp = a;
            a = c;
            c = temp;
        }
        if(b>c){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
