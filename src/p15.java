import java.io.*;
import java.util.*;

public class p15{
    public static void main(String args[])throws Exception{
        Scanner scin = new Scanner(System.in);
        int a=0, b=0, c=0, t=0,x=0;
        t = scin.nextInt();
        do{
            String str = scin.next();
            for (int i=0; i<str.length();i++){
                if(str.charAt(i)=='(') a=a+1;
                if(str.charAt(i)=='[') b=b+1;
                if(str.charAt(i)==')') {
                    if(a==0){
                        x=x+1;
                    }else if (str.charAt(i-1)=='['&&i<=str.length()-1) {
                        x=x+1;
                        a=a-1;
                        b=b-1;
                    }else{
                        a=a-1;
                    }
                }
                if(str.charAt(i)==']') {
                    if(b==0){
                        x=x+1;
                    }else if (str.charAt(i-1)=='('&&i<=str.length()-1) {
                        x=x+1;
                        a=a-1;
                    }else{
                        b=b-1;
                    }
                }
            }
            System.out.println(a+b+x);
            c++;
            a=0;
            b=0;
            x=0;
        }while (c<t);
    }
}
