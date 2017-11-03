import java.io.*;
import java.util.*;

public class p28{
    public static void main(String args[])throws Exception{
        Scanner scin = new Scanner(System.in);
        int i = scin.nextInt(),j=1;
        double x=1;
        do{
            x=x*j;
            j=j+1;
        }while (j<=i);

        System.out.println(String.valueOf(x));
    }
}
