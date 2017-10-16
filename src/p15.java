import java.io.*;
import java.util.*;

public class p2{
    public static void main(String args[])throws Exception{
        Scanner scin = new Scanner(System.in);
        int a=0, b=0, c=0, t=0;
        t = scin.nextInt();
        do{
            String str = scin.nextString();
            for (int i=0; i<str.length();i++){
                if(str.charAt(i)=='(') a=a+1;
                if(str.charAt(i)==')') a=a-1;
                if(str.charAt(i)=='[') b=b+1;
                if(str.charAt(i)==']') b=b-1;
            }
            if(a<0)a=a*(-1);
            if(b<0)b=b*(-1);
            System.out.println(a+b);
            c++;
            a=0;
            b=0;
        }
    }while (c<t)
}