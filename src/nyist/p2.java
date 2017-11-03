import java.io.*;
import java.util.*;

public class p2{
    public static void main(String args[])throws Exception{
        Scanner scin = new Scanner(System.in);
        int a=0, b=0, c=0, t=0;
        t = scin.nextInt();
        do{
            String str = scin.next();
            for (int i=0; i<str.length();i++){
                if(str.charAt(i)=='('){
                    a=a+1;
                    if(i+1<str.length()&&str.charAt(i+1)==']')a=a+1;
                }
                if(str.charAt(i)==')') a=a-1;
                if(str.charAt(i)=='['){
                    b=b+1;
                    if(i+1<str.length()&&str.charAt(i+1)==')')b=b+1;
                }
                if(str.charAt(i)==']') b=b-1;
            }
            if(a==0&&b==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            c++;
            a=0;
            b=0;
        }while (c<t);
    }
}
